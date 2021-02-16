/*
Mini Project 1
Group #4: Mitchell Wagner, Gabrielle Nielsen, Eddie Frishgesell, Kiley Hardcorn
Date: 2/16/21
*/



import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   Random r = new Random();
    System.out.println("Welcome to the guessing game! ");
    System.out.println("Please enter any positive whole number: ");
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated ");
    playGame(userNum, randomNum);

  }
  static void playGame(int theUserNum, int theNumGuess){
    System.out.println("Please guess a number between 0 and " + theUserNum );
    Scanner sc = new Scanner(System.in);
    int userGuess = sc.nextInt();
    int numTries = 1;
    while (userGuess != theNumGuess){
    
      if (userGuess>theNumGuess){
        System.out.println("Guess Lower!");
        System.out.println("Enter your new guess: ");
       userGuess = sc.nextInt();
       numTries++;}
      
      else if(userGuess<theNumGuess){
        System.out.println("Guess Higher!");
        System.out.println("Enter your new guess: ");
       userGuess = sc.nextInt();
       numTries++;
      }}
    System.out.println("Great, you win! It took you " + numTries + " tries");
  }
  }
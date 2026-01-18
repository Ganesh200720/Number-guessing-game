//import java.util.*;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random r=new Random();
        int NumberToGuess = r.nextInt(100)+1;
        int attempts=0;
        int userguess=0;
        System.out.println("Welcome to number guessing game!");
        System.out.println("Guess a number between 1 and 100");
        while(userguess!=NumberToGuess){
            System.err.println("Enter your guess : ");
            userguess=scanner.nextInt();
            attempts++;
            if(userguess>NumberToGuess){
                System.out.println("Too high! Try again");
            }else if(userguess<NumberToGuess){
                System.out.println("Too low! Try again");
            }else{
                System.out.println("Correct ! You guessed it in "+attempts+" attempts");
            }
        }
        scanner.close();
    }
}

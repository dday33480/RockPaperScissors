package com.david.fun.chifoumi;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args)
    {

        int userInput = input("Please select your choice: 1- Rock  2- Paper  3- Scissors");

        playerSelection(userInput);

        int opponentSelection = aiSelection();

        game(userInput, opponentSelection);


    }

    //Game result logic
    public static void game(int input1 , int input2)
    {
        int userInput = input1;
        int aiSelection = input2;
        if(userInput == aiSelection)
        {
            System.out.println("Draw. Try again !");
        }
        else if(userInput == 1 && aiSelection == 2)
        {
            System.out.println("Sorry, you lost !");
        }
        else if(userInput == 1 && aiSelection == 3)
        {
            System.out.println("Congratulations, you won !");
        }
        else if(userInput == 2 && aiSelection == 1)
        {
            System.out.println("Congratulations, you won !");
        }
        else if(userInput == 2 && aiSelection == 3)
        {
            System.out.println("Sorry, you lost !");
        }
        else if(userInput == 3 && aiSelection == 1)
        {
            System.out.println("Congratulations, you won !");
        }
        else if(userInput == 3 && aiSelection() == 2)
        {
            System.out.println("Sorry, you lost !");
        }
        else
        {
            System.out.println("An error has occured, please try again.");
        }
    }

    //Random selection for AI
    public static int aiSelection()
    {
        Random num = new Random();
        double aiSelection = num.nextFloat();
        int selection;
        if(aiSelection >=0.0 && aiSelection <= 0.33)
        {
            selection = 1;
            System.out.println("Your opponent has selected : Rock");
        }
        else if(aiSelection >= 0.34 && aiSelection <= 0.66)
        {
            selection = 2;
            System.out.println("Your opponent has selected : Paper");
        }
        else if(aiSelection >= 0.67 && aiSelection <= 1)
        {
            selection = 3;
            System.out.println("Your opponent has selected : Scissors");
        }
        else
        {
            selection = 0;
            System.out.println("Error");
        }
        return selection;

    }

    //Player selection
    public static int playerSelection(int userInput)
    {
        int selection;
        int playerSelection = userInput;
        switch(playerSelection)
        {
            case 1:
                selection = 1;
                System.out.println("You have selected : Rock");
                break;

            case 2:
                selection = 2;
                System.out.println("You have selected : Paper");
                break;

            case 3:
                selection = 3;
                System.out.println("You have selected : Scissors");
                break;

            default:
                selection = 0;
                System.out.println("Invalid selection, please enter 1, 2 ou 3");
        }
        return selection;
    }

    public static int input(String message)
    {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }
}

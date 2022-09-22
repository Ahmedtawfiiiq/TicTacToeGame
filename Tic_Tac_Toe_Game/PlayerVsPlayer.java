package com.company;

import java.util.Scanner;

public class PlayerVsPlayer extends State {

    //A method which shows the game sequence when a user plays a user
    @Override
    public void start(){
        State.PrintGrid();
        while(counter != 42) {
            System.out.println("First Player Turn: ");
            //Important
            isValidMove('X');
            State.PrintGrid();
            if (winningCases('X', "First Player Won!")) {
                break;
            }
            if (counter == 42) {
                System.out.println("Draw");
                break;
            }
            System.out.println("Second Player Turn: ");
            //Important
            isValidMove('O');
            State.PrintGrid();
            if (winningCases('O', "Second Player Won!")) {
                break;
            }
        }
    }

    //A method which takes position input from the user
    public static void isValidMove(char symbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Position");
        //Important
        int value = scanner.nextInt();

        //While loop to check the validity of user input if it is between 1 and 42
        while(true)
        {
            if(value > 0 && value < 43){
                break;
            }
            else{
                System.out.println("Enter a number from 1 to 42");
                value = scanner.nextInt();
            }

        }
        positionCasesForUser(value,symbol);
        counter++;
    }
}
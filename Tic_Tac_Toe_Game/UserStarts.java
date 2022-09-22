package com.company;

import java.util.Scanner;

public class UserStarts extends State {

    //A method which shows the game sequence when user starts
    @Override
    public void start(){
        State.PrintGrid();
        while(counter != 42) {
            isValidMove();
            State.PrintGrid();
            if (winningCases('X', "You Won!")) {
                break;
            }
            if (counter == 42) {
                System.out.println("Draw");
                break;
            }
            ComputerStart.isValidMove();
            State.PrintGrid();
            if (winningCases('O', "You Lost!")) {
                break;
            }
        }
    }

    //A method which takes position input from the user
    public static void isValidMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Position");
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
        positionCasesForUser(value,'X');
        counter++;
    }
}

package com.company;

import java.util.Random;

public class ComputerStart extends State {


    //A method which shows the game sequence when computer starts
    @Override
    public void start() {
        while (counter != 42) {
            isValidMove();
            State.PrintGrid();
            if (winningCases('O', "You Lost!")) {
                break;
            }
            if (counter == 42) {
                System.out.println("Draw");
                break;
            }
            UserStarts.isValidMove();
            State.PrintGrid();
            if (winningCases('X', "You Won!")) {
                break;
            }
        }
    }

    //A method which takes position input from the computer
    public static void isValidMove () {
        Random random = new Random();
        System.out.println("Computer Position");
        positionCasesForComputer(random.nextInt(42)+1,'O');
        counter++;
    }
}

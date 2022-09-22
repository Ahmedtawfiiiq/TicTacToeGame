package com.company;

import java.util.Random;

public class ComputerVsComputer extends State{

    //A method which shows the game sequence when computer plays computer
    @Override
    public void start(){
        while(counter != 42) {
            System.out.println("First Computer Turn: ");
            isValidMove('X');
            State.PrintGrid();
            if (winningCases('X', "First Computer Won!")) {
                break;
            }
            if (counter == 42) {
                System.out.println("Draw");
                break;
            }
            System.out.println("Second Computer Turn: ");
            isValidMove('O');
            State.PrintGrid();
            if (winningCases('O', "Second Computer Won!")) {
                break;
            }
        }
    }

    //A method which takes position input from the computer
    public static void isValidMove (char symbol) {
        Random random = new Random();
        positionCasesForComputer(random.nextInt(42)+1,symbol);
        counter++;
    }
}

package com.company;

import java.util.Scanner;

public class Context {

    Scanner scanner = new Scanner(System.in);

    private final UserStarts user ;
    private final ComputerStart computer;
    private final PlayerVsPlayer playerVsPlayer;
    private final ComputerVsComputer computerVsComputer;
    private int Mode;

    //Constructor for the class Context
    public Context(UserStarts user, ComputerStart computer,PlayerVsPlayer playerVsPlayer,ComputerVsComputer computerVsComputer) {
        this.user = user;
        this.computer = computer;
        this.playerVsPlayer = playerVsPlayer;
        this.computerVsComputer = computerVsComputer;
    }

    //A method which checks the validity of user input during choosing the game mode
    private void isValidPlayer(){
        System.out.println("1: Computer Vs Player");
        System.out.println("2: Player Vs Computer");
        System.out.println("3: Player Vs Player");
        System.out.println("4: Computer Vs Computer");
        System.out.println("5: Exit");

        Mode = scanner.nextInt();
        while (true){
            if(Mode == 1 || Mode == 2|| Mode == 3|| Mode == 4|| Mode == 5)
                break;
            else{
                System.out.println("Enter 1 or 2 or 3 or 4 or 5");
                Mode = scanner.nextInt();
            }
        }
    }

    //A method which starts the mode the user chosen and offers him playing another mode or exit from the game
    public void play(){
        isValidPlayer();
        if (Mode == 1){
            computer.start();
            System.out.println("\nTry Again\n");
            State.setter();
            play();
        }
        else if (Mode == 2){
            user.start();
            System.out.println("\nTry Again\n");
            State.setter();
            play();
        }
        else if (Mode == 3) {
            playerVsPlayer.start();
            System.out.println("\nTry Again\n");
            State.setter();
            play();
        }
        else if(Mode == 4){
            computerVsComputer.start();
            System.out.println("\nTry Again\n");
            State.setter();
            play();
        }
        else
            System.out.println("Game Ended");

    }
}

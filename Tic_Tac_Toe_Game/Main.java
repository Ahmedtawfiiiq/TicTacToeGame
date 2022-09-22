package com.company;

public class Main {

    public static void main (String[] args) {

        //Creating object of each class mode
        UserStarts user = new UserStarts();
        ComputerStart computer = new ComputerStart();
        ComputerVsComputer computerVsComputer = new ComputerVsComputer();
        PlayerVsPlayer playerVsPlayer = new PlayerVsPlayer();
        Context context = new Context(user,computer,playerVsPlayer,computerVsComputer);

        //Calling the method play which opens the mode chosen by the user
        context.play();

    }
}

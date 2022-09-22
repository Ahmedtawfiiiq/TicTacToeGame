package com.company;

import java.util.Random;
import java.util.Scanner;

public abstract class  State {

    //The shape of the game grid
    public static char[][] frame = {{' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '},//0
            {'-','+','-','+','-','+','-','+','-','+','-','+','-'},//1
            {' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '},//2
            {'-','+','-','+','-','+','-','+','-','+','-','+','-'},//3
            {' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '},//4
            {'-','+','-','+','-','+','-','+','-','+','-','+','-'},//5
            {' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '},//6
            {'-','+','-','+','-','+','-','+','-','+','-','+','-'},//7
            {' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '},//8
            {'-','+','-','+','-','+','-','+','-','+','-','+','-'},//9
            {' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' '}//10

    };

    //Counter for the number of times played
    public static int counter;

    //A method to print the game grid
    public static void PrintGrid(){
        for (char[] row  : frame){
            for ( char column : row)
                System.out.print(column);
            System.out.println();
        }
    }


    public static void setter(){
        for(int rows = 0; rows <=10 ; rows+=2)
        {
            for(int columns = 0; columns <=12 ; columns+=2)
            {
                frame[rows][columns]=' ';
            }
        }
    }

    //Abstract method inherited by the other classes where each class (each class represent one of the game modes) has its own game logic
    public abstract void start();

    //A method which determines when the game stops and the winning cases
    public boolean winningCases(char symbol , String title){
        int row,columns;
        for ( row=0 ; row<=10 ; row+=2)
        {
            for (columns = 0; columns <= 8; columns+=2) {
                if (frame[row][columns] == symbol && frame[row][columns + 2] == symbol && frame[row][columns + 4] == symbol) {
                    System.out.println(title);
                    return true;
                }
            }
        }
        for ( row=0 ; row<=6 ; row+=2)   //rows-2
        {
            for (columns = 0; columns <=12; columns+=2) //columns are with the same size as we need all columns
            {
                if (frame[row][columns] == symbol && frame[row + 2][columns] == symbol && frame[row + 4][columns] == symbol) {
                    System.out.println(title);
                    return true;
                }
            }
        }
        for(row=0 ; row<=6 ;row+=2)
        {
            for (columns=0; columns<=8 ; columns+=2)
            {
                if(frame[row][columns]==symbol && frame[row+2][columns+2]==symbol && frame[row+4][columns+4]==symbol  )
                {
                    System.out.println(title);
                    return true;
                }
            }
        }
        for(row=0 ; row<=6 ;row+=2)
        {
            for (columns=12; columns>=4 ; columns-=2)
            {
                if(frame[row][columns]==symbol && frame[row+2][columns-2]==symbol && frame[row+4][columns-4]==symbol  )
                {
                    System.out.println(title);
                    return true;
                }
            }
        }
        return false;


    }

    //A method which checks if the place is taken or not during user turn
    public static void positionCasesForUser(int position,char symbol){
        Scanner scanner = new Scanner(System.in);
        switch(position){
            case 1 : {
                if (frame[0][0] == ' '){
                    frame[0][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 2 : {
                if (frame[0][2] == ' '){
                    frame[0][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 3 : {
                if (frame[0][4] == ' '){
                    frame[0][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 4 : {
                if (frame[0][6] == ' '){
                    frame[0][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 5 : {
                if (frame[0][8] == ' '){
                    frame[0][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 6 : {
                if (frame[0][10] == ' '){
                    frame[0][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 7 : {
                if (frame[0][12] == ' '){
                    frame[0][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 8 : {
                if (frame[2][0] == ' '){
                    frame[2][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 9 : {
                if (frame[2][2] == ' '){
                    frame[2][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 10 : {
                if (frame[2][4] == ' '){
                    frame[2][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 11 : {
                if (frame[2][6] == ' '){
                    frame[2][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 12 : {
                if (frame[2][8] == ' '){
                    frame[2][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 13 : {
                if (frame[2][10] == ' '){
                    frame[2][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 14 : {
                if (frame[2][12] == ' '){
                    frame[2][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 15 : {
                if (frame[4][0] == ' '){
                    frame[4][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 16 : {
                if (frame[4][2] == ' '){
                    frame[4][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 17 : {
                if (frame[4][4] == ' '){
                    frame[4][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 18 : {
                if (frame[4][6] == ' '){
                    frame[4][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 19 : {
                if (frame[4][8] == ' '){
                    frame[4][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 20 : {
                if (frame[4][10] == ' '){
                    frame[4][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 21 : {
                if (frame[4][12] == ' '){
                    frame[4][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 22 : {
                if (frame[6][0] == ' '){
                    frame[6][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 23 : {
                if (frame[6][2] == ' '){
                    frame[6][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 24 : {
                if (frame[6][4] == ' '){
                    frame[6][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 25 : {
                if (frame[6][6] == ' '){
                    frame[6][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 26 : {
                if (frame[6][8] == ' '){
                    frame[6][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 27 : {
                if (frame[6][10] == ' '){
                    frame[6][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 28 : {
                if (frame[6][12] == ' '){
                    frame[6][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 29 : {
                if (frame[8][0] == ' '){
                    frame[8][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 30 : {
                if (frame[8][2] == ' '){
                    frame[8][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 31 : {
                if (frame[8][4] == ' '){
                    frame[8][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 32 : {
                if (frame[8][6] == ' '){
                    frame[8][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 33 : {
                if (frame[8][8] == ' '){
                    frame[8][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 34 : {
                if (frame[8][10] == ' '){
                    frame[8][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 35 : {
                if (frame[8][12] == ' '){
                    frame[8][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 36 : {
                if (frame[10][0] == ' '){
                    frame[10][0] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 37 : {
                if (frame[10][2] == ' '){
                    frame[10][2] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 38 : {
                if (frame[10][4] == ' '){
                    frame[10][4] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 39 : {
                if (frame[10][6] == ' '){
                    frame[10][6] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 40 : {
                if (frame[10][8] == ' '){
                    frame[10][8] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 41 : {
                if (frame[10][10] == ' '){
                    frame[10][10] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
            case 42 : {
                if (frame[10][12] == ' '){
                    frame[10][12] = symbol;
                }
                else{
                    System.out.println("This position is taken");
                    positionCasesForUser(scanner.nextInt(),symbol);
                }
                break;
            }
        }
    }

    //A method which checks if the place is taken or not during computer turn
    public static void positionCasesForComputer(int position,char symbol){
        Random random = new Random();
        switch(position){
            case 1 : {
                if (frame[0][0] == ' '){
                    frame[0][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 2 : {
                if (frame[0][2] == ' '){
                    frame[0][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 3 : {
                if (frame[0][4] == ' '){
                    frame[0][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 4 : {
                if (frame[0][6] == ' '){
                    frame[0][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 5 :{
                if (frame[0][8] == ' '){
                    frame[0][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 6 : {
                if (frame[0][10] == ' '){
                    frame[0][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 7 : {
                if (frame[0][12] == ' '){
                    frame[0][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 8 : {
                if (frame[2][0] == ' '){
                    frame[2][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 9 : {
                if (frame[2][2] == ' '){
                    frame[2][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 10 : {
                if (frame[2][4] == ' '){
                    frame[2][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 11 : {
                if (frame[2][6] == ' '){
                    frame[2][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 12 :{
                if (frame[2][8] == ' '){
                    frame[2][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 13 : {
                if (frame[2][10] == ' '){
                    frame[2][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 14 : {
                if (frame[2][12] == ' '){
                    frame[2][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 15 : {
                if (frame[4][0] == ' '){
                    frame[4][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 16 : {
                if (frame[4][2] == ' '){
                    frame[4][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 17 : {
                if (frame[4][4] == ' '){
                    frame[4][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 18 : {
                if (frame[4][6] == ' '){
                    frame[4][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 19 : {
                if (frame[4][8] == ' '){
                    frame[4][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 20 : {
                if (frame[4][10] == ' '){
                    frame[4][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 21 : {
                if (frame[4][12] == ' '){
                    frame[4][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 22 : {
                if (frame[6][0] == ' '){
                    frame[6][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 23 : {
                if (frame[6][2] == ' '){
                    frame[6][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 24 : {
                if (frame[6][4] == ' '){
                    frame[6][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 25 : {
                if (frame[6][6] == ' '){
                    frame[6][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 26 : {
                if (frame[6][8] == ' '){
                    frame[6][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 27 : {
                if (frame[6][10] == ' '){
                    frame[6][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 28 : {
                if (frame[6][12] == ' '){
                    frame[6][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 29 : {
                if (frame[8][0] == ' '){
                    frame[8][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 30 : {
                if (frame[8][2] == ' '){
                    frame[8][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 31 : {
                if (frame[8][4] == ' '){
                    frame[8][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 32 : {
                if (frame[8][6] == ' '){
                    frame[8][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 33 : {
                if (frame[8][8] == ' '){
                    frame[8][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 34 : {
                if (frame[8][10] == ' '){
                    frame[8][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 35 : {
                if (frame[8][12] == ' '){
                    frame[8][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 36 : {
                if (frame[10][0] == ' '){
                    frame[10][0] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 37 : {
                if (frame[10][2] == ' '){
                    frame[10][2] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 38 : {
                if (frame[10][4] == ' '){
                    frame[10][4] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 39 : {
                if (frame[10][6] == ' '){
                    frame[10][6] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 40 : {
                if (frame[10][8] == ' '){
                    frame[10][8] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 41 : {
                if (frame[10][10] == ' '){
                    frame[10][10] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
            case 42 : {
                if (frame[10][12] == ' '){
                    frame[10][12] = symbol;
                }
                else{
                    positionCasesForComputer(random.nextInt(42)+1,symbol);
                }
                break;
            }
        }

    }
}

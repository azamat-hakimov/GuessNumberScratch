package com.portfolio.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("- - - - - - - Welcome to Guess Number game app! - - - - - - - ");
        System.out.println("Basic Rule: You and the computer take turns guessing a number between 0 and 10; whoever guesses correctly first wins!");

        System.out.print("Are you ready ? (yes/no): ");
        String starter = scanner.nextLine();

        if (starter.equals("y") || starter.equals("yes")){

            Computer computer = new Computer();
            computer.run();

            User user = new User();
            user.think();

            int userTries = computer.getUserTries();
            int computerTries = user.getComputerTries();


            if (userTries > computerTries){
                System.out.println("Congrats! Computer wins.");
            }if(userTries < computerTries){
                System.out.println("Congrats! You wins.");
            }if (userTries == computerTries){
                System.out.println("Congratulation! We both wins.");
            }


        }else {
            System.out.println("GAME OVER -- -- --");
        }


    }
}









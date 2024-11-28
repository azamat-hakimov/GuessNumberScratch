package com.portfolio.app;

import java.util.Random;
import java.util.Scanner;

public class User {

    private int computerTries;

    public int getComputerTries() {
        return computerTries;
    }

    public void setComputerTries(int computerTries) {
        this.computerTries = computerTries;
    }

    public void think(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // So now user take a guess
        System.out.println("So now you'll think a number and i (computer) will take guess!");
        System.out.println("Think a number from 0 to 10.");
        System.out.println("You have 5 sec to think.. ");
        System.out.println("So ..");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // and computer try to find that number
        int computerGuess = random.nextInt(11);

        int counts = 0;
        boolean onGoing = true;
        while (onGoing){
            // here loops starts
            counts += 1;
            System.out.print("Is it " + computerGuess + " ? type if it's true (y) Or it's wrong and if your number smaller (s) or higher (h) : ");
            String checkingComp = scanner.nextLine();

            if (checkingComp.equals("y")){
                if (counts <= 1){
                    Computer computer = new Computer();
                    int userTries = computer.getUserTries();

                    if (userTries == 1 && counts == 1){
                        System.out.println("That was best luck ever. I got you at first try too.");
                        onGoing = false;
                    }else {
                        System.out.println("That was nice luck yeah .. at first try.");
                        setComputerTries(counts);
                        onGoing = false;
                    }
                }else {
                    System.out.println("Finally i got it at " + counts + " tries.");
                    setComputerTries(counts);
                    onGoing = false;
                }

            }else if (checkingComp.equals("s")){
                computerGuess = computerGuess - 1;

            }else if (checkingComp.equals("h")){
                computerGuess = computerGuess + 1;
            }else {
                System.out.println("Invalid input. Type correctly!");
            }

        }

    }

}

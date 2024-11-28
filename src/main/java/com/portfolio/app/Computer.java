package com.portfolio.app;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private int userTries;

    public int getUserTries() {
        return userTries;
    }

    public void setUserTries(int userTries) {
        this.userTries = userTries;
    }

    // main code starts here - - - -

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // think a number
        Random random = new Random();
        int computerNumber = random.nextInt(11);
        System.out.println("Hmm..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("i thought a number from 0 to 10.");


        // check the number if true computer's turn over if not game continue until user find
        int count = 0;
        boolean getGoing = true;
        while (getGoing){

            count += 1;
            System.out.print("Guess what number is? (0/10): ");
            int userNumber = scanner.nextInt();

            if (userNumber == computerNumber){
                if (count <= 1){
                    System.out.println("Excellent! You got me at first try.");
                    setUserTries(count);
                    getGoing = false;
                }else {
                    System.out.println("Good job! You found it at " + count + " tries.");
                    setUserTries(count);
                    getGoing = false;
                }
            }else {
                if (userNumber > computerNumber){
                    System.out.println("Guess smaller numbers..");
                }else {
                    System.out.println("Guess higher numbers..");
                }
            }

        }

    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //initialize user numbers
        int number1=0;
        int number2=0;


        // ask the user to enter 2 numbers
        System.out.println("Enter 2 numbers. The first one must be higher then 1 and the second different then 0.");
        // read the two values
        number1 = keyboard.nextInt();
        number2 = keyboard.nextInt();
        keyboard.nextLine();

        // check if the fist number is higher then 1
        while ((number1 <=1) || (number2 == 0)) {
            if (number1 <=1) {
                System.out.println("the first number:" + number1 + " is invalid. Must be higher then 1");
                System.out.println("Enter a valid first number.");
                number1 = keyboard.nextInt();
                keyboard.nextLine();
            }
            if (number2 == 0) {
                System.out.println("the second number:" + number2 + " is invalid. Must be different then 0");
                System.out.println("Enter a valid second number.");
                number2 = keyboard.nextInt();
                keyboard.nextLine();
            }
        }


        //Print the Fizz Buzz numbers
        int multipleCounters[] = printNumbers(number1, number2);

        // print the number of multiple of 7,17,23 and the user number
        System.out.println("\nNumber of multiple of 7  : "+multipleCounters[0]);
        System.out.println("Number of multiple of 17 : "+multipleCounters[1]);
        System.out.println("Number of multiple of 23 : "+multipleCounters[2]);
        System.out.println("Number of multiple of " + number2 + ": " + multipleCounters[3]);


    }

    // given two number: number1 and number2
    // check if number1 is a multiple of number2
    public static boolean checkIfMultiples(int number1, int number2){
        if((number1%number2) == 0)
            return true;
        else
            return false;

    }


    public static int[] printNumbers(int number1, int number2) {

        //initialize counters for multiple of 7,17,23 and the user number
        int[] multipleCounters = {0,0,0,0};

        for (int counter = 1; counter <= number1; counter++) {


            // check if multiple of three
            if (checkIfMultiples(counter,3)) {
                System.out.print("Fizz ");
                // check if multiple of five
            }

            // check if multiple of five
            if (checkIfMultiples(counter,5)) {
                // multiple of five and three
                System.out.print("Buzz ");
            }

            // check if multiple of seven
            if (checkIfMultiples(counter,7)) {
                //increment the counter for multiple of seven
                multipleCounters[0]++;
            }
            // check if multiple of seventeen
            if (checkIfMultiples(counter,17)) {
                //increment the counter for multiple of seventeen
                multipleCounters[1]++;
            }
            // check if multiple of twentythree
            if (checkIfMultiples(counter,23)) {
                //increment the counter for multiple of twentythree
                multipleCounters[2]++;
            }
            // check if multiple of user number2
            if (checkIfMultiples(counter,number2)) {
                //increment the counter for multiple  of user number2
                multipleCounters[3]++;
            }

            // if not multiple of 3, 5 print counter
            if (checkIfMultiples(counter,3) == false) {
                if(checkIfMultiples(counter,5) == false){
                    System.out.print(counter);
                }
            }
            System.out.print("\n");

        }
        return multipleCounters;

    }
}

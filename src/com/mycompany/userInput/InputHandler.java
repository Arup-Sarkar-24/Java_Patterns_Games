package com.mycompany.userInput;

import java.util.Scanner;

public class InputHandler {

    public int getNumberOfRows() {
        Scanner sc = new Scanner(System.in);
        int rows;
        // Loop until a valid input is given
        while (true) {
            System.out.print("Enter the number of rows: ");
            rows = sc.nextInt();
            // Check if the input is valid
            if (rows >= 3) {
                return rows; // Return the valid input
            } else {
                System.out.println("Pattern can't be created with less than 3 rows. Please try again.");
            }
        }
    }

    public String getStringInput() {
        Scanner sc = new Scanner(System.in);
        String input;

        // Loop until a valid input is received
        while (true) {
            System.out.print("Enter a string: ");
            input = sc.nextLine(); // Reads the entire line as a string

            // Check if the input is empty
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid string.");
            } else {
                return input; // Return valid input
            }
        }

    }

    public int getNumberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        return sc.nextInt();
    }


}

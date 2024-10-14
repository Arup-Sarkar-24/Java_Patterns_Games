package com.mycompany.patterns;

import com.mycompany.userInput.InputHandler;

public class PatternPrinter {

    // This method gathers inputs and prints the right triangle pattern
    public void rightTrianglePattern() {
        System.out.println("Left to Right-------------->>>>>");
        InputHandler inputHandler = new InputHandler(); // Create an instance to get inputs
        int rows = inputHandler.getNumberOfRows(); // Get number of rows from user
        String str = inputHandler.getStringInput();// Get string input from user
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str + " "); // Use the user-defined string
            }
            System.out.println();
        }
    }

    // This method gathers inputs and prints the left triangle pattern
    public void leftTrianglePattern() {
        System.out.println("Right to left-------------->>>>>");
        InputHandler inputHandler = new InputHandler(); // Create an instance to get inputs
        int rows = inputHandler.getNumberOfRows(); // Get number of rows from user
        String str = inputHandler.getStringInput(); // Get string input from user
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str + " "); // Use the user-defined string
            }
            System.out.println();
        }
    }
}

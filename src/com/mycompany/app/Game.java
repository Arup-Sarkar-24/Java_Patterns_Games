package com.mycompany.app;

import com.mycompany.patterns.PatternPrinter; // Import the PatternPrinter class
import java.lang.reflect.Method;
import java.util.Scanner;

public class Game {

    public static void play() {
        Scanner sc = new Scanner(System.in);
        PatternPrinter methodHolder = new PatternPrinter(); // Create an instance of MethodHolder

        // Get all declared methods of MethodHolder
        Method[] methods = methodHolder.getClass().getDeclaredMethods();

        // Loop to repeatedly prompt the user for input
        while (true) {
            System.out.println("Available methods:");
            for (int i = 0; i < methods.length; i++) {
                System.out.println((i + 1) + " -> " + methods[i].getName());
            }
            System.out.print("Enter a number (1-" + methods.length + ") to call a method, or 0 to exit: ");
            int choice = sc.nextInt();

            System.out.println();

            if (choice == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break; // Exit the loop if the user enters 0
            }

            // Validate choice and call the corresponding method
            if (choice > 0 && choice <= methods.length) {
                try {
                    methods[choice - 1].invoke(methodHolder); // Invoke the selected method
                } catch (Exception e) {
                    System.out.println("Error executing method: " + e.getMessage());
                }
                System.out.println();
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and " + methods.length + ".");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner after exiting the loop
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.Scanner;

/**
 *
 * @author Manoj Kota
 */
public class Squad6App {
    private static final String GREETING_MESSAGE = "Welcome to our squad6 App";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our App";

    // specify number of  animal types available 
    private static final int NUMBER_human_types = 2;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to see animals
        System.out.println("Do you want to see animals (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("What kind of human beings would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.print(" 1.Doctor        ");
                System.out.print(" 2.LegalAdvisor          ");
               
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                // set isValid if >= 1 and <= number of animal types
                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_human_types ;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                        DoctorGroup.create();
                        LegalAdvisorGroup.run();
                    }
                    
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

            // close the if loop
        } // Prompt for adventures: ask if they want to try an adventure
        //        System.out.println("Do you want to go on an adventure (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

    }
    
        

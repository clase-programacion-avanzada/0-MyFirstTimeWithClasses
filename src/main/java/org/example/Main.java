package org.example;

import java.util.Scanner;
import org.example.model.Animal;

public class Main {
    
    //Example of how to create a new animal, Main is showing a menu
    // using Scanner class and print it
    public static void main(String[] args) {

        //Reference: https://www.geeksforgeeks.org/scanner-class-in-java/
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            //Reference: https://www.baeldung.com/java-text-blocks
            String menu =
                """
                1. Create new animal
                2. Exit
                """;

            System.out.println(menu);
            //Reference:
            // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> createNewAnimal(scanner);
                case 2 -> System.out.println("Bye");
                default -> System.out.println("Invalid option");
            }

        }while (option != 2);

        scanner.close();
    }

    private static void createNewAnimal(Scanner scanner) {

        System.out.println("Please enter the name of the animal");

        String name = scanner.nextLine();

        System.out.println("Please enter the age of the animal");

        //Reference: https://www.baeldung.com/java-string-to-int
        int age = Integer.valueOf(scanner.nextLine());

        //We are creating a new animal using the constructor
        Animal animal = new Animal(name, age);

        //We can print the animal because we have overridden the toString method
        //in Animal class. If we don't override the toString method, we will
        //print the reference of the object.
        //i.e org.example.model.Animal@1b6d3586
        System.out.println("The animal is: " + animal);
    }

}
package org.example.model;

import java.util.UUID;

public class Animal {
    // UUID is a class that generates a random id
    // Reference: https://www.baeldung.com/java-uuid
    private UUID id;
    private String name;
    private int age;

    // This is a constant, it is a good practice to use constants
    // instead of hardcoding values
    private final static int EDAD_MINIMA = 0;
    // In this case, we are using static final because we want to
    // assign a value to the variable, and we don't want to change it
    // Reference: https://www.baeldung.com/java-initialization
    private static final String DEFAULT_NAME = "No nombre";

    // Constructor with parameters (Constructor Overloading)
    // This constructor allows you to create an Animal object
    // with a specified name and age.
    public Animal(String name, int age) {
        // Generate a random UUID for the object's id
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    // Default constructor (Constructor Overloading)
    // This constructor is used when an Animal object is created
    // without specifying a name and age. It sets default values.
    public Animal() {
        // Generate a random UUID for the object's id
        this.id = UUID.randomUUID();
        // Set the default name and age
        this.name = DEFAULT_NAME;
        this.age = EDAD_MINIMA;
    }

    // Getter method for the 'name' attribute
    public String getName() {
        return this.name;
    }

    // Setter method for the 'name' attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the 'age' attribute
    public int getAge() {
        return age;
    }

    // Setter method for the 'age' attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for the 'id' attribute
    public UUID getId() {
        return id;
    }

    // Override the toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "id: " + id +
            " nombre: '" + name + '\'' +
            " edad: " + age;
    }
}

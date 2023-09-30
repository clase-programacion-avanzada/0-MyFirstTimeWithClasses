package org.example.model;


import java.util.UUID;

public class Animal {
    //UUID is a class that generates a random id
    //Reference: https://www.baeldung.com/java-uuid
    private UUID id;
    private String name;
    private int age;

    //This is a constant, it is a good practice to use constants
    //instead of hardcoding values
    private final static int EDAD_MINIMA = 0;
    //In this case, we are using static final because we want to
    //assign a value to the variable, and we don't want to change it
    //Reference: https://www.baeldung.com/java-initialization
    private static final String DEFAULT_NAME = "No nombre";
    public Animal(String name, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;

    }

    public Animal() {
        this.id = UUID.randomUUID();
        this.name = DEFAULT_NAME;
        this.age = EDAD_MINIMA;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getId() {
        return id;
    }


    @Override
    public String toString() {
        return
            "id: " + id +
                " nombre: '" + name + '\'' +
                " edad: " + age;
    }
}

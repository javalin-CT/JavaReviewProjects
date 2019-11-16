package com.example.ReviewProjects.Zoo;

public class Animal {
    String name;
    int age;
    String color;
    String breed;
    static String zooName;

    public void eat(String foodName){
        System.out.println(name + " is eating " + foodName);
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public Animal(){
        name = "This animal's name is not given.";
        age = 0;
        breed = "We have no idea what this is.";
        color = "It is too dark to know the color";
    }

    public Animal(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

}

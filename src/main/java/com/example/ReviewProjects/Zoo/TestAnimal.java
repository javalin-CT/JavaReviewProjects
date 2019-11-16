package com.example.ReviewProjects.Zoo;

public class TestAnimal {
    public static void main(String[] args) {
        Animal.zooName = "CyberTek Zoo";
        Animal a201 = new Animal();
        a201.name = "Simba";
        a201.age = 3;
        a201.color = "golden";
        a201.breed = "lion";

        a201.eat("pasta");
        a201.sleep();

        Animal a = new Animal("name", 3, "golden", "lion");


    }
}

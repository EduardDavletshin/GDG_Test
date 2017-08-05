package com.example;

import java.util.ArrayList;

/**
 * Created by eddy on 04.08.17.
 */

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private ArrayList<Animal> generateAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Donkey());
        animals.add(new Cat());
        animals.add(new Donkey());
        animals.add(new Cat());
        animals.add(new Crow());
        animals.add(new Cat());
        animals.add(new Donkey());
        animals.add(new Crow());
        animals.add(new Cat());
        animals.add(new Crow());
        animals.add(new Donkey());
        animals.add(new Crow());
        return animals;
    }

    private void run() {
        ArrayList<Animal> animals = generateAnimals();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

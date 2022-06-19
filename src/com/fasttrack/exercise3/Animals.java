package com.fasttrack.exercise3;

public class Animals {
    private Animal animal;

    public Animals(Animal animal) {
        this.animal = animal;
    }

    public void animalDescription(){
        System.out.println(animal.eat());
        System.out.println(animal.talk());
        System.out.println(animal.walk());
    }
}

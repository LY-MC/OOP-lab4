package com.utm.miscellaneous;

import com.utm.animals.*;
import com.utm.enums.AnimalType;
import com.utm.root.Entity;

import java.util.ArrayList;
import java.util.List;

public class Cage extends Entity {

    private int width;
    private int length;
    private final List<Animal> animalList = new ArrayList<>();

    public Cage(int ID, int width, int length) {
        super(ID);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void populateCage(int count, AnimalType animalType) {
        while (count-- > 0) {
            switch (animalType) {
                case MONKEY:
                    this.animalList.add(new Monkey());
                    break;
                case ELEPHANT:
                    this.animalList.add(new Elephant());
                    break;
                case HORSE:
                    this.animalList.add(new Horse());
                    break;
                case LION:
                    this.animalList.add(new Lion());
                    break;
                case DUCK:
                    this.animalList.add(new Duck());
                    break;
                }
            }
        }
    public int countHungryAnimals(int count) {
        for (Animal animal : animalList) {
            if (animal.isHungry()) {
                count += 1;
            }
        }
        return count;
    }

    public int countIllAnimals(int count) {
        for (Animal animal : animalList) {
            if (animal.isIll()) {
                count += 1;
            }
        }
        return count;
    }
    int myCounter = 0;


    public void feedingAnimals(int counter, int wrongFood) {
        for (Animal animal : animalList) {
            if (animal.isHungry()) {
                animal.setHungry(false);
                if(wrongFood % 10 == 0) {
                    animal.setIll(true);
                }
                myCounter++;
                if (counter == myCounter) {
                    break;
                }
            }
        }
    }

    public void treatingAnimals() {
        for (Animal animal : animalList) {
            animal.setIll(false);
        }
    }

    public void treatingAnimal() {
        for (Animal animal : animalList) {
            if (animal.isIll()) {
                animal.setIll(false);
                break;
            }
        }
    }
    public void printAnimalsInCage() {
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}

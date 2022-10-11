package com.utm.animals;

import com.utm.root.Entity;

public abstract class Animal extends Entity {
    private int weight;
    private int height;
    private int age;
    private boolean isMale;
    private boolean isIll;
    private boolean isHungry;

    public Animal() {
        super();
        this.isMale = false;
        this.isIll = false;
        this.isHungry = false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    abstract public int rideAnimal();
    abstract public void makeSound();
}

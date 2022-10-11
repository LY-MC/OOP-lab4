package com.utm.animals;

import java.util.Random;

public class Monkey extends Animal {
    public Monkey() {
        super();
        Random random = new Random();
        setAge(random.nextInt(26) + 1);
        setMale(random.nextBoolean());
        setIll(random.nextInt(100) % 10 == 0);
        setHungry(random.nextBoolean());
        setID(getRandomID());
        if (getAge() < 3 && isMale()) {
            setWeight(random.nextInt(4) + 1);
            setHeight(random.nextInt(20) + 10);
        } else if (getAge() < 3 && !isMale()) {
            setWeight(random.nextInt(3) + 1);
            setHeight(random.nextInt(25) + 10);
        } else if (getAge() > 3 && isMale()) {
            setWeight(random.nextInt(4) + 3);
            setHeight(random.nextInt(25) + 40);
        } else if (getAge() > 3 && !isMale()) {
            setWeight(random.nextInt(3) + 3);
            setHeight(random.nextInt(20) + 40);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("U U U, a a a");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "weight=" + getWeight() +
                ", height=" + getHeight() +
                ", age=" + getAge() +
                ", isMale=" + isMale() +
                ", isIll=" + isIll() +
                ", isHungry=" + isHungry() +
                ", ID=" + getID() +
                '}';
    }
    @Override
    public int rideAnimal() {
        System.out.println("You can't ride this animal");
        return 0;
    }
}

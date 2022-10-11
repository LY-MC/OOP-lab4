package com.utm.root;

import java.util.Random;

public class Entity {
    private int ID;

    public Entity(int ID) {
        this.ID = ID;
    }

    public Entity() {

    }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRandomID() {
        Random rand = new Random();
        int max = 1000000000;
        int min = 100000000;
        return min + rand.nextInt(max - min + 1);
    }
}

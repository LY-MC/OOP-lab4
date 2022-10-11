package com.utm.zooworkers;

public class Veterinarian extends ZooWorker{
    private boolean isTreating;

    public Veterinarian(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname, salary, experience);
    }

    public boolean isTreating() {
        return isTreating;
    }

    public void setTreating(boolean treating) {
        isTreating = treating;
    }
}

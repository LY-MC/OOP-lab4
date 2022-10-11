package com.utm.zooworkers;

public class SecurityGuard extends ZooWorker{
    private int hoursSlept;
    private boolean isSleeping;

    public SecurityGuard(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname, salary, experience);
        this.hoursSlept = 0;
        this.isSleeping = false;
    }

    public int getHoursSlept() {
        return hoursSlept;
    }

    public void setHoursSlept(int hoursSlept) {
        this.hoursSlept = hoursSlept;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }
}

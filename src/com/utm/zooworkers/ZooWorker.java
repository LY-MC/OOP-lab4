package com.utm.zooworkers;

import com.utm.intermidLvl.Person;

public class ZooWorker extends Person {
    private int salary;
    private int experience;

    public ZooWorker(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname);
        this.salary = salary;
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getFullSalary() {
        double fullSalary = salary + salary * 0.04 * experience;
        return fullSalary;
    }
}

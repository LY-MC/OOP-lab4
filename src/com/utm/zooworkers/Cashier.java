package com.utm.zooworkers;

public class Cashier extends ZooWorker{

    public Cashier(int ID, String name, String surname, int salary, int experience) {
        super(ID, name, surname, salary, experience);
    }

    private int ticketPrice;
    private int tips;

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTips() {
        return tips;
    }

    public void setTips(int tips) {
        this.tips = tips;
    }

    @Override
    public double getFullSalary() {
        double fullSalary = getSalary() + getSalary() * 0.04 * getExperience() + getTips() * 140;
        return fullSalary;
    }

    public void sellTicket(boolean asked, int age){
        if (asked && age < 18) {
            System.out.println("Cashier sells a ticket for " + ticketPrice/2 + " dollars.");
        } else if (asked){
            System.out.println("Cashier sells a ticket for " + ticketPrice + " dollars.");
        } else {
            System.out.println("Cashier: Sorry, I don't have tickets :( ");
        }
    }
}

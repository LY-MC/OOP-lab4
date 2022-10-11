package com.utm.clients;

public class Child extends Client{
    public void wantsRideHorse(int age) {
        System.out.println("Child wants to ride a horse");
        if (age < 5) {
            System.out.println("Too small to ride a horse");
        } else if (age < 14) {
            System.out.println("Can ride a pony");
        } else System.out.println("Can ride a horse");
    }

    @Override
    public void buyTicket() {
            System.out.println("Child wants to buy a ticket with 50% discount.");
    }

    @Override
    public void enterZoo(boolean canEnter) {
        if(canEnter) {
            System.out.println("Child enters the zoo.");
        } else System.out.println("Child can't enter the zoo");
    }
}

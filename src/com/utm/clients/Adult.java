package com.utm.clients;

public class Adult extends Client{

    @Override
    public void buyTicket() {
            System.out.println("Adult wants to buy a ticket.");
    }

    @Override
    public void enterZoo(boolean canEnter) {
        if(canEnter) {
            System.out.println("Adult enters the zoo.");
        } else System.out.println("Adult can't enter the zoo");
    }
}

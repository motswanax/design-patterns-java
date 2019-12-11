package com.svs.behavioral.chainOfResponsibility.example;

import java.util.Scanner;

public class Client {
    private DispenseChain chain;

    public Client() {
        // initialize the chain
        this.chain = new Dollar50Dispenser();
        DispenseChain chain2 = new Dollar20Dispenser();
        DispenseChain chain3 = new Dollar10Dispenser();

        // set the chain of responsibility
        chain.setNextChain(chain2);
        chain2.setNextChain(chain3);
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();

        while (true) {
            int amount;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10.");
                return;
            }

            // process the request
            atmDispenser.chain.dispense(new Currency(amount));
        }
    }
}

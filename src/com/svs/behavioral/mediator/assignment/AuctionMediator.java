package com.svs.behavioral.mediator.assignment;

import java.util.ArrayList;

/**
 * Implements mediator interface and holds all the buyers in an arraylist. We can add buyers and find the highest bidder
 */
class AuctionMediator implements Mediator {

    private ArrayList<Buyer> buyers;

    AuctionMediator() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer buyer: buyers) {
            if (buyer.getPrice() > maxBid) {
                maxBid = buyer.getPrice();
                winner = buyer;
            }
            buyer.auctionHasEnded();
        }
        assert winner != null;
        System.out.println("The auction winner is " + winner.getName() + ". He paid $" + winner.getPrice() + " for the item.");
    }
}

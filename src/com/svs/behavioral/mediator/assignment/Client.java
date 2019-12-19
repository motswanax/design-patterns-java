package com.svs.behavioral.mediator.assignment;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "BAD");
        Buyer buyer2 = new AuctionBuyer(mediator, "Meets");
        Buyer buyer3 = new AuctionBuyer(mediator, "Evil");

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);

        System.out.println("Welcome to the auction. We are selling a vacation to Candyland");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Waiting for the buyers' offers...");

        buyer1.bid(1800);
        buyer2.bid(2500);
        buyer3.bid(780);

        System.out.println("--------------------------------------------------------------");
        mediator.findHighestBidder();

        buyer2.cancelBid();
        System.out.println(buyer2.getName() + " has cancelled his bid! In that case");
        mediator.findHighestBidder();
    }
}

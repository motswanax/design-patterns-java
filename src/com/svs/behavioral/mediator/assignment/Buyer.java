package com.svs.behavioral.mediator.assignment;

abstract class Buyer {
    private Mediator mediator;
    String name;
    int price;

    Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void bid(int price);
    abstract void cancelBid();
    abstract void auctionHasEnded();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

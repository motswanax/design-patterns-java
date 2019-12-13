package com.svs.behavioral.commandPattern.assignment;

class BuyStock implements Order {

    private Stock myStock;

    BuyStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.buy();
    }
}

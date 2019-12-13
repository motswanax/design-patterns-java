package com.svs.behavioral.commandPattern.assignment;

class SellStock implements Order {

    private Stock myStock;

    SellStock(Stock myStock) {
        this.myStock = myStock;
    }

    @Override
    public void execute() {
        myStock.sell();
    }
}

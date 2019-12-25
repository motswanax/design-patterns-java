package com.svs.behavioral.visitor.assignment;

class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    // collect data about the book
    @Override
    public void visit(Book book) {
        // assume we have a calculation here related to weight and price free postage for a book over $20
        if (book.getPrice() < 20.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 20.0) {
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20.0) {
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

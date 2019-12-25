package com.svs.behavioral.visitor.example;

interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}

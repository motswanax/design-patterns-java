package com.svs.behavioral.visitor.example;

interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

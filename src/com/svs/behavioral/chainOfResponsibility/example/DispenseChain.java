package com.svs.behavioral.chainOfResponsibility.example;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}

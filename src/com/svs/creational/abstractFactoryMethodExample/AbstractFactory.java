package com.svs.creational.abstractFactoryMethodExample;

abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

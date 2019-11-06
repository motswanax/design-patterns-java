package com.svs.factoryAbstractCreatorExample;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    Shape getShape() {
        return factoryMethod();
    }

    // other methods here
}

class RectangeFactory  extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory  extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory  extends AbstractShapeFactory {

    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}

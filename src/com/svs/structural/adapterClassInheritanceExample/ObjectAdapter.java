package com.svs.structural.adapterClassInheritanceExample;

class ObjectAdapter {
    private IntegerValueInterface myInt;

    ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}

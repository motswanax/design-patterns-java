package com.svs.structural.adapterClassInheritanceExample;

public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

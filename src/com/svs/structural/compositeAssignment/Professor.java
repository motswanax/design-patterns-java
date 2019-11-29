package com.svs.structural.compositeAssignment;

/**
 * This is the Leaf
 * @author baike
 */
class Professor implements Faculty {
    private String mName;
    private String mPosition;
    private  int mOfficeNum;

    String getName() {
        return mName;
    }

    String getPosition() {
        return mPosition;
    }

    int getOfficeNum() {
        return mOfficeNum;
    }

    Professor(String mName, String mPosition, int mOfficeNum) {
        this.mName = mName;
        this.mPosition = mPosition;
        this.mOfficeNum = mOfficeNum;
    }

    @Override
    public String getDetails() {
        return mName + " is the " + mPosition + ". Office number: " + mOfficeNum;
    }
}

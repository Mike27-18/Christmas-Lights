package com.christmas;

public class CordinatePair{
    private int leftX;
    private int leftY;
    private int rightX;
    private int rightY;

    private CordinatePair(int leftX, int leftY, int rightX, int rightY){
        this.leftX = leftX;
        this.leftY = leftY;
        this.rightX = rightX;
        this.rightY = rightY;
    }

    public static CordinatePair of(int leftX, int leftY, int rightX, int rightY){
        return new CordinatePair(leftX, leftY, rightX, rightY);
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        // has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = myMinValue/2;
        System.out.println("myTotal =" + myTotal);

        // has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);


        // has a width of 36
        short myShortValue = 32767;
        short myNewShortValue = (short)(myShortValue/2);

        // has a width of 64
        long myLongValue = 100l;

    }
}

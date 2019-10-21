package com.company;

public class Main {

    public static void main(String[] args) {
        // max and min values stored in integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // max and minimum values stored in byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
       
       
        // max and minimum values stored in short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        // max and minimum values stored in Long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Casting
        byte myNewByteValue = (byte) (myMinByteValue / 2); 
        float myFloatValue = (float) 5.25;
        // max and minimum values stored in float

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myMinFloatValue);
        System.out.println("Float maximum value " + myMaxFloatValue);
        
        // max and minimum values stored in Double

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value " + myMinDoubleValue);
        System.out.println("Double maximum value " + myMaxDoubleValue);

        // calculating pound to kilogram.

        double myKilograms = 3d;
        double onePound = 0.45359237;
        double myResult = myKilograms / onePound;
        System.out.println("My kilograms in pound are = " + myResult);
    }
}

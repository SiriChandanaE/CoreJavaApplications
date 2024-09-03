package com.evergent.coreJAVA.casting;
public class DataLossExample {
    public static void main(String[] args) {
        int largeNum = 130;
        byte smallNum = (byte) largeNum; //Explicit casting from int to byte

        System.out.println("Original integer value: " + largeNum);
        System.out.println("Byte value (after casting): " + smallNum); 
        // Output may be unexpected due to overflow
    }
}
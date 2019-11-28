package com.bridgelabz.generics;

import java.lang.reflect.Array;

public class PrintArray <X, Y, Z>{

    private Integer[] intArray;
    private Double[] doubleArray;
    private Character[] charArray;

    private Array myArray;

    public PrintArray(Integer[] intArray, Double[] doubleArray, Character[] charArray) {
        this.intArray = intArray;
        this.doubleArray = doubleArray;
        this.charArray = charArray;
    }

    public void printArray(Integer[] intArray, Double[] doubleArray, Character[] charArray) {
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }

    private static <E> void toPrint(E array[]) {
        for (E i:array) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Integer intArray[] = {1, 2, 3, 4};
        Double doubleArray[] = {1.1, 2.1, 3.1, 4.1};
        Character charArray[] = {'a','b','c'};
        new PrintArray<Integer, Double, Character>(intArray, doubleArray, charArray).printArray(intArray, doubleArray, charArray);
    }

}

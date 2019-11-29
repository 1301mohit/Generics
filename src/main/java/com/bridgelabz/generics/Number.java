package com.bridgelabz.generics;

public class Number<X extends Comparable> {

    X number1;
    X number2;
    X number3;

    public Number(X number1, X number2, X number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public X maximumValue(){
        X maximum = this.number1;
        if(this.number2.compareTo(maximum) > 0)
            maximum = number2;
        if(this.number3.compareTo(maximum) > 0)
            maximum = number3;
        printMaximum(maximum);
        return maximum;
    }

    public <X> void printMaximum(X maxValue) {
        System.out.println("Maximum value:"+maxValue);
    }
}

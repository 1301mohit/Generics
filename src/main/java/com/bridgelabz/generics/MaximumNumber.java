package com.bridgelabz.generics;

public class MaximumNumber {

    public Integer maximumValueinInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximumNumber = number1;
        if(number2.compareTo(maximumNumber) > 0)
            maximumNumber = number2;
        if(number3.compareTo(maximumNumber) > 0)
            maximumNumber = number3;
        return maximumNumber;
    }

    public Float maximumValueInFloat(Float number1, Float number2, Float number3) {
        Float maximumNumber = number1;
        if(number2.compareTo(maximumNumber) > 0)
            maximumNumber = number2;
        if(number3.compareTo(maximumNumber) > 0)
            maximumNumber = number3;
        return maximumNumber;
    }

    public String maximumValueInString(String str1, String str2, String str3) {
        String maximum = str1;
        if(str2.compareTo(maximum) > 0)
            maximum = str2;
        if(str3.compareTo(maximum) > 0)
            maximum = str3;
        return maximum;
    }

    public <E extends Comparable<E>> E maximumValue(E num1, E num2, E num3){
        E maximum = num1;
        if(num2.compareTo(maximum) > 0)
            maximum = num2;
        if(num3.compareTo(maximum) > 0)
            maximum = num3;
        return maximum;
    }
}

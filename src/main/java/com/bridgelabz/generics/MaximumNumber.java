package com.bridgelabz.generics;

public class MaximumNumber {

    public static Integer maximumValueinInteger(Integer number1, Integer number2, Integer number3) {
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
}

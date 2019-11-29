package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void readNumber_Checkmaximum_ReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValueinInteger(10, 20, 30);
        Assert.assertEquals(30, result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrue1() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValueinInteger(20,10,30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInFloat() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValueInFloat(1.1f, 1.2f, 1.3f);
        Assert.assertEquals(1.3, result, 0.01);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInFloat1() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValueInFloat(1.2f,1.1f,1.3f);
        Assert.assertEquals(1.3f, result, 0.01);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInString() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.maximumValueInString("abc","bcd","cde");
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInString1() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.maximumValueInString("bcd", "cde", "abc");
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.maximumValue("bcd", "cde", "abc");
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueForInteger() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValue(1, 2, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void readNumber_CheckMaximumInInteger() {
        Number number = new Number(10, 20, 30);
        Integer result = (Integer)number.maximumValue();
        Assert.assertEquals((Integer) 30, result);
    }

    @Test
    public void readNumber_CheckMaximumInFloat() {
        Number number = new Number(10.1f, 10.2f, 10.3f);
        Float result = (Float)number.maximumValue();
        Assert.assertEquals((Float) 10.3f, result);
    }

    @Test
    public void readNumber_CheckMaximumInString() {
        Number number = new Number("abc", "bcd", "cde");
        String result = (String)number.maximumValue();
        Assert.assertEquals("cde", result);
    }

}

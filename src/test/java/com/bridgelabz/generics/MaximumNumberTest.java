package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void readNumber_Checkmaximum_ReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValueinInteger(30, 20, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrue1() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValueinInteger(20,30,10);
        Assert.assertEquals(30,result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrue2() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValueinInteger(10, 20 , 30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInFloat() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValueInFloat(1.1f, 1.2f, 1.3f);
        Assert.assertEquals(1.3f, result, 0.01f);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInFloat1() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValueInFloat(1.2f,1.3f,1.1f);
        Assert.assertEquals(1.3f, result, 0.01f);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueInFloat2() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValueInFloat(1.3f,1.2f,1.1f);
        Assert.assertEquals(1.3f, result, 0.01f);
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
    public void readNumber_CheckMaximum_ReturnTrueInString2() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.maximumValueInString("cde", "bcd", "abc");
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueForString() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String result = maximumNumber.maximumValue("cde", "bcd", "abc");
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueForInteger() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int result = maximumNumber.maximumValue(1, 2, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void readNumber_CheckMaximum_ReturnTrueForFloat() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float result = maximumNumber.maximumValue(1.1f, 2.1f, 3.1f);
        Assert.assertEquals(3.1f, result, 0.01);
    }

    @Test
    public void readNumber_CheckMaximumInInteger() {
        Number number = new Number(10, 20, 30);
        int result = (int)number.maximumValue();
        Assert.assertEquals( 30, result);
    }

    @Test
    public void readNumber_CheckMaximumInFloat() {
        Number number = new Number(10.1f, 10.2f, 10.3f);
        float result = (float)number.maximumValue();
        Assert.assertEquals( 10.3f, result, 0.01);
    }

    @Test
    public void readNumber_CheckMaximumInString() {
        Number number = new Number("abc", "bcd", "cde");
        String result = (String)number.maximumValue();
        Assert.assertEquals("cde", result);
    }

    @Test
    public void readNumber_CheckMaximum() {
        Number number = new Number();
        int result = (int)number.maximumValue(10, 20, 30, 40, 50, 60);
        Assert.assertEquals(60, result);
    }

}

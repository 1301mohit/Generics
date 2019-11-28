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

}

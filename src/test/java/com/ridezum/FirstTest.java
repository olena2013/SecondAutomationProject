package com.ridezum;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends BaseTest {

    @Test
    public void checkTitleTest() {
        String titleExpected = "Zūm | Rides for Kids, After School Care";
        String titleActual = driver.getTitle();
        Assert.assertEquals(titleExpected, titleActual);


    }
}

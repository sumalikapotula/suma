package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        User us = new User();
        boolean result = us.userFirstName("Sumalika");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        User us = new User();
        boolean result = us.userFirstName("So");
        Assert.assertEquals("true", result);
    }
}

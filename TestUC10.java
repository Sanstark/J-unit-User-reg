package com.day10.junit.program.testfile;

import com.day10.junit.program.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUC10 {
    UserRegistration ur= new UserRegistration();

    @Test
    public void fNValidation() {
        Assert.assertTrue(ur.firstName("Santhosh"));
    }
    @Test
    public void lNValidation() {
        Assert.assertTrue(ur.lastName("Ramachandran"));
    }
    @Test
    public void emailValidation() {
        Assert.assertTrue(ur.email("rsanthosh@nitt.edu"));
    }
    @Test
    public void mobileValidation() {
        Assert.assertTrue(ur.mobile("91 9578536223"));
    }
    @Test
    public void passwordValidation() {
        Assert.assertTrue(ur.password("Dsdsjdjd$2234"));
    }
    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assert.assertEquals("Sad",ur.happySad("Sad"));
    }

}

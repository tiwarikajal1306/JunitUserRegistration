package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

       JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
        boolean result;


    @Test
    public void fistNameValidation_True_ifFirstNameProper() {
        result = junitUserRegistration.validFirstName("Kajal");
        Assert.assertTrue(result);
    }

    @Test
    public void fistNameValidation_False_NotContainMinimumCharacter() {
        result = junitUserRegistration.validFirstName("Ka");
        Assert.assertTrue(result);
    }

    @Test
    public void fistNameValidation_False_NotContainUpperCaseLetter() {
        result = junitUserRegistration.validFirstName("kaju");
        Assert.assertTrue(result);
    }

    }

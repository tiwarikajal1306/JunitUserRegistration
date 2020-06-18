package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

       JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
        boolean result;


    @Test
    public void firstNameValidation_True_ifFirstNameProper() {
        result = junitUserRegistration.validFirstName("Kajal");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameValidation_False_NotContainMinimumCharacter() {
        result = junitUserRegistration.validFirstName("Ka");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameValidation_False_NotContainUpperCaseLetter() {
        result = junitUserRegistration.validFirstName("kaju");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameValidation_True_ifLastNameProper() {
        result = junitUserRegistration.validFirstName("Tiwari");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameValidation_False_NotContainMinimumCharacter() {
        result = junitUserRegistration.validFirstName("Ti");
        Assert.assertTrue(result);
    }

    @Test
    public void lastNameValidation_False_NotContainUpperCaseLetter() {
        result = junitUserRegistration.validFirstName("tiwari");
        Assert.assertTrue(result);
    }

    }

package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistration {

       JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
        boolean result;

    private String keys;
    private boolean values;

    public UserRegistration(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }
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
    @Parameterized.Parameters
    public static Collection<Object[]> testForEmail(){
        Object[][] testForEmails = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.net", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {".abc@gmail.com", false},
                {"alice.@example.c", false},
                {"alice@example.dd..com", false},
                {"alice:;@example.com", false},
                {"?alice.@example.com", false}
        };
        return Arrays.asList(testForEmails);
    }

    @Test
    public void validateEmail() {
        boolean result = junitUserRegistration.validateEmail(keys);
        Assert.assertEquals(result,values);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> checkValidNumber(){
        Object[][] testingMobile = new Object[][]{
                {"91 9822917991", true},
                {"91   9822917991", false},
                {"913 9822917991", true},
                {"9822917991", false}
        };
        return Arrays.asList(testingMobile);
    }

    @Test
    public void validateMobileNumber() {
        boolean result = junitUserRegistration.validMobileNumber(keys);
        Assert.assertEquals(result,values);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForPassword(){
        Object[][] testingPasswords = new Object[][]{
                {"Kaju14355", true},
                {"kaju", false},
                {"kaju12345" , false},
                {"kaJu1345" , true}
        };
        return Arrays.asList(testingPasswords);
    }

    @Test
    public void validatePassword() {
        boolean result = junitUserRegistration.validPassword(keys);
        Assert.assertEquals(result,values);
    }


    }

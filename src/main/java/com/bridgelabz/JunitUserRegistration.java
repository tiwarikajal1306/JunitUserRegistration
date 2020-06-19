package com.bridgelabz;


public class JunitUserRegistration {
    public boolean validFirstName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}");
    }


    public boolean validateEmail(String emailid) {
        return emailid.matches("^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})*$");

    }
    public boolean validMobileNumber(String number) {
        return number.matches("^[1-9]+[0-9]+[\\ ]?+[1-9]{1}[0-9]{9}$");

        }

    public boolean validPassword(String password) {
        return password.matches("(?=[^A-Z]*[a-zA-Z]){8,}$");
    }
    }


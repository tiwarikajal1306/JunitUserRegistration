package com.bridgelabz;


public class JunitUserRegistration {
    public boolean validFirstName(String firstName) {
        return firstName.matches("^[A-Z]{1}[a-z]{2,}");
    }
}

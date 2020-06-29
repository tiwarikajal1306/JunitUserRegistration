package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class PasswordCheck {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
    boolean result;
    private String keys;
    private boolean values;
    public PasswordCheck(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> testForPassword(){
        Object[][] testingPasswords = new Object[][]{
                {"@Kaju14355", true},
                {"kaju", false},
                {"kaju12345" , false},
                {"kaJu1345" , false},
                {"KajalTiwari" , false}
        };
        return Arrays.asList(testingPasswords);
    }
    @Test
    public void validatePassword() {
        boolean result = junitUserRegistration.validPassword(keys);
        Assert.assertEquals(result,values);
    }
}
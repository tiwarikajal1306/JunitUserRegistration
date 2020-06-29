package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class NumberCheck {
    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
    boolean result;
    private String keys;
    private boolean values;
    public NumberCheck(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> checkValidNumber(){
        Object[][] testingMobile = new Object[][]{
                {"91 9822717882", true},
                {"91   9822947884", false},
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
}
package com.myfirstproject;
import org.junit.Assert;
import org.junit.Test;
public class Day03_Assertions {
    @Test
    public void assertions(){
        /*
         * *****ASSERTIONS*****
         * if expected = actual
         * if assertion fails we see red error
         * if assertion pass we see green checkmark
         *
         * */
//       1.assertEquals("MESSAGE WHEN FAILS", "EXPECTED", "ACTUAL")
//        Assert.assertEquals("TEST CASE IS FAILEd!!!","java","javascript");
//        org.junit.ComparisonFailure: TEST CASE IS FAILEd!!!
//        Expected :java
//        Actual   :javascript
        Assert.assertEquals(5,5);
        //2. assertTrue(BOOLEAN)
//        Assert.assertTrue("JAVA".contains("E"));
//        java.lang.AssertionError
        Assert.assertTrue("SELENIUM".contains("E"));//PASS
        //3. assertFalse(BOOLEAN)
        Assert.assertFalse("JAVA".contains("E"));//PASS
        Assert.assertFalse("SELENIUM".contains("E"));//FAIL
    }
}
package com.svvt.CodeCoverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    String input1 = "noon";
    App app = new App();
    boolean expected = true;
    
    @Test
    public void isPalindromeTest()
    {
        assertEquals( expected, app.isPalindrome(input1) );
    }
}



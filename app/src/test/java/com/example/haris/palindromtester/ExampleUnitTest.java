package com.example.haris.palindromtester;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private PalindromTester palindromTester;

    @Before
    public void setUp(){
        palindromTester = new PalindromTester();
    }

    @Test
    public void True() throws Exception {

        assertEquals(true, PalindromTester.isPalindrome("Lagerregal"));
    }

    @Test
    public void False(){
        assertEquals(false, PalindromTester.isPalindrome("Apfelbaum"));
    }


}
package com.btcodegym;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FizzBuzzTest {
    @Test
    public void testFizz() {
        int actual = 3;
        String expected = "FIZZ";
        String result = FizzBuzz.fizzBuzz(actual);
        assertEquals(expected,result);
    }

    @Test
    public void testBuzz() {
        int actual = 5;
        String expected = "BUZZ";
        String result = FizzBuzz.fizzBuzz(actual);
        assertEquals(expected,result);
    }

    @Test
    public void testFizzBuzz() {
        int actual = 15;
        String expected = "FIZZBUZZ";
        String result = FizzBuzz.fizzBuzz(actual);
        assertEquals(expected,result);
    }

    @Test
    public void testException() {
        int actual = 11;
        String expected = "FIZZBUZZ";
        String result = FizzBuzz.fizzBuzz(actual);
        assertEquals(expected,result);
    }

}

package com.btcodegym;

public class FizzBuzz {
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";
    public static final String FIZZ_BUZZ = "FIZZBUZZ";
    public static String fizzBuzz(int number){
        boolean DIVISIBLEBY3 = number % 3 == 0;
        boolean DIVISIBLEBY5 = number % 5 == 0;
        if(DIVISIBLEBY3 && DIVISIBLEBY5)
            return FIZZ_BUZZ;

        if(DIVISIBLEBY3)
            return FIZZ;

        if(DIVISIBLEBY5)
            return BUZZ;

        return number + "";
    }
}

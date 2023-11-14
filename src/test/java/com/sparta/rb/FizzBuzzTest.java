package com.sparta.rb;

import com.sparta.rb.fizzbuzz.FizzBuzzGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    //TDD process
    //1.Red - Write a failing test
    //2.Green - Write enough code to pass the test
    //3.Refactor - All tests should still pass
    
    @Test
    @DisplayName("Check that 3 returns fizz")
    void checkThat3ReturnsFizz() {
        Assertions.assertEquals("fizz", FizzBuzzGenerator.getValue(3));
    }

    @Test
    @DisplayName("Check that 5 returns buzz")
    void checkTat5ReturnsBuzz() {
        Assertions.assertEquals("buzz", FizzBuzzGenerator.getValue(5));
    }
}

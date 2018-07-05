package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void zero() {
        Solution solution = new Solution();
        assertEquals(0, solution.addDigitsRec(0));
    }

    @Test
    void lessThanTen() {
        Solution solution = new Solution();
        assertEquals(4, solution.addDigitsRec(4));
    }

    @Test
    void endsWithZero() {
        Solution solution = new Solution();
        assertEquals(4, solution.addDigitsRec(40));
    }

    @Test
    void endsWithTwoZeros() {
        Solution solution = new Solution();
        assertEquals(7, solution.addDigitsRec(700));
    }

    @Test
    void threeDigitNumber() {
        Solution solution = new Solution();
        assertEquals(5, solution.addDigitsRec(563));
    }
}
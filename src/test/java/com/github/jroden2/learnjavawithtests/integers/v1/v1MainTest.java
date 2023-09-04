package com.github.jroden2.learnjavawithtests.integers.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class v1MainTest {

    @Test
    void add() {
        int got = main.Add(2,2);
        int expected = 4;

        assertEquals(got, expected);
    }

    @Test
    void subtract() {
        int got = main.Subtract(2,2);
        int expected = 0;

        assertEquals(got, expected);
    }

    @Test
    void multiply() {
        int got = main.Multiply(2,2);
        int expected = 4;

        assertEquals(got, expected);
    }

    @Test
    void divide() {
        int got = main.Divide(2,2);
        int expected = 1;

        assertEquals(got, expected);
    }
}
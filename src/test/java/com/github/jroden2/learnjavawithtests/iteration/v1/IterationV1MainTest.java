package com.github.jroden2.learnjavawithtests.iteration.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterationV1MainTest {

    @Test
    void repeat() {
        String got = main.Repeat('a');
        String expected = "aaaaa";

        assertEquals(got, expected);
    }
}
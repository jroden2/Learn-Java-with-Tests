package com.github.jroden2.learnjavawithtests.iteration.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class v2MainTest {

    @Test
    void repeat() {
        String got = main.Repeat('a');
        String expected = "aaaaa";

        assertEquals(got, expected);
    }

    @Test
    void repeatWithCount() {
        String got = main.Repeat('a', 7);
        String expected = "aaaaaaa";

        assertEquals(got, expected);
    }

    @Test
    void repeatWithCount_ValueAt0() {
        String got = main.Repeat('a', 0);
        String expected = "a";

        assertEquals(got, expected);
    }

    @Test
    void repeatWithCount_ValueAt1() {
        String got = main.Repeat('a', 1);
        String expected = "a";

        assertEquals(got, expected);
    }


}
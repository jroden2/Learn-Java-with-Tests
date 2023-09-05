package com.github.jroden2.learnjavawithtests.helloworld.v3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldV3MainTest {

    @Test
    void greet() {
        var got = main.greet("Jack");
        String expected = "Hello, Jack";

        assertEquals(got, expected);
    }

    @Test
    void greetWithFail() {
        var got = main.greet("");
        String expected = "Hello, World.";

        assertNotEquals(got, expected);
    }
}
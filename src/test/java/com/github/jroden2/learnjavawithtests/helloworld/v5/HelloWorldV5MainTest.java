package com.github.jroden2.learnjavawithtests.helloworld.v5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldV5MainTest {

    @Test
    void testTemplateFormat() {
        var got = main.template;
        String want = "Hello, %s.";

        assertEquals(got, want);
    }

    @Test
    void greet() {
        var got = main.greet();
        String expected = "Hello, World.";

        assertEquals(got, expected);
    }

    @Test
    void greetWithName() {
        var got = main.greet("Jack");
        String expected = "Hello, Jack.";

        assertEquals(got, expected);
    }

    @Test
    void greetWithEmptyString_EmptyString() {
        var got = main.greet("");
        String expected = "Hello, World.";

        assertEquals(got, expected);
    }

    @Test
    void greetWithEmptyString_Space() {
        var got = main.greet(" ");
        String expected = "Hello, World.";

        assertEquals(got, expected);
    }


}
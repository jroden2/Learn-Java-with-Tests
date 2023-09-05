package com.github.jroden2.learnjavawithtests.helloworld.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldV2MainTest {

    @Test
    public void TestGreetVar() {
        var got = main.greet;
        String want = "Hello, World.";

        assertEquals(got, want);
    }
}
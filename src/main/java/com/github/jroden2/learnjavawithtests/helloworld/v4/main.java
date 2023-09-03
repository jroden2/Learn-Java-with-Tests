package com.github.jroden2.learnjavawithtests.helloworld.v4;

public class main {

    public static final String template = "Hello, %s.";
    public static String greet(String name) {
        if (name.equals("") || name.isEmpty()) {
            return String.format(template, "World");
        }

        return String.format(template, name);
    }

    public static void main(String[] args) {
        System.out.println(greet(""));
        System.out.println(greet("Jack"));
    }

}

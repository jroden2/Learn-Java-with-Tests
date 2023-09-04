package com.github.jroden2.learnjavawithtests.iteration.v1;

public class main {

    public static String Repeat(char letter) {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            SB.append(letter);
        }

        return SB.toString();
    }

    public static void main(String[] args) {
        System.out.println(Repeat('a'));
    }

}

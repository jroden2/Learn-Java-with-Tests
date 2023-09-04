package com.github.jroden2.learnjavawithtests.iteration.v2;

public class main {

    public static String Repeat(char letter) {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            SB.append(letter);
        }

        return SB.toString();
    }

    public static String Repeat(char letter, int count) {
        if (count > 1) {
            StringBuilder SB = new StringBuilder();
            for (int i = 0; i < count; i++) {
                SB.append(letter);
            }

            return SB.toString();
        } else {
            return Character.toString(letter);
        }
    }

    public static void main(String[] args) {
        System.out.println(Repeat('a'));
        System.out.println(Repeat('a', 0));
        System.out.println(Repeat('a', 1));
        System.out.println(Repeat('a', 7));
    }

}

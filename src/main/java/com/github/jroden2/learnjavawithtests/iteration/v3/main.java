package com.github.jroden2.learnjavawithtests.iteration.v3;

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

    public static String reverseString(String word) {
        int n = word.length();
        int j = n;

        char[] retVal = new char[n];
        char[] chars = word.toCharArray();

        for (int i = 0; i < n; i++) {
            retVal[j - 1] = chars[i];
            j = j - 1;
        }

        return new String(retVal);
    }

    public static void main(String[] args) {
        System.out.println(Repeat('a'));
        System.out.println(Repeat('a', 0));
        System.out.println(Repeat('a', 1));
        System.out.println(Repeat('a', 7));

        System.out.println(reverseString("hello"));

    }

}

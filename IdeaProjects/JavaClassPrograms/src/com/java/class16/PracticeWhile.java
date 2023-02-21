package com.java.class16;

public class PracticeWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " +i);
        }
        int count = 0;
        while (count < 10) {
            count++;
            if (count%2 != 0) continue;
            System.out.println(count);

        }

    }
}

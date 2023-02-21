package com.java.class24;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};
        int min = data[0];
        for (int temp : data ) {
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}

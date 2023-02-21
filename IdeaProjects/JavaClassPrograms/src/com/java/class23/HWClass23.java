package com.java.class23;

import java.util.Arrays;

public class HWClass23 {
    public static void main(String[] args) {
        /*1. Write a program to get a collection of elements and print it in reverse order
        Input: 1 2 3 4 5
        Output: 5 4 3 2 1*/
        int list[] = {1, 2, 3, 4, 5,};
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("3=====================");
        /*3. Program to print the elements of an array present in the odd position
        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
        Output: 65, 24, 85, 65, 85*/

        int data[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        for (int i = 1; i < data.length; i += 2) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        /*2.  Write a program to find the duplicate elements from the array (The element should not be repeated in the output ) - Brainstorm to find the logic
        Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
        Output: 45, 65, 85*/

        System.out.println("2=======================");
        int listnums[] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        for (int i = 0; i < listnums.length; i++) {
            for (int j = i + 1; j < listnums.length; j++) {
                if (listnums[i] == listnums[j]) {
                    System.out.println(listnums[j]);

                }
            }
        }
        System.out.println("4==================");
        /*4. Write a program to sort array elements in ascending order
        Input: 5 2 8 7 1
        Output: 1 2 5 7 8*/
        int data2[] = {5, 2, 8, 7, 1};
        Arrays.sort(data2);
        for (int i = 0; i < data2.length; i++) {
        }
        System.out.println(Arrays.toString(data2));
    }
}

package com.java.class24;

import java.util.Arrays;

public class HW242 {
    public static void main(String[] args) {
        /*2.  Write a program to find the sum of array elements using for-each loop
        Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        Output: 55*/
        int data [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum =0;
        for (int temp : data ) {
            sum+=temp;
        }
        System.out.println(sum);
        System.out.println("3=====================");
        /*3. Program to print the sum of the smallest and greatest number from the array using for-each loop
        Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
        Output: 124 (100 + 24)*/
        int data2[] = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int max =data2[0];
        int min = data2[0];
        for (int temp: data2) {
            if (max<temp) {
                max=temp;
            }
            else if (min>temp) {
                     min=temp;
            }
        }
        System.out.println("The Greatest :"+ max);
        System.out.println("The Smallest :"+ min);
        System.out.println("Their sum :"+ (max+min));
        System.out.println("4====================");
        //4. Write a program to sort array elements in ascending order using for-each loop
        //Input: 5 2 8 7 1
        //Output: 1 2 5 7 8*/
        int data3[] = {5, 2, 8, 7, 1};
        Arrays.sort(data3);
        for (int temp: data3) {

        }
        System.out.println(Arrays.toString(data3));
    }
}

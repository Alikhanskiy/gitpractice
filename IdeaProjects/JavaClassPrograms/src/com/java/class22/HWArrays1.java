package com.java.class22;

import java.util.Scanner;
//Array - collection of values of similar type
public class HWArrays1 {
    public static void main(String[] args) {
        /*1.  Write a program to find the greatest number from an array
                Example
        Input - 12, 45, 67, 23, 13, 45, 56
        Output - 67*/

        int listOfData[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers");
        for (int i = 0; i< listOfData.length;i++) {
            listOfData[i] = sc.nextInt();
        }
        int max =0;
        for (int i =0;i < listOfData.length;i++) {
            if (listOfData[i]>max) {
                max = listOfData[i];
            }
    }
        System.out.println("The Greatest in array : "+max);
        System.out.println("2================");
        /*2.  Write a program to find the sum of even and odd numbers
        Example
        Input - 12, 45, 67, 23, 13, 45, 56
        Output - Sum of Even Elements - 68, Sum of Odd Elements - 193*/
        int list[] = {12,9,56,99,68,34,77};
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0;i<list.length;i++) {
            if (list[i]%2==0) {
                sumEven+=list[i];
            }
            else {
                sumOdd+=list[i];
            }
        }
        System.out.println("The sum of even numbers : "+sumEven);
        System.out.println("The sum of odd numbers : " +sumOdd);
        System.out.println("3==================");
        /*3.  Write a program to count number of positive(consider zero also positive) and negative numbers from an array
        Example
        Input - 12, -45, 67, 23, -13, 45, -56
        Output - Positive Elements - 4, Negative Elements - 3*/
        int list2[] = {9,-67,86,-44,76,53,-59};
        int pos = 0;
        int neg = 0;
        for (int i =0;i<list2.length;i++) {
            if (list2[i]>=0){
                pos++;
            }
            else {
                neg++;
            }
        }
        System.out.println("Positive numbers : "+pos);
        System.out.println("Negative numbers : "+neg);
    }
}

package com.java.class23;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declaration of Two Dimensional Array
        int data[][] = {
                {34,54,23},
                {34,45,23},
                {54,56,34}
        };
        //Access one of the element from2D array
        System.out.println(data[0][0]);
        //print all data
        for(int i =0;i<3;i++) {
            for (int j =0;j<3;j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
        //find number of rows in 2D Array
        System.out.println(data.length);
        //find number of column in 2d array
    }

}

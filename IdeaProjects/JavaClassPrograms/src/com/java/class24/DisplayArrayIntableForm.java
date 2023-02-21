package com.java.class24;
//find out sum of all elements from  2D Array
//sum of row 1 =15
//sum of row 2 =14
//sum of row 3 = 10
public class DisplayArrayIntableForm {
    public static void main(String[] args) {
        int data[][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1}
        };
        for (int i =0;i<data.length;i++) {
            for (int j =0;j<data[i].length;j++) {
                System.out.print(data[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("=================");
        int sum = 0;
        for (int i = 0;i<3;i++) {
            for (int j =0;j<3;j++) {
                sum+= data[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("===============");

        for (int i =0;i<data.length;i++) {
            int sum2 = 0;
            for (int j =0;j<data[i].length;j++) {
                sum2 = sum2+data[i][j];

            }
            System.out.println("Sum of row " + (i+1) + " = " + sum2);
        }
        System.out.println("====================");
        System.out.println(data.length);
        System.out.println(data[2].length);
    }
}

package com.java.class18;

public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 3== 0) {
                i = i + 2;
            }
            i++;
            System.out.println(i);
        }
        /*while (i<=10) {
            System.out.println(i);
            if (i%3==0) {
                i--;
            }
            else if (i%2==0) {
                i=i+2;
            }
            else {
                i++;
            }
            i++;//i=i+2;to execute it
        }*/
        System.out.println("==================");
        int startYear = 1900;
        int endYear = 2010;
        int leapYears = 0;
        while (startYear<endYear) {

            if (startYear % 4 ==0 || startYear % 400 ==0 && startYear% 100!=0) {
                leapYears++;

            } startYear++;
        }
        System.out.println(leapYears);

    }
}


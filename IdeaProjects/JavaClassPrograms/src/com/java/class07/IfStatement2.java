package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age > 16) {
            System.out.println("You are eligible to drive!");
        }
        if (age <= 16) {
            System.out.println("You are too young to drive!");
        }
        System.out.println("Please enter the temperature degree: ");
        int tempdegree = input.nextInt();
        if (tempdegree < 32) {
            System.out.println("It's Freezing.Stay Home!");
        }
        if (tempdegree >= 32 && tempdegree < 41 ) {
            System.out.println("It's little chilly outside!");
        }
        if (tempdegree >= 42 && tempdegree < 68) {
            System.out.println("It's a good weather outside.Go get some fresh air!");
        }
        if (tempdegree >= 68) {
            System.out.println("It's amazing outside.Let's go to the pool and get vitamin D!");
        }
        System.out.println("Homework Java exercices!!!!!!!!!!!!!!!!");
        System.out.println("How many java exercises are you solving per day? : ");
        int exercises = input.nextInt();
        if (exercises < 3) {
            System.out.println("You are too lazy!");
        }
        if (exercises >= 3 && exercises < 5) {
            System.out.println("Good job,but you should do better!");
        }
        if (exercises >= 5) {
            System.out.println("Great job!You are on the right track!");
        }
    }
}

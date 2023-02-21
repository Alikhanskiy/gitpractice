package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        // Conditional OR ||
        //is used for setting multiple conditions
        //and overall result is true only if one of them is true
        //ex: I want to give discounts to multiple group of people
        //if you are older than 60
        //if you are younger than 8
        int age = 61;
        boolean giveDiscount = age > 60 || age < 8;
        System.out.println(giveDiscount);
        //difference between && -> all conditions must be true
        // || -> at least one of them must be true
        //if 24 hr time
        int currentTime = 10;
        //drink coffee should be true if  current time is 6-11.
        boolean drinkCoffee = currentTime > 6 && currentTime < 11;
        System.out.println(drinkCoffee);
        // tell me when I can start relax
        //when you completed 5 java exercises
        //or when you recorded 2 soft-skills videos
        int howManyJavaExercises = 4;
        int howManySoftSkillsVideos = 1;
        boolean canIRelaxNow = howManyJavaExercises >= 5 || howManySoftSkillsVideos >= 2;
        System.out.println(canIRelaxNow);
        //Banking industry application
        //when should the bank account be blocked?
        //login Attempts more than 3
        //transaction amount more than $3000
        //location of transaction -> must match your current location
        int numberOfLoginAttempts = 4;
        double transactionAmount = 2000.0;
        String locationOfTransaction = "USA";//==,!=
        boolean block = numberOfLoginAttempts >= 3 || transactionAmount >= 3000.0 || locationOfTransaction != "USA";
        System.out.println(block);
        //you store text in a String data type
        //login functionality
        //write a logic which would tell the user if logged in or not
        //you have a username
        //you have a password
        //your loginLocation
        //in order to be logged in your username should match steve@apple.com
        //and your password should be infinityLoop1
        //and your location should be california
        boolean login = true;
        String passWord = "infinityLoop1";
        String location = "New York";
        String userName = "steve@apple.com";
        login = passWord == "infinityLoop1" && location == "california" && userName == "steve@apple.com";
        System.out.println(login);
    }
}

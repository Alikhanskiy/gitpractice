package com.java.class10;

import java.util.Scanner;

public class NestedIfRecap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Main course");
        System.out.println("2. Appetiser");
        System.out.println("3. Drinks");
        String meal = input.nextLine();

        if (meal.equalsIgnoreCase("Appetiser") || meal.equals("2")) {
            System.out.println("Your appetiser options are : ");
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg rolls");
            String choiceAppetiser = input.nextLine();
            if (choiceAppetiser.equalsIgnoreCase("Egg rolls") || choiceAppetiser.equals("2")) {
                System.out.println("Egg roll ingredients");
            } else if (choiceAppetiser.equalsIgnoreCase("Spring rolls") || choiceAppetiser.equals("1"))
                System.out.println("Spring rolls ingredients");
        else {
            System.out.println("Invalid option");
        }
    }
        else if (meal.equalsIgnoreCase("Main Course") || meal.equals("1")) {
            System.out.println("Your main course options are :");
            System.out.println("1. Lagman");
            System.out.println("2. New York Rib Eye Steak");
            String choiceMainCourse = input.nextLine();
            if (choiceMainCourse.equalsIgnoreCase("Lagman") || choiceMainCourse.equals("1")) {
                System.out.println("Lagman Ingredients");
            }
            else if (choiceMainCourse.equalsIgnoreCase("New York rib Eye Steak") || choiceMainCourse.equals("2")){
                System.out.println("New York Rib EYE Steak ingredients");
            } else {
                System.out.println("Invalid option");
            }
        }
        else if (meal.equalsIgnoreCase("Drinks") || meal.equals("3")) {
            System.out.println("Your drinks options are :");
            System.out.println("1. Orange juice");
            System.out.println("2.Apple juice");
            System.out.println("3. Pineapple juice");
            String choiceOfDrinks = input.nextLine();
            if (choiceOfDrinks.equalsIgnoreCase("Orange juice") || choiceOfDrinks.equals("1")) {
                System.out.println("Orange juice ingredients");
            } else if (choiceOfDrinks.equalsIgnoreCase("Apple juice") || choiceOfDrinks.equals("2")) {
                System.out.println("Apple juice ingredients");
            } else if (choiceOfDrinks.equalsIgnoreCase("Pineapple juice") || choiceOfDrinks.equals("3")) {
                System.out.println("Pineapple juice ingredients");
            } else {
                System.out.println("Invalid option");
            }
        }

        else {
            System.out.println("Invalid option!");
        }
    }
}

package com.java.class05;
//*Compound Operators are easy way to use the current value of a variable
//*and add,substract, multiply or divide by a new value and
//*reassign the resulting value into the original variable
public class CompoundOperators {
    public static void main(String[] args) {
        int num1 = 10;
        num1+=5; //num1 = num1+5
        System.out.println(num1);//15
        int num2 = 11;
        num2+=22;
        System.out.println(num2);//33
        num2+=5;//num2 = num2+5;
        System.out.println(num2);//38
        num2+=11;
        System.out.println(num2);//49
        num2+=14;
        System.out.println(num2);//63
        num2-=11;//num2 = num2-11
        System.out.println(num2);//52
        num2-=5;
        System.out.println(num2);//47
        System.out.println(num2);
        System.out.println(num2-5);//42,num2 remains = 47
        num2-=2;
        System.out.println(num2);//45
        int numberOfChicken = 100;
        numberOfChicken+=50;
        System.out.println(numberOfChicken);//150
        numberOfChicken*=2; //numberOfChicken = numberOfChicken*2;
        System.out.println(numberOfChicken);//300
        numberOfChicken/= 10;//numberOfChicken = numberOfChicken/10;
        System.out.println(numberOfChicken);//30
        numberOfChicken%=2;
        System.out.println(numberOfChicken);//0 ,reminder is 0
        System.out.println("====================================");
        int num = 10;
        System.out.println(num+5);//15,num=10
        num*=2;
        num+=5;
        System.out.println(num+1);//25
        num-=5;//20
        System.out.println(num);//20

    }
}

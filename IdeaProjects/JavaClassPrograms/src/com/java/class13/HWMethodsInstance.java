package com.java.class13;

import com.java.class12.InstanceMethod2;

import java.util.Scanner;

public class HWMethodsInstance {


    public static void main(String[] args) {
        HWMethodsInstance h = new HWMethodsInstance();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(h.isLeap(a));
    }


    public boolean isLeap(int a) {
        if (a <= 0) {
            return false;
        }
        else if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
            return true;
        }
        return false;
    }
}





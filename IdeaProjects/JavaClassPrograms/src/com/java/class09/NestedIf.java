package com.java.class09;

public class NestedIf {
    public static void main(String[] args) {
        boolean outerBoolean = true;
        boolean innerBoolean = false;
        if (true) {
            if (false) {
                System.out.println("Hi from Inner If statement");
            }
        }
        if (false) {
            if (true) {
                System.out.println("Hi 3 ");
            }
        }
        if (true) {
            if (true) {
                System.out.println("Hi 4 ");
            }
            System.out.println("Outer Hi 4");
        }
        if (true) {
            System.out.println("Outer Hi 5.1");

            if (true) {
                System.out.println("Inner Hi 5 ");
            }
            System.out.println("Outer Hi 5.2");
        }

        if (true) {
            System.out.println("Outer Hi 6.1");

            if (false) {
                System.out.println("Inner Hi 6 ");
            }
            System.out.println("Outer Hi 6.2");
        }

        if (false) {
            System.out.println("Outer Hi 7.1");

            if (true) {
                System.out.println("Inner Hi 7 ");
            }
            System.out.println("Outer Hi 7.2");
        }
        if (true) {
            System.out.println("Outer Hi 8.1");

            if (true) {
                System.out.println("Inner Hi 8 ");
            } else {
                System.out.println("Inner else 8 ");
            }
            System.out.println("Outer Hi 8.2");
        }
        if (true) {
            System.out.println("Outer If Hi 9.1");

            if (false) {
                System.out.println("Inner If 9 ");
            } else {
                System.out.println("Inner else 9 ");
            }
            System.out.println("Outer If Hi 9.2");
        }
        if (true) { //outer
            System.out.println("Outer if 10.1");

            if (false) {//inner if
                System.out.println("Inner if 10");
            } else { //inner else
                System.out.println("Inner else 10");
            }
            System.out.println("Outer if 10.2");
        } else {
            System.out.println("Outer elser 10.1");
        }
        if (false) { //outer
            System.out.println("Outer if 11.1");

            if (false) {//inner if
                System.out.println("Inner if 11");
            } else { //inner else
                System.out.println("Inner else 11");
            }
            System.out.println("Outer if 11.2");
        } else { //outer else
            System.out.println("Outer else 11.1");
        }
        if (false) { //outer
            System.out.println("12.1");

            if (false) {//inner if
                System.out.println("12.2");
            } else { //inner else
                System.out.println("12.3");
            }
            System.out.println("Outer if 12.4");
        } else { //outer else
            System.out.println("12.5");
            if (false) {
                System.out.println("12.6");
            } else if (true) {
                System.out.println("12.7");
            } else {
                System.out.println("12.8");
            }
        }
        if (false) { //outer
            System.out.println("13.1");

            if (false) {//inner if
                System.out.println("13.2");
            } else { //inner else
                System.out.println("13.3");
            }
            System.out.println("Outer if 13.4");
        } else { //outer else
            System.out.println("13.5");
            if (true) {
                System.out.println("13.6");
            } else if (true) {
                System.out.println("13.7");
            } else {
                System.out.println("13.8");
            }
        }
        if (true) { //outer
            System.out.println("14.1");

            if (false) {//inner if
                System.out.println("14.2");
            } else if (true) { //inner else
                System.out.println("14.3");
            } else if (true) {
                System.out.println("Outer if 14.4");
            } else {
                System.out.println("14.5");
            }
            System.out.println("OUTER IF 14.6");
        } else { //outer else
            System.out.println("14.7");
            if (true) {
                System.out.println("14.8");
            } else if (true) {
                System.out.println("14.9");
            } else if (true) {
                System.out.println("14.10");
            } else {
                System.out.println("14.11");
            }
        }
    }
}



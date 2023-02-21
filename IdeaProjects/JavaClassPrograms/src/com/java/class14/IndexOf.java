package com.java.class14;

public class IndexOf {
    //indexOf(String str) -> returns the index of the first occurrence
    //whenever there is no matching string then it will returns -1
    public static void main(String[] args) {
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));//4
        System.out.println(str.indexOf("k"));//2

        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("Bla"));//-1
        System.out.println(str2.indexOf("bla"));//0
        String s = "I love waking at 5am";
        //int index = s.indexOf("5am");//18
        //System.out.println(index);//20
        System.out.println(s.indexOf("5am"));
        System.out.println("5am");


        String str3 = "Macbook Air, Nike Air, Ipod Air";
        System.out.println(str3.indexOf("Air",10));//18
        System.out.println(str3.indexOf("Air",19));//28

        String str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("La",5));//-1 means error
        System.out.println(str4.indexOf("la",13));//13

        String str5 = "Java developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));//16

        String str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);


    }
}

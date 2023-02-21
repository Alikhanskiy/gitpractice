package com.java.class14;

public class StringPractice2 {
    //concat
    //Strings are immutable objects
    //they can not be modified
    //in order to change it you have to reassign the value
    public static void main(String[] args) {
        String str = "<html>";
        str+="<body>";//str = str+"<body>";
        str+="<h1>Hello DevX </h1";
        str+="</body>";
        str+="</html>";
        System.out.println(str);
        String str1 = "public class Hello";
        //concat method
        str1 = str1.concat("\t{");
        System.out.println(str1);
        str1 = str1.concat("Yo");
        System.out.println(str1);

        //

        String str4 = "Hello";
        str4.concat("Devx!");
        System.out.println(str4);

        String str5 = "I";
        str5.concat("Love");
        str5 = str5.concat("Java");
        System.out.println(str5);










    }
}

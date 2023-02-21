package com.java.class15;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        str.replace('a','W');
        System.out.println(str);
        String str1 = str.replace('a','W');
        System.out.println(str1);

        String str3 = "public static void main(String{} args)";
        //psvmain
         str3 = str3.replace('{','[').replace('}',']');
        System.out.println(str3);
        //System.out.println(str3);
        //System.out.println(str4);
        //String str5 = str4.replace('}',']');
        //System.out.println(str5);
        String str10 = "Rock and Roll, spring Roll";
        str10 = str10.replace('o','B');
        System.out.println(str10);

        //replace String
        String str11 = "I hate Java";
        System.out.println(str11.replace("hate","love"));

        String str12 = "System.out.println(Hello World)";//gotta add ";" - this
        str12 = str12.replace(")",");");
        System.out.println(str12);
        String str13 = "system.out.println(Hello World)";
        //replace the first occurence
        System.out.println(str13.replaceFirst("s","S"));
        String str14 = "I hate java, I hate Programming";
        System.out.println(str14.replaceFirst("hate","love"));
        System.out.println(str14.replace("hate","love"));


    }
}

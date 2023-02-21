package com.java.class05;

public class ConditionalAnd {
    public static void main(String[] args) {
        //Conditional And is used when
        //you want to enforse multiple rules before you execute your logic
        //all of the rules must be met



        //to issue certificate I want students to have GPA 3.5
        //and I want students to have less than 3 missed classes
        /*boolean giveCertificate = false;
        double sezimGPA = 4.0;
        int sezimMissedClasses = 3;
        giveCertificate = sezimGPA>3.5 && sezimMissedClasses < 3;
        System.out.println(giveCertificate);*/
        boolean giveCertificate = true;
        double aliGPA = 3.8;
        int aliMissedClasses = 2;
        giveCertificate = aliGPA>3.5 && aliMissedClasses<3;
        System.out.println(giveCertificate);
        boolean issueDriverLicence = false;
        int aliAge = 32;
        boolean doesAliHavePassport = true;
        //avoid writing true==true type of comparison
        issueDriverLicence =  aliAge>=16 && doesAliHavePassport;
        System.out.println(issueDriverLicence);
        int numberOfChildren = 1;
        int creditScore = 720;
        boolean areYouMarried = true;
        boolean giveFamilyHealthInsuranceCoverage;
        giveFamilyHealthInsuranceCoverage = creditScore>680 && numberOfChildren>=2 && areYouMarried;
        System.out.println(giveFamilyHealthInsuranceCoverage);

    }
}

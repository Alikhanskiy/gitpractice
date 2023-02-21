package com.java.class27;

class Bank {
    /*Task 1:
    Write a program to create a Bank Class with  Static and Instance variables inside it.
     (Brainstorm on which variables can be static in Bank Class )
    Create static as well as non-static methods inside the bank class
    that can utilize variables of class
    Create a BankMainClass and call the instance method of the class
     using the object & static method using class*/
    static String nameOfBank;
    static String swiftCode;
    String actType;
    String name;
    String bankName;
    double balance;

    Bank(String fromUser, String fromTheUser, double money) {
        nameOfBank = fromUser;
        balance = money;
        actType = fromTheUser;
    }

    Bank() {
    }

    public static void Info() {
        System.out.println("Name of the bank: " + nameOfBank);
        swiftCode = "CHASUS33";
        System.out.println("Swift Code to receive international wire transfers: " + swiftCode);
    }

    void myBalance() {
        actType = "Savings";
        System.out.println(nameOfBank + " is one of the Largest Banks in US");
        System.out.println("Account type in Chase Bank is: "+actType);
        System.out.println("The balance is: "+balance);
}
    void deposit(double amount){
        double balance1 = 300000;
        balance1=balance1+amount;
        System.out.println(balance1);
    }
    void withdraw(double useramount) {
        double balance2 = 40000;
        balance2 = balance2-useramount;
        System.out.println(balance2);
    }
}
public class BankMainClass {
    public static void main(String[] args) {
        Bank C = new Bank("Chase Bank","Savings",600000);
        Bank A = new Bank();
        A.bankName = "Capital One";
        A.actType = "Checking";
        A.balance=50000;
        C.balance = 30000;
        C.name = "Mike";
        A.name = "Sean";
        System.out.println("$"+A.balance+ " available in credit card of "+ A.name);
        System.out.println(C.name+" has $"+C.balance +" available in credit card");
        Bank.Info();
        C.myBalance();
        C.deposit(90000);
        System.out.println(A.bankName);
        System.out.println(A.actType);
        A.withdraw(10000);
        System.out.println(Bank.nameOfBank);
        System.out.println(Bank.swiftCode); 
    }
}

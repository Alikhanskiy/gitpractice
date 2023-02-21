package com.java.class28;

class Uber {

    void ride(int balance,int trip) {
        int result = balance-trip;
        System.out.println("Balance after trip: "+result);
    }
    void tips(int balance,int trip,int extra){
        int result2 = balance-trip-extra;
        System.out.println("Balance after trip & tips: "+result2);
    }
}
class Lyft extends Uber {
    void noShowFee(int balance, int fee) {
        int result3 = balance - fee;
        System.out.println("No-show fee: " + result3);
    }
}
    class yellowTaxi extends Lyft{

    void taxi (int balance,int flatrate) {
        int result4 = balance-flatrate;
        System.out.println("Cash payment only: "+result4);
    }
}

public class UberExample {
    public static void main(String[] args) {
        Uber U = new Uber();
        U.ride(100,32);
        U.tips(200,45,15);

        Lyft L = new Lyft();

        L.noShowFee(200,20);
        L.ride(258,65);
        L.tips(299,89,34);

        yellowTaxi T = new yellowTaxi();
        T.taxi(290,76);
        T.ride(570,98);
    }
}

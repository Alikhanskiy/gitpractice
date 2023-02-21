package com.java.class11;

public class Switch1 {
    public static void main(String[] args) {


    int rate = 1;
    //if (rate ==2) {
    //System.out.println("Awful service");
    //}
    //else if (rate == 1) {
        //System.out.println("Extremely poor service");
    //} it's the same

        switch(rate) {
        case 1://2==1
        case 2:
        case 3:
            System.out.println("Bad service");
            break;
            case 5:
            case 6:
            case 7:
                System.out.println("Okay service");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Fine service");
                break;
    }
    /*String shipmentState = "Hawaii";
        //if (shipmentState.equals("Alaska")) {

        //}
        switch (shipmentState) {

            case "Alaska":

            case "Hawaii":
                System.out.println("shipment cost is $10");
                break;
            case "NY":
                System.out.println("shipment cost is $5");
                break;
            case "Florida":
                System.out.println("shipment cost is $7");
                break;
            case "California":
                System.out.println("shipment cost is $12");
                break;
                //final is a java keyword that ensures the value of a variable can only be
            //initialized once and can not be changed afterwards
            //this is a constant value
            final int num = 23;
            num = 10;
            //ex:
            //area code 312

        }*/
  }
}







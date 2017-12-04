/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package different.types.ofenum;

/**
 *
 * @author Amir
 */
public class EnumToString {

    private enum Weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    private enum ColdDrink {

        PEPSI("Pepsi"), COKE("Coca Cola"), SPRITE("Sprite");

        private String brandname;

        private ColdDrink(String brand) {
            this.brandname = brand;
        }

        @Override
        public String toString() {
            return "from to string method"+brandname;
        }
    }

    public static void main(String args[]) {
        //Converting Enum to String by using name() method 
        //by default print mehtod calls toString() of enum 
        ColdDrink[] drinks = ColdDrink.values();
        for (ColdDrink drink : drinks) {
            System.out.println("String to Enum example using name : " + drink.name());
            
        }

        //Converting Enum to String using toString() method 
        for (ColdDrink drink : drinks) {
            System.out.println("String to enum conversion using toString() : " + drink);
        }
    }
}

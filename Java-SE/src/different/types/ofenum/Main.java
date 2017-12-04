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
public class Main {

    public static void main(String[] args) {
       //System.out.println(BasicEnum.ACTIVE);
        
        // System.out.println(EnumWithInstanceField.ACTIVE.getMessage());
        
        double result = EnumPlusMethodOperation.PLUS.calculate(1, 2);
        System.out.println(EnumPlusMethodOperation.PLUS); //3.0
        
       //  for (EnumPlusMethodOperation status : EnumPlusMethodOperation.values()) {
        //    System.out.println(status);
        //}
    }
}

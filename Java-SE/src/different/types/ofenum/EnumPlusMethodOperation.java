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
public enum EnumPlusMethodOperation {

    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;
    
    

    double calculate(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULTIPLY:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
               throw new AssertionError("Unknown operations " + this);
        }
    }

    @Override
    public String toString() {
        return "EnumPlusMethodOperation{" +PLUS+'}';
    }
}

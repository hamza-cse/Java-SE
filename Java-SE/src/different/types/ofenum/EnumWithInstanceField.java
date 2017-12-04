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
public enum EnumWithInstanceField {

    ACTIVE("this is active"),
    INACTIVE("this is inactive"),
    PENDING("this is pending"),
    DELETED("this is deleted");
    private String message;

    EnumWithInstanceField(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

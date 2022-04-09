
package com.mycompany.estructura_datos;

public class node {
    private node next;
    private int value;

    public node() {
        this.next = null;
        this.value = 0;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}

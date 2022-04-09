/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos;

import lec8viernes.*;

/**
 *
 * @author steve
 */
class NodeDobleCircular1 {

    private Persona perosona;
    private NodeDobleCircular1 next;
    private NodeDobleCircular1 back;

    public NodeDobleCircular1(Persona perosona) {
        this.perosona = perosona;
    }

    @Override
    public String toString() {
        return "NodeDobleCircular{" + "perosona=" + perosona + ", next=" + next + ", back=" + back + '}';
    }

    public Persona getPerosona() {
        return perosona;
    }

    public void setPerosona(Persona perosona) {
        this.perosona = perosona;
    }

    public NodeDobleCircular1 getNext() {
        return next;
    }

    public void setNext(NodeDobleCircular1 next) {
        this.next = next;
    }

    public NodeDobleCircular1 getBack() {
        return back;
    }

    public void setBack(NodeDobleCircular1 back) {
        this.back = back;
    }

}

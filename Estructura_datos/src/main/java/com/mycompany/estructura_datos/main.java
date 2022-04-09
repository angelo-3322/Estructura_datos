
package com.mycompany.estructura_datos;

public class main {
//    static int arr[]={12,24,5,7,9};
    public static void main(String [] args){
        //--------------------Recursividad------------------------
//        System.out.println(Recursion.factorial(3));
//        System.out.println(Recursion.buscarElemento(arr, 0, 12, arr.length-1));
        //-------------------pilas--------------------------------
//        stack Pila = new stack();
//        System.out.println(Pila.getLenght());
//        Pila.push(1);
//        System.out.println(Pila.getLenght());
//        Pila.push(2);
//        Pila.push(3);
//        System.out.println(Pila.getLenght());
//        Pila.pop();
//        System.out.println(Pila.getLenght());
//-------------------------Colas--------------------------------------
    queue cola1 = new queue();
    cola1.insertar(46);
    cola1.insertar(12);
    cola1.insertar(87);
    cola1.insertar(127);
    cola1.insertar(30);
    cola1.extraer();
    cola1.isEmpty();
    System.out.println(cola1.getLenght());
    
    }
}


package com.mycompany.estructura_datos;


public class stack {
    private node top;
    private int lenght;

    public stack() {
        top = null;
        lenght = 0;
    }
    public boolean isEmpty(){
        if(top == null){
            System.out.println("La pila se encuentra vacia");
            return true;
        }else{
            return false;
        }
        
    }
    public int getLenght(){
        return lenght;
    }
/**
 * Este metodo ingresa un nuevo valor al inicio/top de nuestra pila
 * @param value= valor a agregar a nuestra pila 
 */
    

    
public void push(int value){
    node newNode = new node();
    newNode.setValue(value);
    
    //verifica si la lista esta vacia
    if(isEmpty()){
        //inicializa la pila con el newNode
        top = newNode;
        System.out.println("Se agregro nuestro nuevo nodo al top de la pila");
        System.out.println(top.getValue());
        
    }else{
        // si no esta vacia nuestro nuevo nodo, hace referencia al que este en
        // el top en ese momento
        newNode.setNext(top);
        System.out.println("El top anterior fue : ");
        System.out.println(top.getValue());
        
        //nuestro start/top ahora es el nuevo nodo
        top = newNode;
        System.out.println("Se agregro nuestro nuevo nodo al top de la pila");
        System.out.println(top.getValue());
    }
    //lenght++ == lenght + 1
    lenght++;
}
/**
 * Quita el top de la pila
 */
public void pop(){
    if(isEmpty()){
        System.out.println("Porque no agregras un nuevo nodo ?");
    }else{
        System.out.println("Se quito el top de la pila en ese momento");
        System.out.println(top.getValue());
        //Asigna como primer elemento, al siguiente de la pila
        top = top.getNext();
        
        System.out.println("El nuevo top es: ");
        System.out.println(top.getValue());
        lenght--;
    }
}

}


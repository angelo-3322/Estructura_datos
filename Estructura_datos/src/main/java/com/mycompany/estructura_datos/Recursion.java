
package com.mycompany.estructura_datos;
//El metodo recusivo debe de tener una condicion de parada/base que nos permita devolver un valor y tener una llamada asi misma
public class Recursion {
    
    static int arr [] = {};
    
    public static int factorial (int n){
        if (n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        }
        
    }
    //metodo que logra buscar un valor n en un array
    //parametro:el valor que le estoy pasando
    //argumento:es el nombre de la funcion
     public static int buscarElemento (int arr[],int i, int n, int f){
         if(f<1){
             return -1;
         }
         if(arr[i]==n){
             return i;
         }
        if(arr[f]==n){
            return n;
        }else{
            return buscarElemento(arr,1+i,n,f-1);
        }
    }
}
//    public static void imprimeVectorRecursivo(int[] valores, int i){
//        if(i == valores.length){
//            System.out.println("Ya no hay elementos en el vector");
//        }else{
//            System.out.printf("El valor del vector en la posicion %d es %d\n", i, valores[i]);
//            imprimeVectorRecursivo(valores, i+1);
//        }
//    }
//    
//    public static void imprimeVector(int[] valores){
//        for(int i=0; i<valores.length; i++){
//            System.out.printf("El valor del vector en la posicion %d es %d\n", i, valores[i]);
//        }
//    }
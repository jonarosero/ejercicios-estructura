package ejercicio6;

import java.util.Scanner;

public class Metodo_Ejercicio6 {
    private int array[];
    private int lim;
    private int pos;
    Scanner scan = new Scanner(System.in);
    

    public void establecer_Limite(){
        System.out.println("Ingrese un el tamaño del arreglo: ");
        lim = scan.nextInt();
    }
    
    public void establecer_arreglo(){
        array = new int [lim];
        for (int i = 0; i < array.length; i ++){
            System.out.printf("Ingrese un valor para la posicion %d: \n", i+1);
            array[i] = scan.nextInt();
        }
        
    }
    
    public void ingresar_numero(){
        System.out.println("Ingrese la posicion donde insertar un valor: ");
        pos = scan.nextInt()-1;
        
        System.out.println("Ingrese el valor a insertar: ");
        int valor = scan.nextInt();
        int aux = array[pos];
        array[pos] = valor;
        
        for(int i=pos+1; i<array.length-1; i++){
            
       }
    }
    
    public void imprimir(){
        for (int i = 0; i < array.length; i ++){
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }
    
}

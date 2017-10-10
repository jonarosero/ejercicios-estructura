package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Algoritmos al = new Algoritmos();

        //System.out.print("Ingrese limite del arreglo: ");
        //int lim = scan.nextInt();
        
        al.ingresar_valores();
        al.obtener_arreglo();
        

        //int[] lista = new int[lim];

        //for (int i = 0; i < lim; i++) {
            //System.out.print("Ingrese un valor: ");
            //int valor = scan.nextInt();
            //lista[i] = valor;

        //}
        //System.out.print("Su arreglo es: ");
        //for (int i = 0; i < lim; i++) {
          //  System.out.printf("%s, ", lista[i]);
        //}
        
    }

}

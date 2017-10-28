package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Metodo_Ejercicio8 met = new Metodo_Ejercicio8();
        int [][]matriz;
        
        System.out.println("Ingrese las columnas de la matriz: ");
        int columnas = scan.nextInt();
        
        System.out.println("Ingrese las filas de la matriz: ");
        int filas = scan.nextInt();
        
        
        matriz= met.ingresar_matriz(filas, columnas);
        met.presentar_matriz(matriz);
        int pares = met.suma_pares(matriz);
        int impares = met.suma_impares(matriz);
        
        System.out.printf("El total de la suma de los pares de la matriz es: %d\n"
                + "El total de la suma de los impares de la matriz es: %d\n", pares, impares);
         
    }
    
}

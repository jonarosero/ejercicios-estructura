package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodo_Ejercicio4 met = new Metodo_Ejercicio4();
        int[][] matriz;

        System.out.println("Ingrese el tamaño de la matriz: ");
        int lim = scan.nextInt();

        matriz = met.ingresar_matriz(lim);
        met.presentar_matriz(matriz);
        int diagonal = met.suma_diagonal(matriz);

        System.out.printf("El total de la suma de la diagonal de la matriz es: %d\n", diagonal);

    }

}

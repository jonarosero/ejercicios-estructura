package ejercicio4;

import java.util.Scanner;

public class Metodo_Ejercicio4 {

    Scanner scan = new Scanner(System.in);

    public int[][] ingresar_matriz(int lim) {

        int matriz[][] = new int[lim][lim];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("Ingrese un valor en la posicion %d,%d: ", i + 1, j + 1);
                matriz[i][j] = scan.nextInt();
                System.out.println();
            }

        }
        return matriz;
    }

    public void presentar_matriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public int suma_diagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma = suma + matriz[i][i];
        }
        return suma;
    }

}

package ejercicio14;

import java.util.Scanner;

public class Metodo_Ejercicio14 {
    Scanner scan = new Scanner(System.in);
    private int [][]matriz;
    
    public void ingresar_matriz() {
        System.out.println("Introduzca las filas:");
        int filas = scan.nextInt();
        System.out.println("Introduzca las columnas:");
        int columnas = scan.nextInt();
        matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Introduzca el numero en la pocision %d,%d:\n", i + 1, j + 1);
                matriz[i][j] = scan.nextInt();
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }    
    }
    
    public void ordenar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int x = 0; x < matriz.length; x++) {
                    for (int y = 0; y < matriz[0].length; y++) {
                        if (matriz[i][j] < matriz[x][y]) {
                            int aux = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = aux;
                        }
                    }
                }
            }
        }
    }

}

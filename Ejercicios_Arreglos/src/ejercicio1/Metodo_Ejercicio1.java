package ejercicio1;

import java.util.Scanner;

public class Metodo_Ejercicio1 {

    Scanner scan = new Scanner(System.in);
    private int columna;
    private int fila;
    private int[][] matriz;
    private int[] suma_fila;
    private int[] suma_columna;

    public Metodo_Ejercicio1() {

    }

    public void obtener_limites() {
        System.out.println("Ingrese la cantidad de columnas de la matriz: ");
        columna = scan.nextInt();

        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        fila = scan.nextInt();

    }

    public void obtener_matriz() {
        matriz = new int[fila][columna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Ingrese un numero para la posicion %s,%d: ", i + 1, j + 1);
                matriz[i][j] = scan.nextInt();
            }
            System.out.println();

        }

    }

    public void calcular_columna() {
        this.suma_columna = new int[columna];

        for (int i = 0; i < this.matriz[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < this.matriz.length; j++) {
                suma += matriz[j][i];
            }
            this.suma_columna[i] = suma;
        }
    }

    public void calcular_fila() {
        this.suma_fila = new int[fila];

        for (int i = 0; i < this.fila; i++) {
            int suma = 0;
            for (int j = 0; j < this.columna; j++) {
                suma += matriz[i][j];
            }
            this.suma_fila[i] = suma;
        }
    }

    public void presentar_matriz() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();

        }

    }

    public void presentar_resultados() {
        for (int i = 0; i < columna; i++) {
            System.out.printf("La suma de la columna: %d es: %d\n", i + 1, this.suma_columna[i]);
        }
        for (int i = 0; i < fila; i++) {
            System.out.printf("La suma de la fila: %d es: %d\n", i + 1, this.suma_fila[i]);
        }
    }

}

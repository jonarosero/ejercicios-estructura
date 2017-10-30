package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodo_Ejercicio16 met = new Metodo_Ejercicio16();
        System.out.println("Ingrese el tamaño de la matriz: ");
        int tamano = scan.nextInt();
        int matriz[][] = new int[tamano][tamano];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Ingrese un numero para la posicio %d,%d: \n", i + 1, j + 1);
                matriz[i][j] = scan.nextInt();
            }
        }

        met.printmat(matriz);
        System.out.println(met.determin(matriz));
    }
}

package ejercicio8;

import java.util.Scanner;

public class Metodo_Ejercicio8 {
    Scanner scan = new Scanner(System.in);
    public int [][] ingresar_matriz(int fila, int colum){
        
        int matriz [][] = new int[fila][colum];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.printf("Ingrese un valor en la posicion %d,%d: ", i+1, j+1);
                matriz[i][j] = scan.nextInt();
                System.out.println();
            }
            
        }
        return matriz;
    }
    
    public void presentar_matriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }    
    }
    
    public int suma_pares(int[][]matriz){
        int pares = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] % 2 == 0){
                    pares++;
                }
            }
        }
        return pares;
    }
    
    public int suma_impares(int[][]matriz){
        int impares = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz[i][j] % 2 != 0){
                    impares++;
                }
            }
        }
        return impares;
    }
    
    
}

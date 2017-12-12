package clase_estructura4;

import java.util.Scanner;

public class Metodo {
    Scanner scan = new Scanner(System.in);
    
    private int[][]matriz = new int [3][3];
    private int deter;
    
    public void ingresar_matriz(){
        for (int i  = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.println("Ingrese un numero: ");
                this.matriz[i][j] = scan.nextInt();
            }
        }
    }
    
    public void presentar(){
        for (int i  = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.printf("%d ", this.matriz[i][j]);
            }
            System.out.println();
        }    
        System.out.printf("La determinante de la matriz es: %d\n", deter);
    }
    
    public void obtener_deter(){
        int s1 = 0, s2 = 0;
        for(int i = 0; i < matriz.length; i++){
            int aux = i, l = matriz.length - 1, d = 1, d2 = 1;
            for (int j = 0; j < matriz.length; j++){
                d *= matriz[aux][j];
                d2 *= matriz[aux][l];
                l--;
                if ( aux == matriz.length-1){
                    aux = 0;
                }else{
                    aux++;
                }
            }
            s1 += d;
            s2 += d2;
        }
        deter = s1 - s2;
    }
    
}

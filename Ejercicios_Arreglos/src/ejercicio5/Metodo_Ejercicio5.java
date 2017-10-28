package ejercicio5;

import java.util.Scanner;

import java.util.Random;

public class Metodo_Ejercicio5 {
    private int T[];
    private int lim;
    private int num;
    private double T2[];
    Scanner scan = new Scanner(System.in);
    

    public void establecer_Limite(){
        System.out.println("Ingrese un el tamaño del arreglo T: ");
        lim = scan.nextInt();
    }
    
    public void establecer_vector(){
        T = new int [lim];
        for (int i = 0; i < T.length; i ++){
            T[i] = (int) (Math.random() * 100) + 1;
        }
        
    }
    public void calcular_div(){
        T2 = new double[lim];
        System.out.println("Eliga la posicion del numero que sera el divisor: ");
        num = scan.nextInt() - 1;
        for(int i = 0; i < T.length; i++){
            T2[i] = T[i]/(double)T[num];
        }
    }
    public void presentar_original(){
        System.out.printf("El arreglo original: ");
        for (int i = 0; i < T.length; i++){
            System.out.printf("%d ", this.T[i]);
        }
        System.out.println();
    }
    
    public void presentar(){
        System.out.printf("El arreglo dividido para %d es: ", T[num]);
        for (int i = 0; i < T2.length; i++){
            System.out.printf("%.2f ", this.T2[i]);
        }
        System.out.println();
    }
    
}

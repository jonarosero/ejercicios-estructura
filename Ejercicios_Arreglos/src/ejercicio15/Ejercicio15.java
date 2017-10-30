package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Metodo_Ejercicio15 met = new Metodo_Ejercicio15();
        
        System.out.println("Ingrese el tamaño del cuadrado magico:");
        int n = scan.nextInt();
        
        int matriz[][] = met.cuadroMagico(n);
        met.presentar(matriz);
        
    }
    
}

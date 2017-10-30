package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lim;
        
        Metodo_Ejercicio12 met = new Metodo_Ejercicio12();
        System.out.println("Ingrese el tamaño de la lista: ");
        lim = scan.nextInt();
        met.ingresar_nombres(lim);
        met.presentar_nombres();
        met.buscar_nombre();
    }

}

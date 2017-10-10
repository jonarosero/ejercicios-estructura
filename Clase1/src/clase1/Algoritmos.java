package clase1;
import java.util.Scanner;

public class Algoritmos {
    int lista [];
    Scanner scan = new Scanner(System.in);
    int lim;
    
    public void ingresar_valores (){
        System.out.print("Ingrese limite del arreglo: ");
        lim = scan.nextInt();
        
        
        for (int i = 0; i < lim; i++) {
            System.out.print("Ingrese un valor: ");
            lista[i] = scan.nextInt();

        }
    }
    public void obtener_arreglo(){
        System.out.print("Su arreglo es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%s, ", lista[i]);
        }
    }
}

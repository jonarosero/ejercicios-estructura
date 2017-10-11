package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Algoritmos al = new Algoritmos();

        al.ingresar_limite();
        al.ingresar_arreglo();
        al.obtener_arreglo();

        System.out.println("Ingrese el valor a buscar : ");
        int num = scan.nextInt();
        boolean bandera = al.buscar_arreglo(num);

        al.modificar_arreglo();
        
        System.out.println("Ordenando el arreglo");
        al.ordenar_arreglo();
        
        al.insertar_arreglo();
        al.eliminar_arreglo();

    }

}

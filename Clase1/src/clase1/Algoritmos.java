package clase1;

import java.util.Scanner;

public class Algoritmos {

    private int lim;
    private int arreglo[];
    private int posicion;
    public static Scanner scan = new Scanner(System.in);

    public Algoritmos() {

    }

    public void ingresar_limite() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        lim = scan.nextInt();
    }

    public void ingresar_arreglo() {
        arreglo = new int[lim];
        for (int i = 0; i < lim; i++) {
            System.out.printf("Ingrese el valor de la %d posición: ", i + 1);
            arreglo[i] = scan.nextInt();
        }
    }

    public void obtener_arreglo() {
        System.out.println("Su arreglo es : ");
        for (int i = 0; i < lim; i++) {
            System.out.printf("%d ", arreglo[i]);
        }
        System.out.println();
    }

    public boolean buscar_arreglo(int num) {

        boolean bandera = false;
        int j = 0;

        for (int i = 0; i < lim; i++) {
            if (num == arreglo[i]) {
                bandera = true;
                posicion = i;
            }
        }
        if (bandera == true) {
            System.out.printf("Su valor se encuentra en la posición: %d\n", posicion + 1);
        } else {
            System.out.printf("El numero no esta en el arreglo\n");
        }
        return bandera;
    }

    public void ordenar_arreglo() {
        for (int i = 0; i < lim - 1; i++) {
            for (int j = 0; j < lim - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        obtener_arreglo();
    }

    public void modificar_arreglo() {
        System.out.println("Ingrese la posicion que quiere modificar: ");
        int j = scan.nextInt() - 1;
        if (j < lim && j > 0) {
            System.out.println("Ingrese el nuevo numero: ");
            int num = scan.nextInt();
            arreglo[j] = num;
            obtener_arreglo();
        } else {
            System.out.println("La posicion ingresada no corresponde a ninguna del arreglo");
        }

    }

    public void insertar_arreglo() {
        System.out.println("Ingrese el numero a insertar en el arreglo: ");
        int num = scan.nextInt();
        
        lim = lim + 1;
        int []aux = new int[lim];
        aux[lim-1] = num;
        for (int i = 0; i < lim-1; i++){
            aux[i] = arreglo[i];
        }
        arreglo = new int[lim];
        for (int i = 0; i < lim; i++){
            arreglo[i] = aux[i];
        }
        ordenar_arreglo();
    }

    public void eliminar_arreglo() {
        System.out.println("Ingrese el numero a eliminar: ");
        int num = scan.nextInt();
        boolean bandera = false;
        int k = 1;
        int aux = 0;
        bandera = buscar_arreglo(num);
        if (bandera == true) {
            aux = arreglo[lim - 1];
            arreglo[lim - 1] = arreglo[posicion];
            arreglo[posicion] = aux;
            lim = lim - 1;
            ordenar_arreglo();
        }

    }

}

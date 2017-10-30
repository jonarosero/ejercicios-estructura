package ejercicio6;

import java.util.Scanner;

public class Metodo_Ejercicio6 {

    private int array[];
    private int lim;
    private int pos;
    Scanner scan = new Scanner(System.in);

    public void establecer_Limite() {
        System.out.println("Ingrese un el tamaño del arreglo: ");
        lim = scan.nextInt();
    }

    public void establecer_arreglo() {
        array = new int[lim];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Ingrese un valor para la posicion %d: \n", i + 1);
            array[i] = scan.nextInt();
        }

    }

    public void ingresar_numero() {
        System.out.println("Ingrese la posicion donde insertar un valor: ");
        pos = scan.nextInt() - 1;
        if (pos >= array.length || pos < 0) {
            System.out.println("La posicion ingresada no se encuentra en la lista");
        } else {
            for (int i = this.array.length - 1; i > pos; i--) {
                this.array[i] = array[i - 1];
            }
            System.out.printf("Ingrese un numero para la posicion %d: \n", pos + 1);
            array[pos] = this.scan.nextInt();
        }

    }

    public void imprimir() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }

}

package ejercicio11;

import java.util.Scanner;

public class Metodo_Ejercicio11 {

    Scanner scan = new Scanner(System.in);
    private double[][] ventas = new double[10][12];
    private double[] media = new double[10];
    private double media_total;
    private int[] mayores;

    public void ingresar_ventas() {
        for (int i = 0; i < this.ventas.length; i++) {
            for (int j = 0; j < this.ventas[0].length; j++) {
                System.out.printf("Ingrese las Ventas del ALMACEN %d del mes %d: \n", i + 1, j + 1);
                ventas[i][j] = scan.nextDouble();
            }
        }
    }

    public void obtener_medias() {
        for (int i = 0; i < this.ventas.length; i++) {
            double suma = 0;
            for (int j = 0; j < this.ventas[0].length; j++) {
                suma += this.ventas[i][j];
            }
            this.media[i] = suma / this.ventas[0].length;
        }
    }

    public double obtener_media_total(double[] array) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        double prom = suma / array.length;
        return prom;
    }

    public void obtener_mayores() {
        int cont = 0;
        media_total = this.obtener_media_total(media);
        for (int i = 0; i < this.ventas.length; i++) {
            if (this.media[i] > this.media_total) {
                cont++;
            }
        }
        this.mayores = new int[cont];
        int k = 0;
        for (int i = 0; i < this.ventas.length; i++) {
            if (this.media[i] > this.media_total) {
                this.mayores[k] = i + 1;
                k++;
            }
        }
    }

    public void presentar() {
        for (int i = 0; i < this.ventas.length; i++) {
            System.out.printf("\nALMACEN %d\n", i + 1);
            for (int j = 0; j < this.ventas[0].length; j++) {
                System.out.printf("Las ventas en el mes %d son: %.2f\n", j + 1, this.ventas[i][j]);
            }
            System.out.printf("Su media en venta anual es de: %.2f\n", this.media[i]);
        }
        System.out.printf("\nLa media total en ventas de los almacenes es: %.2f\n"
                + "Los almacenes que superan la media son:\n", this.media_total);
        for (int i = 0; i < this.mayores.length; i++) {
            System.out.printf(" ALMACEN %d \n", this.mayores[i]);
        }
    }
}

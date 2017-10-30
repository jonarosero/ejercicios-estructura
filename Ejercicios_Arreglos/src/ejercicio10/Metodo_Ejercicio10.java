package ejercicio10;

import java.util.Scanner;

public class Metodo_Ejercicio10 {

    Scanner input = new Scanner(System.in);

    private double[][] matriz;
    private int n, m;
    private double suma, media;
    private double prom, asig;
    private double media_total, asig_total;
    private double faltas;

    public Metodo_Ejercicio10(int n, int m) {
        this.n = n;
        this.m = m;
        this.matriz = new double[n][m];
    }

    public void media_estudiante() {
        for (int i = 0; i < this.matriz.length; i++) {
            this.suma = 0;
            System.out.printf("\nEstudiante %d\n", i + 1);
            for (int j = 0; j < this.matriz[0].length; j++) {
                System.out.printf("Introduzca la nota de la asignatura %d:\n", j + 1);
                this.matriz[i][j] = input.nextDouble();
                this.suma += matriz[i][j];
            }
            this.media = this.suma / this.matriz[0].length;
            this.prom += media;
            System.out.printf("La media del estudiante %d es: %.2f\n", i + 1, this.media);
        }
    }

    public void media_total() {
        this.media_total = prom / this.matriz.length;
        System.out.printf("\nEl promedio total de la clase es: %.2f\n\n", this.media_total);

        for (int j = 0; j < this.matriz[0].length; j++) {
            for (int i = 0; i < 20; i++) {
                this.asig += matriz[i][j];
                if (matriz[i][j] == 0) {
                    this.faltas++;
                }
            }
            this.asig_total = asig / this.matriz.length;
            System.out.printf("El promedio de la asignatura %d es: %.2f\n", j + 1, this.asig_total);
        }
        faltas = (faltas * 100)/ (this.matriz.length*this.matriz[0].length);
        System.out.printf("\nEl porcentaje de faltas es: %.2f%s\n", this.faltas, "%");
    }
}

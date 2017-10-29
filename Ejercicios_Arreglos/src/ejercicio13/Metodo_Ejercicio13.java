package ejercicio13;

import java.util.Scanner;

public class Metodo_Ejercicio13 {

    Scanner scan = new Scanner(System.in);
    private int[][] A;
    private int[][] B;

    public int MenuP() {
        int opcion1;
        System.out.printf("MENU\n1.INGRESAR MATRIZ A\n2.INGRESAR MATRIZ B\n3.PRESENTAR MATRICES\n4.MULTIPLICAR MATRICES BIDIMENSIONALES\n5.SUMA DE MATRICES\n6.DIFERENCIA DE MATRICES\n7.MULTIPLICACION DE UNA MATRIZ POR UN ESCALAR\n8.TRANSPUESTA DE UNA MATRIZ\n0.SALIR\nIngrese el numero del menu: \n");
        opcion1 = scan.nextInt();
        return opcion1;
    }

    public int Submenu() {
        int opcion2;
        System.out.printf("1.MATRIZ A\n2.MATRIZ B\nIngrese el numero con la matriz que quiera trabajar:\n");
        opcion2 = scan.nextInt();
        return opcion2;
    }

    public void leerA() {
        System.out.println("Matriz A");
        System.out.println("Ingrese la cantidad de filas de la matriz A:");
        int filas = scan.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz A:");
        int columnas = scan.nextInt();
        A = new int[filas][columnas];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf("Ingrese un numero para la posicion %d,%d de la Matriz A:\n", i + 1, j + 1);
                A[i][j] = scan.nextInt();
            }
        }
    }

    public void leerB() {
        System.out.println("Matriz B");
        System.out.println("Ingrese la cantidad de filas de la matriz B:");
        int filas = scan.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz B:");
        int columnas = scan.nextInt();
        B = new int[filas][columnas];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.printf("Ingrese un numero para la posicion %d,%d de la Matriz B:\n", i + 1, j + 1);
                B[i][j] = scan.nextInt();
            }
        }
    }

    public void presentar() {
        System.out.println("MATRIZ A");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf("%d ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("MATRIZ B");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.printf("%d ", B[i][j]);
            }
            System.out.println();
        }
    }

    public void multiplicar() {
        int[][] mult;
        if (((A.length == 2) && (A[0].length == 2)) && ((B.length == 2) && (B[0].length == 2))) {
            System.out.println("La matriz resultante de AxB es: ");
            mult = new int[A.length][B[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        mult[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(mult[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no pueden ser multiplicadas");
        }
    }

    public void sumar() {
        if (((A.length == B.length) && (B[0].length == A[0].length))) {
            System.out.println("La matriz resultante de A+B es: ");
            int[][] suma = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    suma[i][j] = A[i][j] + B[i][j];
                    System.out.print(suma[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no pueden ser sumadas");
        }
    }

    public void restar() {
        if (((A.length == B.length) && (B[0].length == A[0].length))) {
            System.out.println("La matriz resultante de A-B es: ");
            int[][] suma = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    suma[i][j] = A[i][j] - B[i][j];
                    System.out.print(suma[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Las matrices no pueden ser restadas");
        }
    }

    public void multiplicar_escalar(int opcion) {
        System.out.println("Ingrese un numero escalar: ");
        int num = scan.nextInt();
        if (opcion == 1) {
            System.out.printf("El resultado de %d por la Matriz A es: \n", num);
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    A[i][j] = A[i][j] * num;
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcion == 2) {
            System.out.printf("El resultado de %d por la Matriz B es: \n", num);
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    B[i][j] = B[i][j] * num;
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void transpuesta(int opcion) {
        if (opcion == 1) {
            System.out.println("La transpuesta de la matriz A es:");
            for (int i = 0; i < A[0].length; i++) {
                for (int j = 0; j < A.length; j++) {
                    System.out.printf("%d ", A[i][j]);
                }
                System.out.println();
            }
        } else if (opcion == 2) {
            System.out.println("La transpuesta de la matriz B es:");
            for (int i = 0; i < B[0].length; i++) {
                for (int j = 0; j < B.length; j++) {
                    System.out.printf("%d ", B[i][j]);
                }
                System.out.println();
            }
        }
    }

}

package operaciones_arreglos;

import java.util.Scanner;

public class Operaciones {

    Scanner scan = new Scanner(System.in);
    private int libre;
    private int ocupado;

    public int MenuP() {
        int opcion1;
        System.out.printf("MENU\n1.LEER\n2.PRESENTAR\n3.ORDENAR\n4.INSERTAR\n5.BUSCAR\n6.Cantidad de espacios LIBRES Y OCUPADOS\n7.Eliminar\n0.SALIR\nIngrese el numero del menu: \n");
        opcion1 = scan.nextInt();
        return opcion1;
    }

    public void leerA(int[] A) {
        libre = A.length;
        ocupado = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Desea ingresar un valor en la posicion: %d\n"
                    + "1.Si\n"
                    + "2.No\n"
                    + "3.Terminar el ingreso\nIngrese el numero de la accion: \n", i + 1);
            int ingreso = scan.nextInt();
            if (ingreso == 1) {
                System.out.printf("Ingrese el valor de la %dª posición: ", i + 1);
                A[i] = scan.nextInt();
                libre--;
                ocupado++;
            } else if (ingreso == 2) {
                A[i] = 0;
            } else {
                break;
            }
        }

    }

    public void presentarA(int[] A) {
        System.out.println("Su arreglo es : ");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println();

    }

    public void ordenarA(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public int[] insertarA(int[] A) {
        if (this.libre == 0) {
            System.out.println("No existe lugares vacios donde ingresar mas numeros");
        } else {
            System.out.println("Ingrese una posicion donde ingresar el numero: ");
            int pos = scan.nextInt() - 1;
            if (A[pos] != 0) {
                System.out.println("El espacio ya esta ocupado");
            } else if (A[pos] == 0) {
                System.out.println("Ingrese un numero: ");
                A[pos] = scan.nextInt();
                this.libre--;
                this.ocupado++;
            }
        }
        return A;
    }

    public int MenuB() {
        int opcion2;
        System.out.printf("SUBMENU 5\n1.BUSQUEDA\n2.BUSQUEDA BINARIA\nIngrese el numero del submenu: \n");
        opcion2 = scan.nextInt();
        return opcion2;
    }

    public void buscar(int[] A, int num) {
        boolean bandera = false;
        int posicion = 0;
        for (int i = 0; i < A.length; i++) {
            if (num == A[i]) {
                bandera = true;
                posicion = i;
            }
        }
        if (bandera == true) {
            System.out.printf("Su valor se encuentra en la posición: %d\n", posicion + 1);
        } else {
            System.out.printf("El numero no esta en el arreglo\n");
        }

    }

    public int buscarBin(int[] A, int num) {
        int fin = A.length - 1, ini = 0, medio;
        while (ini <= fin) {
            medio = (fin + ini) / 2;
            if (A[medio] == num) {
                return medio;
            } else {
                if (num < A[medio]) {
                    fin = medio - 1;
                } else {
                }
                ini = medio + 1;
            }
        }
        return -1;

    }

    public int[] eliminarA(int[] A) {
        if (libre == A.length) {
            System.out.println("No existe numeros a eliminar");
        } else {
            System.out.println("Ingrese la posicion del numero a eliminar");
            int pos = scan.nextInt() - 1;
 /*           if (A[pos] == 0) {
                System.out.println("En esa posicion no existe un numero a eliminar");
            } else {
                A[pos] = 0;
                this.libre++;
                this.ocupado--;
            }
*/
            for(int i=pos; i<ocupado; i++){
                A[i]=A[i+1];
            }
            ocupado--;
            libre++;
        }
        return A;
    }

    public int getLibre() {
        return libre;
    }

    public int getOcupado() {
        return ocupado;
    }

}

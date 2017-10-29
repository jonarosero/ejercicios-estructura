package ejercicio9;

import java.util.Scanner;

public class Metodo_Ejercicio9 {

    Scanner scan = new Scanner(System.in);
    private int libre;
    private int ocupado;

    public int MenuP() {
        int opcion1;
        System.out.printf("MENU\n1.INGRESAR RESERVAS\n2.PRESENTAR\n3.INSERTAR NUEVAS RESERVAS\n4.ELIMINAR RESERVAS\n5.Cantidad de asientos LIBRES Y OCUPADOS\n0.SALIR\nIngrese el numero del menu: \n");
        opcion1 = scan.nextInt();
        return opcion1;
    }

    public void leerA(int[] A) {
        libre = A.length;
        ocupado = 0;
        int i = 0;
        int j = 30;
        while (ocupado < A.length) {
            System.out.printf("Ingrese un una reserva:\n"
                    + "1.Fumador\n"
                    + "2.No Fumador\n"
                    + "3.Terminar el ingreso\nIngrese el numero de la accion: \n");
            int ingreso = scan.nextInt();
            if (ingreso == 1) {
                A[i] = 1;
                libre--;
                ocupado++;
                i++;
            } else if (ingreso == 2) {
                A[j] = 1;
                libre--;
                ocupado++;
                j++;
            } else {
                break;
            }
        }

    }

    public void presentarA(int[] A) {
        System.out.println("La disposicion del avion es 1 asiento reservado 0 asiento libre: ");
        System.out.println("FUMADORES");
        for (int i = 0; i < A.length; i++) {
            if (i == 30) {
                System.out.println("\nlNO FUMADORES");
            }
            System.out.printf("%d ", A[i]);
        }
        System.out.println();

    }

    public int[] insertarA(int[] A) {
        if (this.libre == 0) {
            System.out.println("No existe lugares vacios donde ingresar mas numeros");
        } else {
            System.out.println("Ingrese el asiento a reservar:\n"
                    + "1-30.FUMADORES\n"
                    + "31-100.NO FUMADORES");
            int pos = scan.nextInt()-1;
            if (pos > A.length){
                System.out.println("El numero del asiento no existe.");
            }else{
                if (A[pos] != 0) {
                    System.out.println("El asiento ya esta reservado");
                } else if (A[pos] == 0) {
                    A[pos] = 1;
                    this.libre--;
                    this.ocupado++;
                }
            }
            
        }
        return A;
    }

    public int[] eliminarA(int[] A) {
        if (libre == A.length) {
            System.out.println("No existen reservas a anular");
        } else {
            System.out.println("Ingrese el asiento del pasajero a anular reserva");
            int pos = scan.nextInt() - 1;
            A[pos] = 0;
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

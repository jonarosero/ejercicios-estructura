package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion1;
        int opcion2;

        Metodo_Ejercicio13 obj = new Metodo_Ejercicio13();
        do {
            opcion1 = obj.MenuP();
            switch (opcion1) {
                case 1:
                    obj.leerA();
                    break;
                case 2:
                    obj.leerB();
                    break;
                case 3:
                    obj.presentar();
                    break;
                case 4:
                    obj.multiplicar();
                    break;
                case 5:
                    obj.sumar();
                    break;
                case 6:
                    obj.restar();
                    break;
                case 7:
                    opcion2 = obj.Submenu();
                    obj.multiplicar_escalar(opcion2);
                    break;
                case 8:
                    opcion2 = obj.Submenu();
                    obj.transpuesta(opcion2);
                case 0:
                    System.out.println("Gracias por su atencion");
                    break;

            }
        } while (opcion1 != 0);

    }

}

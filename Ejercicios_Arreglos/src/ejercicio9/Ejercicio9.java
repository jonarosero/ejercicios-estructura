package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        int opcion1;

        int[] array = new int[100];

        Metodo_Ejercicio9 obj = new Metodo_Ejercicio9();
        do {
            opcion1 = obj.MenuP();
            switch (opcion1) {
                case 1:
                    obj.leerA(array);
                    break;
                case 2:
                    obj.presentarA(array);
                    break;
                case 3:
                    array = obj.insertarA(array);
                    break;
                case 4:
                    array = obj.eliminarA(array);
                    break;
                case 5:
                    System.out.printf("El total de espacios vacios son: %d\n"
                            + "El total de espacios ocupados son: %d\n", obj.getLibre(), obj.getOcupado());
                    break;
                case 6:
                    array = obj.eliminarA(array);
                    break;
                case 0:
                    System.out.println("Gracias por su atencion");
                    break;

            }
        } while (opcion1 != 0);

    }

}

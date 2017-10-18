package operaciones_arreglos;

import java.util.Scanner;

public class Operaciones_Arreglos {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lim, opcion1, opcion2, elemento, posicion;
        int libres = 0;
        
        System.out.println("Ingrese el limite del arreglo: ");
        lim = scan.nextInt();
        
        int[] array = new int[lim];
        
        Operaciones obj = new Operaciones();
        do{
            opcion1 = obj.MenuP();
            switch(opcion1){
                case 1: 
                    obj.leerA(array);
                    break;
                case 2:
                    obj.presentarA(array);
                    break;
                case 3:
                    obj.ordenarA(array);
                    break;
                case 4:
                    array = obj.insertarA(array);
                    break;
                case 5:
                    opcion2 = obj.MenuB();
                    if (opcion2 == 1){
                        System.out.println("Ingrese el numero a buscar: ");
                        elemento = scan.nextInt();
                        obj.buscar(array,elemento);
                    }else if(opcion2 == 2){
                        System.out.println("Ingrese el numero a buscar: ");
                        elemento = scan.nextInt();
                        obj.ordenarA(array);
                        int buscar = obj.buscarBin(array, elemento);
                        if (buscar == -1){
                            System.out.println("El numero no existe en el arreglo");
                        }else{
                            System.out.printf("El numero %d se encuentra en la posicion: %d\n", elemento, buscar+1);
                        }
                    }else{
                        System.out.println("La opcion ingresada es incorrecta");
                    }
                    break;
                case 6: 
                    System.out.printf("El total de espacios vacios son: %d\n"
                            + "El total de espacios ocupados son: %d\n", obj.getLibre(), obj.getOcupado());
                    break;
                case 7:
                    array = obj.eliminarA(array);
                    break;
                case 0:
                    System.out.println("Gracias por su atencion");
                    break;
                    
            }
        }while(opcion1 !=0);
    }
    
}

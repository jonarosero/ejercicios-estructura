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
                    obj.insertarA(array);
                    break;
                case 5:
                    opcion2 = obj.MenuB();
                    if (opcion2 == 1){
                        System.out.println("Ingrese el numero a buscar: ");
                        elemento = scan.nextInt();
                        obj.buscar(array,elemento);
                    }else{
                        System.out.println("Ingrese el numero a buscar: ");
                        elemento = scan.nextInt();
                        obj.ordenarA(array);
                        obj.buscarBin(array, elemento);
                    }
                    break;
                case 0:
                    System.out.println("Gracias por su atencion");
                    break;
                    
            }
        }while(opcion1 < 6 || opcion1 > 0);
    }
    
}

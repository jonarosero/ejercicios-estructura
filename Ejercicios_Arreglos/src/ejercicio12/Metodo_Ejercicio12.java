package ejercicio12;

import java.util.Scanner;

public class Metodo_Ejercicio12 {
    Scanner scan = new Scanner(System.in);
    private String [] nombres;
    private String buscar;
    
    public void ingresar_nombres(){
        System.out.println("Ingrese el tamaño de la lista: ");
        int lim = scan.nextInt();
        System.out.println();
        nombres = new String[lim];
        for (int i = 0; i < this.nombres.length; i++){
            System.out.printf("Ingrese un nombre para la posicion %d:\n", i+1);
            nombres[i] = scan.nextLine().toUpperCase();
        }
    }
    
    public void presentar_nombres(){
        for (int i = 0; i < this.nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
    
    public void buscar_nombre(){
        System.out.println("Ingrese el nombre a buscar: ");
        boolean bandera = false;
        buscar = scan.nextLine().toUpperCase();
        for (int i = 0; i < this.nombres.length; i++){
            if (buscar == nombres[i]){
                System.out.printf("El nombre de %s se encuentra en la posicion: %d\n", buscar, i+1);
                bandera = true;
            }else{
                bandera = false;
            }
        }
        if (bandera = false){
            System.out.printf("El nombre de %s no se encuentra en la lista\n", buscar);
        }
    }
}

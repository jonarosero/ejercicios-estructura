package operaciones_arreglos;
import java.util.Scanner;


public class Operaciones {
    Scanner scan = new Scanner(System.in);
    
    public int MenuP(){
        int opcion1;
        System.out.printf("MENU\n1.LEER\n2.PRESENTAR\n3.ORDENAR\n4.INSERTAR\n5.BUSCAR\n0.SALIR\nIngrese el numero del menu: \n");
        opcion1 = scan.nextInt();
        return opcion1;
    }
    
    public void leerA(int[]A){
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Ingrese el valor de la %d posición: ", i + 1);
            A[i] = scan.nextInt();
        }
        
    }
    
    public void presentarA(int[]A){
        System.out.println("Su arreglo es : ");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d ", A[i]);
        }
        System.out.println();
        
    }
    public void ordenarA(int[]A){
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
    
    public void insertarA(int[]A){
        System.out.println("Ingrese el numero a insertar en el arreglo: ");
        int num = scan.nextInt();
        int lim = A.length;
        lim = lim + 1;
        int []aux = new int[lim];
        aux[lim-1] = num;
        for (int i = 0; i < lim-1; i++){
            aux[i] = A[i];
        }
        A = new int[lim];
        for (int i = 0; i < lim; i++){
            A[i] = aux[i];
        }
    }
    
    public int MenuB(){
        int opcion2;
        System.out.printf("SUBMENU 5\n1.BUSQUEDA\n2.BUSQUEDA BINARIA\nIngrese el numero del submenu: \n");
        opcion2 = scan.nextInt();
        return opcion2;
    }
    
    public void buscar(int []A, int num){
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
    
    public int buscarBin(int []A, int num){
        int fin = A.length-1, ini = 0,medio;
        while (ini <= fin){
            medio = (fin + ini)/2;
            if (A[medio] == num){
                return medio;
            }else{
                if (num < A[medio]){
                    fin = medio-1;
                }else{
                }ini = medio+1;
            }
        }
        return -1;
        
        
    }
    
}

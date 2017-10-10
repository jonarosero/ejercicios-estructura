package clase1;
import java.util.Scanner;

public class Algoritmos {
    private int lim;
    private int arreglo[]; 
    public static Scanner scan = new Scanner(System.in);
    
    public Algoritmos() {
        
    }
    
    public void ingresar_limite () {
        System.out.print("Ingrese el tamaño del arreglo: ");
        lim = scan.nextInt();
    }
    
    public void ingresar_arreglo () {
        arreglo = new int[lim];
        for (int i = 0 ; i < lim ; i++) {
            System.out.printf("Ingrese el valor de la %d posición: ", i+1);
            arreglo[i] = scan.nextInt();
        }
    }
    
    public void obtener_arreglo () {
        System.out.println("Su arreglo es : ");
        for (int i = 0 ; i < lim ; i++) {
            System.out.printf("%d ", arreglo[i]);
        }
        System.out.println();
    }
    
    public void buscar_arreglo () {
        System.out.println("Ingrese el valor a buscar : ");
        int num = scan.nextInt();
        boolean bandera = false;
        int j = 0;
        
        for (int i = 0 ; i < lim ; i++) {
            if (num == arreglo[i]){
                bandera = true;
                j = i;
            }
        }
        if (bandera == true){
            System.out.printf("Su valor se encuentra en la posición: %d\n", j+1);
        }else{
            System.out.printf("El numero no esta en el arreglo\n");
        }
        
    }
    
    public void ordenar_arreglo(){
       for(int i = 0; i < lim - 1; i++)
        {
                for(int j = 0; j < lim - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
       obtener_arreglo();
    }
    public void modificar_arreglo(){
        System.out.println("Ingrese la posicion que quiere modificar");
        int j = scan.nextInt();
        System.out.println("Ingrese el nuevo numero");
        int num = scan.nextInt();
        arreglo[j-1] = num;
        obtener_arreglo();
    }
    
    //faltan dos ejercicios
    
    
}

package ejercicio2;
import java.util.Scanner;

public class Metodo_Ejercicio2 {
    
    private int array[];
    private int lim;
    private int neg = 0;
    private int pos = 0;
    private int cero = 0;
    Scanner scan = new Scanner(System.in);
    

    public void establecer_Limite(){
        System.out.println("Ingrese un el tamaño del vector: ");
        lim = scan.nextInt();
    }
    
    public void establecer_vector(){
        array = new int [lim];
        for (int i = 0; i < array.length; i ++){
            System.out.printf("Ingrese un elemento del vector en la posicion %d: ", i+1);
            array[i] = scan.nextInt();
            System.out.println();
        }
        
    }
    
    public void calcular_neg(){
        for (int i = 0; i < array.length; i ++){
            if (array[i] < 0){
                neg++;
            }
        }
    }
    
    public void calcular_pos(){
        for (int i = 0; i < array.length; i ++){
            if (array[i] > 0){
                pos++;
            }
        }
    }
    
    public void calcular_cero(){
        for (int i = 0; i < array.length; i ++){
            if (array[i] == 0){
                cero++;
            }
        }
    }
    
    public void presentar_vector(){
        for (int i = 0; i < array.length; i ++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
    
    public void presentar_resultados(){
        System.out.printf("El total de numeros negativos en el vector es de: %d\n", neg);
        System.out.printf("El total de numeros positivos en el vector es de: %d\n", pos);
        System.out.printf("El total de numeros cero en el vector es de: %d\n", cero);
    }
}

package ejercicio7;

public class Metodo_Ejercicio7 {
    
    private int array[];

    
    public void establecer_arreglo(){
        array = new int [100];
        for (int i = 0; i < array.length; i ++){
            array[i] = (i+1)*(i+1);
        }
        
    }
    public void presentar(){
        for (int i = 0; i < array.length; i++){
            System.out.printf("El cuadrado de %d es: %d\n", i+1, array[i]);
        }
    }
    
}

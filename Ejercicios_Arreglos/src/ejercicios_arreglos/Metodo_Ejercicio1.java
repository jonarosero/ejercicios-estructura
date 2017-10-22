package ejercicios_arreglos;

import java.util.Scanner;

public class Metodo_Ejercicio1 {
    Scanner scan = new Scanner(System.in);
        private int columna;
        private int fila;
        private int [][]matriz;
        private int []suma_fila;
        private int []suma_columna;
        
        public Metodo_Ejercicio1(){
            
        }
        
        public void obtener_limites(){
            System.out.println("Ingrese la cantidad de columnas de la matriz: ");
            columna = scan.nextInt();
            
            System.out.println("Ingrese la cantidad de filas de la matriz: ");
            fila = scan.nextInt();
            
        }
        public void obtener_matriz(){
            matriz = new int[fila][columna];
            for (int i = 0; i < fila; i++){
                for (int j = 0; j < columna; j++){
                    System.out.printf("Ingrese un numero para la posicion %s,%d: ", i+1, j+1);
                    matriz[i][j] = scan.nextInt();
                }
                System.out.println();
                
            }
            
            
        }
        public void calcular_columna(){
            this.suma_columna = new int[columna];
            for (int i = 0; i < columna; i++){
                for (int j = 0; i < fila; i++){
                    this.suma_columna[i] = this.suma_columna[i] + this.matriz[i][j];
                }
            }
            
        }
        public void calcular_fila(){
            this.suma_fila = new int[fila];
            for (int i = 0; i < fila; i++){
                for (int j = 0; i < columna; i++){
                    this.suma_fila[i] = this.suma_fila[i] + this.matriz[i][j];
                }
            }
            
        }
        public void presentar_matriz(){
            for (int i = 0; i < fila; i++){
                for (int j = 0; j < columna; j++){
                    System.out.printf("%d ", matriz[i][j]);
                }
                System.out.println();
                
            }
            
            
        }
            
        
        public void presentar_resultados(){
            for(int i = 0; i < columna; i++ ){
                System.out.printf("La suma de la columna: %d es: %d\n", i+1, this.suma_columna[i]);
            }
            for(int i = 0; i < fila; i++ ){
                System.out.printf("La suma de la fila: %d es: %d\n", i+1, this.suma_fila[i]);
            }
        }
    
}

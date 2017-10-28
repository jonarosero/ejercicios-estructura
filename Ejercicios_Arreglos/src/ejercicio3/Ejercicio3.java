package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int A[] = new int [10];
        int B[] = new int [10];
//        int aux;
        Scanner scan = new Scanner(System.in);
        
        for (int i  = 0; i < A.length; i++){
            System.out.println("Ingrese un valor: ");
            A[i] = scan.nextInt();
        }
        
        for(int i = 0; i < A.length; i++){
//            aux = A[i];
            B[i] = fact(A[i]);
        }
        
        for(int i = 0; i < A.length; i++){
            System.out.printf("El factorial de %d es: %d\n", A[i], B[i]);
        }
    }
    public static int fact(int num) {
        if (num == 0){
            return 1;
        }
        if (num <= 1){
            return 1;
        }
        return num * fact(num-1);
    }
}

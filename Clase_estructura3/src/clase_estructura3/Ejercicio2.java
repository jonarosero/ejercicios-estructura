package clase_estructura3;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        int x = 42;
        int y = fibo(x);
        System.out.println(y);
    }
    
    public static int fibo(int n){
        if (n == 0){
            return 0;
            
        }else if(n == 1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
}

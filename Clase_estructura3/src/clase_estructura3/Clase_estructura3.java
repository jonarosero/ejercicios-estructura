package clase_estructura3;


public class Clase_estructura3 {

    
    public static void main(String[] args) {
        int x = 5;
        int y = Factorial(x);
        System.out.println(y);
        
        y = Facto(x);
        System.out.println(y);
        
    }
    
    public static int Factorial(int x){
        if (x == 1){
            return 1;
        }else{
            return x*Factorial(x-1);
        }
    }
    
    public static int Facto(int x){
        int fac = 1;
        for (int i = x; i > 0; i--){
            fac = fac * i;
        }
        return fac;
    }
}

package clase_estructura3;

public class Ejercicio3 {
    public static void main(String[] args) {
        bin(5);
    }
    
    public static String binario(int x){
        int ent = x, res;
        String binario= "";
        
        while(ent != 0){
            ent = x/2;
            res = x%2;
            binario = res + binario;
            
       
        }
        return binario;
    }
    public static void bin(int x){
        if (x != 0){
            binario(x/2);
            System.out.println(x%2);
        }
    }
}

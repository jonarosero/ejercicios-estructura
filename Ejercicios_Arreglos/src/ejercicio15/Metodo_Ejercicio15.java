package ejercicio15;


public class Metodo_Ejercicio15 {
    public int[][] cuadroMagico(int n){
        int matriz[][]=new int[n][n];
        int contador=1;
        int c_ult=0;
        int f_ult=0;
        int c_sig=n/2;
        int f_sig=0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[f_sig][c_sig] = contador;
 
                f_ult = f_sig;
                c_ult = c_sig;
 
                f_sig=f_ult-1;
                c_sig = c_ult+1;
 
                if(f_sig < 0){
                    f_sig = n-1;
                }
                if(c_sig >= n){
                    f_sig = f_ult-1;
                    c_sig = 0;
                }
 
                if(f_sig == -1 || matriz[f_sig][c_sig] != 0){
                    f_sig = f_ult+1;
                    c_sig = c_ult;
                }
                contador++;
            }
        }
        return matriz;
    }
    
    public void presentar(int [][]matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.printf("%d  ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}


package ejercicio16;

public class Metodo_Ejercicio16 {

    public void printmat(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(String.valueOf(matriz[i][j]) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] submatrize(int matriz[][], int x, int y) {
        int submatriz[][] = new int[matriz.length - 1][matriz.length - 1];
        int cur_x = 0;
        int cur_y = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i != x) {
                cur_y = 0;
                for (int j = 0; j < matriz.length; j++) {
                    if (j != y) {
                        submatriz[cur_x][cur_y] = matriz[i][j];
                        cur_y++;
                    }
                }
                cur_x++;
            }
        }
        return submatriz;
    }

    public int determin(int matriz[][]) {
        int deter = 0;
        int mult = 1;
        if (matriz.length > 2) {
            for (int i = 0; i < matriz.length; i++) {
                deter += mult * matriz[i][0] * determin(submatrize(matriz, i, 0));
                mult *= -1;
            }
            return deter;
        } else {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
    }

}

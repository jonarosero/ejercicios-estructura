package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        Metodo_Ejercicio14 met = new Metodo_Ejercicio14();

        met.ingresar_matriz();
        System.out.println("La matriz original es:");
        met.imprimir();
        met.ordenar();
        System.out.println("La matriz ordenada es:");
        met.imprimir();
    }

}

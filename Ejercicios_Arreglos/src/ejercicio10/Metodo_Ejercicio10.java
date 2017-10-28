package ejercicio10;

import java.util.Scanner;
/* Codigo por revisar
public class Metodo_Ejercicio10 {
    Scanner scan = new Scanner(System.in);
    private String asig[] = new String [5];
    private double notas[] = new double [5];
    private String alumno[] = new String [20];
    private int falta = 0;
    
    public void ingresar_alumnos(){
        for (int i = 0; i < alumno.length; i++){
            System.out.println("Ingrese el nombre del alumno: ");
            alumno[i] = scan.nextLine();
        }
    }
    
    public void ingresar_asignaturas(){
        for (int i = 0; i < asig.length; i++){
            System.out.println("Ingrese el nombre del alumno: ");
            asig[i] = scan.nextLine();
        }
    }
    
    public void ingresar_notas(){
        for (int i = 0; i < alumno.length; i++){
            System.out.printf("Alumno: %s\n", alumno[i]);
            for(int j = 0; j < asig.length; j++){
                System.out.printf("Asignatura:%s\nIngrese una nota: ", asig[i]);
                notas[i] = scan.nextInt();
                System.out.println();
                if (notas[i] == 0){
                    falta++;
                }
            }
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesavl;

/**
 *
 * @author JR
 */
import java.util.Scanner;
public class ArbolesAVL {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol avl = new Arbol();
        Scanner scan = new Scanner(System.in);
        int op = 0;
        int op2 = 2;
        do{
            System.out.printf("\n\t\tARBOLES AVL\n "
                    + "1)Ingresar Nodos\n "
                    + "2)Eliminar Nodos\n "
                    + "3)Recorrido Preorden\n "
                    + "4)Recorrido Inorden\n "
                    + "5)Recorrido Postorden\n "
                    + "0)Terminar\n ");
            System.out.print("Eliga una opcion: ");
            op = scan.nextInt();
            
            switch (op){
                case 1:
                    do{
                        System.out.println("Ingrese un valor para el nuevo Nodo: ");
                        int dato = scan.nextInt();
                        avl.insertar(dato);
                        System.out.println("Desea Ingresar otro Nodo:\n "
                                + "1)Si\n "
                                + "2)No");
                        op2 = scan.nextInt();
                    }while(op2 != 2);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Recorrido PREORDEN: ");
                    avl.preOrden(avl.getRaiz());
                    break;
                case 4:
                    System.out.print("Recorrido INORDEN: ");
                    avl.inOrden(avl.getRaiz());
                    break;
                case 5:
                    System.out.print("Recorrido POSTORDEN: ");
                    avl.postOrden(avl.getRaiz());
                    break;
                default:
                    System.out.println("La opcion ingresada no se encuentra ");
                    break;
                case 0:
                    System.out.println("Finalizando....");
            }
        }while (op != 0);
        
        
    }
    
}

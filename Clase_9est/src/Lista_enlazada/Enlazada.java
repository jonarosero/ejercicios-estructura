/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_enlazada;

import java.util.Scanner;

public class Enlazada {
    
    private Nodo head;
    private int array[];

    public Enlazada() {
        this.head = null;
    }
    public int [] add_arreglo(int valor){
        Scanner scan = new Scanner(System.in);
        array = new int [valor];
        for(int i = 0; i < this.array.length; i++){
            System.out.printf("Ingrese un valor para la posicion %d:\n", i+1);
            array[i] = scan.nextInt();
        }
        return array;
    }
    public void mostrar_arreglo(int[]arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf(" %d ", arreglo[i]);
        }
        System.out.println("]");
    }
    public void add_Nodo(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo actual = head;
        Nodo actual2;
        if (head == null){
            head = nuevo;
        } else {
            while (actual.sig != null) {
                actual2 = actual.sig;
                
                if (nuevo.valor <= actual.valor) {
                    nuevo.sig = head;
                    head = nuevo;
                    break;
                } else {
                    if (nuevo.valor > actual.valor && actual.sig == null) {
                        actual.sig = nuevo;
                        nuevo.sig = null;
                        break;
                    } else {
                        if (nuevo.valor > actual.valor && actual.sig.valor <= nuevo.valor) {
                            actual.sig = nuevo;
                            nuevo.sig = actual.sig;
                            break;
                        } else {
                            actual = actual.sig;
                        }
                    }
                }
            }
        }
    }
   
 
    public void mostrar(){
        Nodo actual = head;
        while (actual != null){
            System.out.print("["+actual.valor+"]->");
            actual = actual.sig;
        }
        System.out.println("NULL");
    }
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, elem, num;
        int arreglo[] = new int[0];
        Enlazada miLista = new Enlazada();
        do{
            System.out.printf("1.Ingresar un arreglo\n2.Mostrar Arreglo\n"
                    + "3.Ingresar arreglo en lista enlazada\n4.Listar Lista enlazada\n0.Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el limite del arreglo");
                    elem = scan.nextInt();
                    arreglo = miLista.add_arreglo(elem);
                    break;
                    
                case 2:
                    miLista.mostrar_arreglo(arreglo);
                    break;
                    
                case 3:
                    for (int i = 0; i < arreglo.length; i++) {
                        miLista.add_Nodo(arreglo[i]);
                    }
                    break;
                    
                case 4:
                    miLista.mostrar();
                default: break;
            }
        } while (op != 0);
        
    }
    
}

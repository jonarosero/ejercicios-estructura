/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_estructuras;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    private Nodo head;
    private Nodo cola;

    public Principal() {
        this.head = null;
        this.cola = null;
    }

    public void add_Inicio(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (head == null) {
            head = nuevo;
            cola = nuevo;
        } else {
            nuevo.sig = head;
            head.act = nuevo;
            head = nuevo;
        }
    }

    public void add_Final(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (head == null) {
            head = nuevo;
            cola = nuevo;
        } else {
            nuevo.act = cola;
            cola.sig = nuevo;
            cola = nuevo;
        }
    }

    public void add_Orden(int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo actual;

        if (this.head == null) {
            this.head = nuevo;
            this.cola = nuevo;
        } else if (this.head.valor >= nuevo.valor) {

            nuevo.sig = this.head;
            this.head.act = nuevo;
            this.head = nuevo;
        } else {
            actual = this.head;
            while (actual.sig != null && actual.sig.valor < nuevo.valor) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            if (actual.sig != null) {
                nuevo.sig.act = nuevo;
            } else {
                this.cola = nuevo;
            }
            actual.sig = nuevo;
            nuevo.act = actual;
        }
    }

    public void eliminar(int valor) {
        Nodo actual = this.head;
        if (this.head.valor == valor) {
            if (this.head.sig == null) {
                this.head = this.cola = null;
            } else {
                this.head = this.head.sig;
                this.head.act = null;
            }
        } else if (this.cola.valor == valor) {
            this.cola = this.cola.act;
            this.cola.sig = null;
        } else {
            while (actual.sig != this.cola) {
                if (actual.sig.valor == valor) {
                    actual.sig = actual.sig.sig;
                    actual.sig.act = actual;
                }
                actual = actual.sig;
            }
        }
    }
    
    public void imprimir_Cabeza() {
        Nodo actual = this.head;
        System.out.print("NULL");
        while (actual != null) {
            System.out.print("<- [" + actual.valor + "] ->");
            actual = actual.sig;
        }
        System.out.println("NULL");
    }

    public void imprimir_Cola() {
        Nodo actual = this.cola;
        System.out.print("NULL");
        while (actual != null) {
            System.out.print("<- [" + actual.valor + "] ->");
            actual = actual.act;
        }
        System.out.println("NULL");
    }
    
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, elem, num;
        Principal miLista = new Principal();
        do{
            System.out.printf("1.Ingresar un nuevo Nodo al inicio"
                    + "\n2.Ingresar un nuevo Nodo al final"
                    + "\n3.Insertar Nodo y obtener lista ordenada"
                    + "\n4.Eliminar Nodo"
                    + "\n5.Presentar desde el inicio"
                    + "\n6.Presentar desde el final\n0.Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("ELemento:");
                    elem = scan.nextInt();
                    miLista.add_Inicio(elem);
                    break;
                case 2:
                    System.out.println("Elemento:");
                    elem = scan.nextInt();
                    miLista.add_Final(elem);
                    break;
                case 3:
                    System.out.println("Elemento:");
                    elem = scan.nextInt();
                    miLista.add_Orden(elem);
                    break;
                case 4:
                    System.out.println("Ingrese el elemento a eliminar:");
                    elem = scan.nextInt();
                    miLista.eliminar(elem);
                    break;
                case 5:
                    System.out.println("Presentacion desde la CABEZA -> COLA");
                    miLista.imprimir_Cabeza();
                    break;
                case 6:
                    System.out.println("Presentacion desde la COLA -> CABEZA");
                    miLista.imprimir_Cola();
                    break;
                
                default: break;
            }
        } while (op != 0);
        
    
    }

}

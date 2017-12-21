//Listas enlazadas dobles
package clase_9est;

import java.util.Scanner;

public class Clase_9est {

    private Nodo head;
    private Nodo cola;

    public Clase_9est() {
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

    public void addNodoOrdenado(int valor) {
        Nodo newNodo = new Nodo(valor);
        Nodo actual;

        // Cuando no se tiene valores
        if (this.head == null) {
            this.head = newNodo;
            this.cola = newNodo;
        } else {
            // Cuando el valor ingresado es menor a la cabeza
            if (this.head.valor >= newNodo.valor) {
                newNodo.sig = this.head;
                this.head.act = newNodo;
                this.head = newNodo;
            } else {
                actual = this.head;
                // Se busca al Nodo que apuntara al nuevo Nodo
                while (actual.sig != null && actual.sig.valor < newNodo.valor) {
                    actual = actual.sig;
                }
                // Insertamos al nuevo Nodo 
                newNodo.sig = actual.sig;
                if (actual.sig != null) {
                    newNodo.sig.act = newNodo;
                } else {
                    this.cola = newNodo;
                }
                actual.sig = newNodo;
                newNodo.act = actual;
            }
        }
    }

    public String deleteNodo(int valor) {
        Nodo actual = this.head;
        // Se considera si se elimina la cabeza
        if (this.head.valor == valor) {
            if (this.head.sig == null) {
                this.head = this.cola = null;
            } else {
                this.head = this.head.sig;
                this.head.act = null;
            }
            return "Nodo eliminado (Posición Inicial)";
        } else {
            // Si se elimina la cola
            if (this.cola.valor == valor) {
                this.cola = this.cola.act;
                this.cola.sig = null;
                return "Nodo eliminado (Posición Final)";
            } else {
                // Si es un valor intermedio
                while (actual.sig != this.cola) {
                    if (actual.sig.valor == valor) {
                        actual.sig = actual.sig.sig;
                        actual.sig.act = actual;
                        return "Nodo eliminado (Posición Intermedia)";
                    }
                    actual = actual.sig;
                }
                return "Nodo no eliminado (No existe Nodo con ese valor)";
            }
        }
    }

    public void printFromHead() {
        Nodo actual = this.head;
        // Muestra la lista de color azul para poder indentificarla mas facil
        System.out.print((char) 27 + "[34m   null ");
        while (actual != null) {
            System.out.print("<- [" + actual.valor + "] ->");
            actual = actual.sig;
        }
        System.out.println(" null");
    }

    public void printFromTail() {
        Nodo actual = this.cola;
        // Muestra la lista de color azul para poder indentificarla mas facil
        System.out.print((char) 27 + "[34m   null ");
        while (actual != null) {
            System.out.print("<- [" + actual.valor + "] ->");
            actual = actual.act;
        }
        System.out.println(" null");
    }

    public int pedirValorNodo() {
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.print("   Ingrese el valor del Nodo : ");
        valor = scan.nextInt();
        return valor;
    }

   
  
    public void addOrden(int valor){//lista enlazada ordenar simple
        Nodo nuevo = new Nodo(valor);
        if(head ==  null){
            head = nuevo;
            cola = nuevo;
        }else{
            if (valor < head.valor){
                nuevo.sig = head;
                head = nuevo;
            }else{
                Nodo actual = head;
                while ((actual.sig != null) && (actual.sig.valor < valor)) {
                    actual = actual.sig;
                }
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
            }
            
        }
        
    }
    
    public void mostrar(){
        Nodo actual = head;
        System.out.print("NULL");
        while (actual != null){
            System.out.print("<-["+actual.valor+"]->");
            actual = actual.sig;
        }
        System.out.println("NULL");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, elem, num;
        Clase_9est miLista = new Clase_9est();
        do{
            System.out.printf("1.Ingresar un nuevo nodo al inicio\n2.Ingresar un nuevo nodo al final\n3.Listar\n0.Salir\n");
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
                    miLista.mostrar();
                    break;
                    
                
                default: break;
            }
        } while (op != 0);
        
    }
    
}

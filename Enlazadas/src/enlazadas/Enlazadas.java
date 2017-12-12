package enlazadas;

import java.util.Scanner;

public class Enlazadas {
    
    private Nodo head;

    public Enlazadas() {
        this.head = null;
    }
    
    public void add_Nodo(int valor){
        Nodo nuevo = new Nodo(valor);
        nuevo.sig = head;
        head = nuevo;
    }
   
    public void add_Final(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo actual = head;
        if(head ==  null){
            head = nuevo;
        }else{
            while(actual.sig != null){
                actual = actual.sig;
            }
            actual.sig = nuevo;
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
    
    public void ordenar(int valor){
        Nodo nuevo = new Nodo(valor);
        Nodo actual = head;
        if(head ==  null){
            head = nuevo;
        }else{
            
        }
    }
    
    public void eliminar(int valor){
        Nodo actual = head;
        while(actual != null){
            if(actual.valor == valor){
                head = head.sig;
                break;
            }else if(actual.sig.valor == valor){
                actual.sig = actual.sig.sig;
                break;
            }else{
                actual = actual.sig;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, elem, num;
        Enlazadas miLista = new Enlazadas();
        do{
            System.out.printf("1.Ingresar un nuevo nodo\n2.Listar\n3.Eliminar\n0.Salir");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("ELemento:");
                    elem = scan.nextInt();
                    miLista.add_Final(elem);
                    break;
                    
                case 2:
                    miLista.mostrar();
                    break;
                    
                case 3:
                    System.out.println("Eliminar elemento: ");
                    num = scan.nextInt();
                    miLista.eliminar(num);
                    break;
                    
                default: break;
            }
        } while (op != 0);
        
    }
    
}

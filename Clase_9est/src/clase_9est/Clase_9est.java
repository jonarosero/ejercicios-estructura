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
    
    public void add_Inicio(int valor){
        Nodo nuevo = new Nodo(valor);

        if(head ==  null){
            head = nuevo;
            cola = nuevo;
        }else{
            nuevo.sig = head;
            head.act = nuevo;
            head = nuevo;
        }
    }
   
    public void add_Final(int valor){
        Nodo nuevo = new Nodo(valor);

        if(head ==  null){
            head = nuevo;
            cola = nuevo;
        }else{
            nuevo.act = cola;
            cola.sig = nuevo;
            cola = nuevo;
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

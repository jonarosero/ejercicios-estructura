/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author USUARIO
 */
public class Arboles {
    Nodo raiz = null;
    
    public void AddNodo(Nodo actual, int valor) {
        if (actual == null) {
            Nodo nuevo = new Nodo(valor);
            actual = nuevo;
        } else if (actual.valor < valor){
            AddNodo(actual.der, valor);
        } else{
            AddNodo(actual.izq, valor); 
        }

    }
    
    public void Preorden(Nodo actual){
        if (actual != null) {
            System.out.print(actual.valor);
            Preorden(actual.izq);
            Preorden(actual.der);
        }
    }
    
    public void Inorden(Nodo actual){
        if (actual != null) {
            Inorden(actual.izq);
            System.out.print(actual.valor);
            Inorden (actual.der);
        }
    }
    
    public void Postorden(Nodo actual){
        if (actual != null) {
            Postorden(actual.izq);
            Postorden(actual.der);
            System.out.print(actual.valor);
        }
    }
    
    public void Eliminar(Nodo actual, int valor){
        if ((actual.valor != valor) && (actual != null)){
            if (valor > actual.valor){
                Eliminar(actual.der, valor);
                
            }else{
                Eliminar(actual.izq, valor);
            }
        }else{
            if((actual.der == null) && (actual.izq == null)){
                actual = null;
            }else{ 
                if(actual.izq != null){
                    Nodo aux = actual.izq;
                    while(aux.der != null){
                        aux = aux.der;
                    }
                    actual.valor = aux.valor;
                    aux = aux.izq;
                }else{
                    Nodo aux = actual.der;
                    while(aux.izq != null){
                        aux = aux.izq;
                    }
                    actual.valor = aux.valor;
                    aux = aux.der;
                }
                
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

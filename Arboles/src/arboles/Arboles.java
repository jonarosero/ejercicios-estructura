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
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

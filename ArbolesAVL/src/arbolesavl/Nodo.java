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
public class Nodo {
    int dato;
    int factor;
    Nodo izq;
    Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        this.factor = 0;
        this.izq = null;
        this.der = null;
    }
    
    
}

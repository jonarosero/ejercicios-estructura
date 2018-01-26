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
public class Arbol {
    private Nodo raiz;
    
    public Arbol(){
        raiz = null;
    }
    //Obtener la raiz
    public Nodo getRaiz() {
        return raiz;
    }

    //Obtener el factor de Equilibrio
    public int obtener_FE(Nodo actual){
        if(actual == null){
            return -1;
            
        }else{
            return actual.factor;
        }
    }
    //Rotacion Simple Izquierda
    public Nodo rotacionIzquierda(Nodo actual){
        Nodo auxiliar = actual.izq;
        actual.izq = auxiliar.der;
        auxiliar.der = actual;
        actual.factor = Math.max(obtener_FE(actual.izq), obtener_FE(actual.der)) + 1;
        auxiliar.factor  = Math.max(obtener_FE(auxiliar.izq), obtener_FE(auxiliar.der)) + 1;
        return auxiliar;
    }
    //Rotacion Simple Derecha
    public Nodo rotacionDerecha(Nodo actual){
        Nodo auxiliar = actual.der;
        actual.der = auxiliar.izq;
        auxiliar.izq = actual;
        actual.factor = Math.max(obtener_FE(actual.izq), obtener_FE(actual.der)) + 1;
        auxiliar.factor  = Math.max(obtener_FE(auxiliar.izq), obtener_FE(auxiliar.der)) + 1;
        return auxiliar;
    }
    //Rotacion Doble Izquierda
    public Nodo rotacion_DI(Nodo actual){
        Nodo auxiliar;
        actual.izq = rotacionDerecha(actual.izq);
        auxiliar = rotacionIzquierda(actual);
        return auxiliar;
    }
    //Rotacion Doble Derecha
    public Nodo rotacion_DD(Nodo actual){
        Nodo auxiliar;
        actual.der = rotacionIzquierda(actual.der);
        auxiliar = rotacionDerecha(actual);
        return auxiliar;
    }
    //Insertar Arbol AVL
    public Nodo insertarAVL(Nodo nuevo, Nodo actual){
        Nodo auxiliar = actual;
        if (nuevo.dato < actual.dato){
            if(actual.izq == null){
                actual.izq = nuevo;
            }else{
                actual.izq = insertarAVL(nuevo, actual.izq);
                if ((obtener_FE(actual.izq) - obtener_FE(actual.der)) == 2){
                    if(nuevo.dato < actual.izq.dato){
                        auxiliar = rotacionIzquierda(actual);
                    }else{
                        auxiliar = rotacion_DI(actual);
                    }
                }
            }
        }else if(nuevo.dato > actual.dato){
            if(actual.der == null){
                actual.der = nuevo;
            }else{
                actual.der = insertarAVL(nuevo, actual.der);
                if((obtener_FE(actual.der) - obtener_FE(actual.izq)) == 2){
                    if(nuevo.dato > actual.der.dato){
                        auxiliar = rotacionDerecha(actual);
                    }else{
                        auxiliar = rotacion_DD(actual);
                    }
                }
            }
        }else{
            System.out.println("El número ya existe");
        }
        //Actualiza factor equilibrio
        if ((actual.izq == null) && (actual.der != null)){
            actual.factor = actual.der.factor + 1;
        }else if((actual.der == null) && (actual.izq != null)){
            actual.factor = actual.izq.factor + 1;
        }else{
            actual.factor = Math.max(obtener_FE(actual.izq), obtener_FE(actual.der)) + 1;
        }
        return auxiliar;
        
    }
    //Insertar Arbol
    public void insertar(int dato){
        Nodo nuevo = new Nodo (dato);
        if (raiz == null){
            raiz = nuevo;
        }else{
            raiz = insertarAVL(nuevo, raiz);
        }
        
    }
    //Recorrido
    //Orden
    public void inOrden(Nodo actual){
        if (actual != null){
            inOrden(actual.izq);
            System.out.print(actual.dato + ", ");
            inOrden(actual.der);
        }
    }
    //Preorden
    public void preOrden(Nodo actual){
        if (actual != null){
            System.out.print(actual.dato + ", ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }
    //Postorden
    public void postOrden(Nodo actual){
        if (actual != null){
            postOrden(actual.izq);
            postOrden(actual.der);
            System.out.print(actual.dato + ", ");
        }
    }
}

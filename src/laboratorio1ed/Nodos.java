package laboratorio1ed;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */

// La clase que contiene los nodos Anterior y siguiente y el dato
public class Nodos {
    public int dato;
    Nodos Anterior, Siguiente;
    
    // Cuando no hay nodos
    public Nodos(int elemento){
        this(elemento,null,null);
    }
    // Cuando sí hay nodos
    public Nodos(int elemento, Nodos siguiente, Nodos anterior){
        dato = elemento;
        Siguiente = siguiente;
        Anterior = anterior;
    }
    
    
}



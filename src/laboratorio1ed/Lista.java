package laboratorio1ed;

import javax.swing.JOptionPane;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Lista {
    private Nodos inicio,fin;
    public Lista (){
        inicio = fin = null;
    }
    
    // Método para saber si la lista está vacía 
    public boolean estaVacia(){
        return inicio == null;
    }

    // Método para agregar el nodos al final
    public void AgregarNodoAlFinal(int dato){
        if(!estaVacia()){
            fin = new Nodos(dato, null, fin);
            fin.Anterior.Siguiente = fin;
        }else{
            inicio = fin = new Nodos(dato);
        }
    }
     
    // Método para agregar el nodo al inicio
    public void AgregarNodoAlInicio(int dato){
        if(!estaVacia()){
            inicio = new Nodos(dato,inicio,null);
            inicio.Siguiente.Anterior = inicio;
        }else{
            fin = inicio = new Nodos(dato);
        }
    }
    
    // Método para recorrer la lista de inicio a fin
    public void RecorrerListaInicioFinal(){
        if(!estaVacia()){
        String datos = "";   
        Nodos aux = inicio;
            while(aux != null){
               datos =  datos + "Fantasma " + aux.dato + " \n";
                aux = aux.Siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Método para recorrer la lista de fin a inicio
    public void RecorrerListaFinalInicio(){
        if(!estaVacia()){
            String datos = "";
            Nodos aux = fin;
            while(aux != null){
                datos =  datos + "Fantasma " + aux.dato + " \n";
                aux = aux.Anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de final a inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    // Método para eliminar el nodo desde el inicio
    public int EliminarNodoInicio(){
        int elemento = inicio.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.Siguiente;
            inicio.Anterior = null;
        }
        return elemento;
    }
    
    // Método para eliminar el nodo desde el fimal
    public int EliminarNodoFinal(){
        int elemento = fin.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.Anterior;
            fin.Siguiente = null;
        }
        return elemento;
    }
}

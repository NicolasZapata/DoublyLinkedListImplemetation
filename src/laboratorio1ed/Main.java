package laboratorio1ed;

import javax.swing.JOptionPane;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 * ESTRUCTURA DE DATOS
 * Referencias -> https://youtu.be/8oCjWIJJI9c https://youtu.be/auxlBjH7XuQ
 * UNIR 2020
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        int opcion = 0, elemento;
        
        do{
            try{
                // El menú de Opciones
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar un fantasma al comienzo \n"
                        + "2. Agregar un nuevo fantasma al final\n"
                        + "3. Mostrar la lista de fantasmas de inicio a final\n"
                        + "4. Mostrar la lista de fantasma de final a inicio\n"
                        + "5. Eliminar un fantasma del inicio de la lista \n"
                        + "6. Eliminar un fantasma en el final\n"
                        + "7.Salir\n"
                        + "¿Que desea hacer?","Lista de Fantasmas de Pac-Man",
                        JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1: // Agregando un Fantasma al inicio de la lista
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa fantasma a la lista",
                                "Fantasma Agregado",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.AgregarNodoAlInicio(elemento);
                    break;
                    
                    case 2: // Agregando un fantasma al final de la lista
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa Fantasma a la lista",
                                "Fantasma Agregado",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.AgregarNodoAlFinal(elemento);
                    break;
                    
                     // Recorriendo la lista de inicio a final, 
                    // de lo contrario el programa dirá que la lista está vacía y que no hay nada que recorrer
                    case 3: 
                        if(!lista.estaVacia()){
                            lista.RecorrerListaFinalInicio();
                        }else{
                            JOptionPane.showMessageDialog(null, 
                                    "No hay fantasmas en la lista", "Lista de fantasmas", 
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    break;
                    
                     // Recorriendo la lista de final a inicio, 
                    // de lo contrario el programa dirá que la lista está vacía y que no hay nada que recorrer
                    case 4:
                        if(!lista.estaVacia()){
                            lista.RecorrerListaInicioFinal();
                        }else{
                            JOptionPane.showMessageDialog(null, 
                                    "No hay fantasmas registrados", "Lista de fantasmas", 
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    break;
                    
                    // Eliminando un fantasma del inicio de la lista, 
                    // si está vacía la lista salta el mensaje de que está vacía la lista
                    case 5: 
                        if(!lista.estaVacia()){
                            elemento = lista.EliminarNodoInicio();
                            JOptionPane.showMessageDialog(null, 
                                    "Eliminaste al fantasma " + elemento + " De la lista", "Fantasma Eliminado",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "La lista se encuentra vacía", "Lista de fantasmas vacía",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    break;
                    
                    // Eliminando un fantasma del final de la lista, 
                    // si está vacía la lista salta el mensaje de que está vacía la lista
                    case 6: 
                            if(!lista.estaVacia()){
                            elemento = lista.EliminarNodoFinal();
                            JOptionPane.showMessageDialog(null, 
                                    "Eliminaste al fantasma " + elemento + " De la lista", "Fantasma Eliminado",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,
                                    "La lista se encuentra vacía", "Lista de fantasmas vacía",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    break;
                
                    case 7: // Despidiéndose del usuario si éste decide dejar el programa
                        JOptionPane.showMessageDialog(null, 
                                "Programa terminado... Vuelva Pronto","Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                    // Si el usuario ingresa una opción que no coincide con el menú, 
                    // saltará el mensaje de que la opción de que no está en el menú
                    default: 
                        JOptionPane.showMessageDialog(null,
                                "La opción no está en el menu", "Error", 
                                JOptionPane.ERROR_MESSAGE);
                }
            
            // Saltará un error por medio del Try Catch si llegase a ocurrir un error dentro del programa
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion != 7);
    }
    
}

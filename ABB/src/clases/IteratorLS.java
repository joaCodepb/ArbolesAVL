 package clases;
 import java.util.Iterator;

/**
 * Clase para el manejo de Iteradores en una Lista Simple Enlazada<> 
 * @author Joaquin
 * @param <T> parametro para las listas enlazadas
 */
public class IteratorLS<T> implements Iterator<T>{
    private Nodo<T> posicion;

    /**
     * Constructor con parametros de la clase iterador de la clase lista simple
     * @param posicion es de tipo Nodo<T> el cual contiene un nodo de la lista a iterar
     */
    IteratorLS(Nodo<T> posicion) {
        this.posicion=posicion;	
    }
    
    /**
     * Metodo que informa si existe otro elemento en la lista para seguir iterando
     * @return un tipo boolean que informa si existe o no un dato en la lista, desde la posición 
     * actual del cursor.
     */
    @Override
    public boolean hasNext(){
        return (posicion!=null);    
    }
    
    /**
     * Metodo que retorna un dato de la posición actual del cursor del iterador.
     * El cursor queda en la siguiente posición.
     * @return un tipo T que contiene el dato actual
     */
    @Override
    public T next() {
        if(!this.hasNext()) {
            System.err.println("Error no hay mas elementos");
            return null;
        }
        Nodo<T> actual=posicion;
        posicion=posicion.getSig();
        return(actual.getValor());
    }
}
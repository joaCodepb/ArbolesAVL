package clases;
/**
 * Clase que con la informacion de los nodos de cada lista
 * @author Joaquin
 * @param <T> 
 */
class Nodo<T> {
    private T valor;
    private Nodo<T> sig;
	
    /**
    * Contructor vacío
    * Inicializa el campo valor  y el campo siguiente en null
    */
    Nodo(){
        this.valor=null;
        this.sig=null;
    }
    
    /**
     * Contructor inicializa datos del Nodo
     * @param valor Objeto de tipo T con la raiz
     * @param sig Siguiente Nodo
     */
    Nodo(T valor, Nodo<T> sig) {
        this.valor=valor;
        this.sig=sig;
    }
    
    /**
     * Obtiene el Valor del nodo
     * @return Un objeto tipo T
     */
    T getValor() {
        return this.valor;
    }
    
    /**
     * Obtiene el Nodo Siguiente
     * @return El nodo siguiente o null si el último nodo o si es una Lista
     * con cardinalidad 1
     */
    Nodo<T> getSig() {
        return this.sig;
    }
    
    /**
     * Cambia el valor del Nodo del campo Info
     * @param nuevo - Nuevo objeto que desea almacenarse en el Nodo
     */
    void setValor(T nuevo) {
        this.valor=nuevo;
    }
    
    /**
     * Cambia el nodo siguiente
     * @param nuevo - Nuevo Nodo Siguiente
    */
    void setSig(Nodo<T> nuevo) {
        this.sig=nuevo;
    }
}
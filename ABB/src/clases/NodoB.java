package clases;

/**
 * Clase que contiene la informacion de los nodos de cada arbol
 * @author Joaquin
 * @param <T> Lista Simple Enlazada que contendra los iteradores
 */
public class NodoB<T>{
    private T raiz;
    private NodoB<T> izq, der;
    
    /**
     * Contructor
     */
    public NodoB() {
    }
    
    /**
     * Constructor con parametros de la clase
     * @param raiz es de tipo T el cual contiene la información del nodo del arbol
     * @param izq es de tipo Nodo<> contiene el nodo izquierdo
     * @param der es de tipo Nodo<> posee el nodo derecho
     */
    public NodoB(T raiz, NodoB<T> izq, NodoB<T> der) {
        this.raiz=raiz;
        this.izq=izq;
        this.der=der;
    }
    
    /**
     * Contructor con parametros de la clase que genera una hoja del arbol
     * @param raiz que contendra el dato del nodo
     */
    public NodoB(T raiz) {
        this.raiz=raiz;
        this.izq=this.der=null;
    }
    /**
     * Retona la raiz del nodo
     * @return un tipo T que contiene la información del nodo
     */
    public T getValor() {
        return this.raiz;
    }
    
    /**
     * Retona el nodo izquierdo
     * @return un tipo Nodo<> el cual contiene el nodo izquierdo
     */
    public NodoB<T> getIzq() {
        return this.izq;
    }
    
    /**
     * Retona el nodo derecho
     * @return un tipo Nodo <> el cual es el nodo derecho
     */
    public NodoB<T> getDer() {
        return this.der;
    }
    
    /**
     * Modifica el nodo izquierdo
     * @param i es de tipo NodoB<> que es el nodo izquierdo
     */
    public void setIzq(NodoB<T> i) {
        this.izq=i;
    }
    
    /**
     * Modifica el nodo derecho
     * @param d es de tipo NodoN<> que contiene el nodo derecho
     */
    public void setDer(NodoB<T> d) {
        this.der=d;
    }
    
    /**
     * Modifica el contenido del nodo
     * @param d de tipo T y contiene la información del nodo
     */
    public void setValor(T d) {
        this.raiz=d;
    }
}

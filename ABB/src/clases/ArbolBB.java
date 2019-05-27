package clases;
import java.util.Iterator;

/**
 * Clase para crear el arbol 
 * insertar sus nodos, borrar, buscar y mostrar recorrido de busqueda
 * @author Joaquin
 * @param <T> 
 */
public class ArbolBB<T> extends ArbolB<T>{
	
    /**
     * Constructor de la clase
     */
    public ArbolBB(){
        super();
    }
    
    /**
     * Inserta el valor escaneado en el arbol
     * @param dato - de tipo T para comensar a llenar la lista
     * @return 
     */
    public boolean insertar(T dato){
        NodoB<T> rr=this.buscar(dato)?null:insertar(this.raiz, dato);
        if(rr!=null)
             this.setRaiz(rr);
        return (rr!=null);
    }		
    
    /**
     * Inserta el nodo comparando si es mayor / menor que la raiz
     * @param r - dato que contiene la raiz del arbol
     * @param dato - dato nuevo a insertar
     * @return 
     */
    private NodoB<T> insertar(NodoB<T> r, T dato){
        if(r==null){
            return(new NodoB<>(dato,null, null));
        }
        int compara=((Comparable)r.getValor()).compareTo(dato);
        if(compara>0)  
            r.setIzq(insertar(r.getIzq(), dato));
        else{
            if(compara<0) {
                r.setDer(insertar(r.getDer(), dato));
            }
        }
        return r;
    } 
    
    /**
     * Metodo Publico para borrar el dato del arbol
     * @param delete - dato de tipo entero a eliminar
     * @return 
     */
    public T borrar(T delete){
        if(!this.buscar(delete)){
            return null;
        }
        NodoB<T> z=borrar(this.raiz,delete);
        this.setRaiz(z);
        return delete;
    }
    
    /**
     * Metodo para realizar la eliminacion de un nodo
     * @param r - valor de la raiz
     * @param delete - valor a eliminar
     * @return 
     */
    private NodoB<T> borrar(NodoB<T> r, T delete){
        if (r==null){
                return null;	
        }
        int compara=((Comparable)r.getValor()).compareTo(delete);
        if(compara>0){
                r.setIzq(borrar(r.getIzq(), delete));
        }
        else{
            if(compara<0){
                    r.setDer(borrar(r.getDer(), delete));
            }
            else{
                if(r.getIzq()!=null && r.getDer()!=null){
                    NodoB<T> cambiar=buscarMin(r.getDer());
                    T aux=cambiar.getValor();
                    cambiar.setValor(r.getValor());
                    r.setValor(aux);
                    r.setDer(borrar(r.getDer(),delete));
                }
                else{
                    r=(r.getIzq()!=null)? r.getIzq():r.getDer();
                }
                }
        }
        return r;
    } 

    /**
     * Realiza la busqueda del nodo con valor minimo
     * @param r - Raiz del arbol
     * @return 
     */
    @SuppressWarnings("empty-statement")
    private NodoB<T> buscarMin(NodoB<T> r){
        for(; r.getIzq()!=null; r=r.getIzq());
        return(r);
    }
    
    /**
     * Metodo para realizar busqueda de un nodo en el arbol
     * @param b - dato de tipo iterator entero para buscar
     * @return Retorna un verdadero si existe un falso si no existe
     */
    public boolean buscar(T b){
        return(buscar(this.raiz, b));
    }
    
    /**
     * Metodo que realiza la comparacion de cada nodo para ver si existe
     * @param r - raiz del arbol
     * @param b - Valor a buscar
     * @return  Retorna un verdadero si existe un falso si no existe
     */
    private boolean buscar(NodoB<T> r, T b){
        if (r==null){
                return (false);
        }
        int compara=((Comparable)r.getValor()).compareTo(b);
        if(compara>0){
                return(buscar(r.getIzq(),b));
        }
        else{
            if(compara<0){
                    return(buscar(r.getDer(),b));
            }
            else{
                    return (true);
            }
        }
    }  
    
    /**
     * Metodo para guardar el recorrido que realiza la busqueda
     * @param b - Dato a buscar de tipo entero
     * @return Retorna iterator que contiene enteros
     */
    public Iterator<Integer> recBuscar(Integer b) {
        ArbolBB<Integer> miniArbol=new ArbolBB<>();
        miniArbol.insertar(b);
        NodoB<Integer> raiz1 = miniArbol.raiz;
        ListaS<T> l = new ListaS<>();
        recBuscar((NodoB<T>) raiz1, l);
        return (Iterator<Integer>) (l.iterator());
    }
    
    /**
     * Metodo para realizar la busqueda y recoger los valores del recorrido
     * @param r - Nodo raiz del arbol
     * @param l - Tipo Lista<> conteniendo iterator 
     */
    private void recBuscar(NodoB<T> r, ListaS<T> l) {
        NodoB<T> aux = raiz;
        try{
            while(aux.getValor()!= r){
                l.addFin(aux.getValor());
                int uno = Integer.parseInt(aux.getValor().toString());
                int dos = Integer.parseInt(r.getValor().toString());
                if(uno == dos){
                    aux=null;
                }else{
                    if(uno < dos){
                        aux = aux.getDer();
                    }
                    else{
                        aux = aux.getIzq();
                    }
                }
                if(aux==null){
                    aux = null;
                }
            }
        }catch(java.lang.NullPointerException e ){
            aux = null;
        }        
    }
} 

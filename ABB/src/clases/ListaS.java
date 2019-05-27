 package clases;
 import java.util.Iterator;

 /**
  * Clase que contiene las listas Simples
  * @author Joaquin
  * @param <T> 
  */
public class ListaS<T> implements Iterable<T>{
    private Nodo<T> cab;
    private int size;
    
    /**
     * Agrega el nodo para la lista simple
     * @param nodo - Nodo que se agregara
     */
    public void addInicio(T nodo){
        this.cab=new Nodo<>(nodo, this.cab);
        this.size++;        
    }
    
    /**
     * Agrega el nodo al final de la lista Simple
     * @param nodo - que se agrega
     */
    public void addFin(T nodo) {
        if(this.cab==null)
            this.addInicio(nodo);
        else {
            try {
                Nodo<T> ult=this.getPos(this.size-1);
                ult.setSig(new Nodo<>(nodo, null));
                this.size++;
            }catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    /**
     * Metodo para saber cual es el siguiente en la lista Simple y llenar las listas
     * @param i - valor entero para realizar for interno
     * @return Retorna un Nodo<> con el valor del siguiente
     * @throws Exception 
     */
    private Nodo<T> getPos(int i) throws Exception {
        if(this.esVacia() || i>this.size  || i<0)
            throw new Exception("El indice solicitado no existe en la Lista Simple");
        Nodo<T> t=this.cab;
        while(i>0) {
            t=t.getSig();
            i--;
        }
        return(t);
    }
    
    /**
     * metodo para conocer si la lista esta Vacia
     * @return 
     */
    public boolean esVacia() {
        return(this.cab==null);
    }
    
    /**
     * Agrega la lista a un iterator
     * @return retorna un iterator<>
     */
    @Override
    public Iterator<T> iterator() {
        return new IteratorLS<T>(this.cab);
    }
}
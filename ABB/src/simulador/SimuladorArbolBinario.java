package simulador;
import clases.ArbolBB;
import java.util.Iterator;
import javax.swing.JPanel;

/**
 * Clase para poder
 * insertar, borrar, recorrer busqueda, mostrar ordenes, ver si esta vacio
 * ingresar todo eso a un String para impresion en el jAreaText
 * @author Joaquin
 */
public class SimuladorArbolBinario {
    
    ArbolBB<Integer> miArbol=new ArbolBB<>();
   
    /**
     * Inserta el dato usando metodo creado en ArbolBB
     * @param dato - entero que es escaneado con el JOptionPane
     * @return un booleano para saber si se ejecuto bien o no
     */
    public boolean insertar(Integer dato){
        return (this.miArbol.insertar(dato));
    }  
    
    /**
     * Realiza la eliminacion de un nodo con el metodo creado en ArbolBB
     * @param dato - nodo que se desea eliminar
     * @return retorna el String de mensaje para el jAreaText
     */
    public String borrar(Integer dato){
        Integer x=this.miArbol.borrar(dato);
        if (x==null){
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: "+x.toString());
    }
    
    /**
     * Realiza el escaneo de los valores por donde hay que pasar para encontrar
     * el nodo buscado
     * @param dato - es el mismo noddo que se realiza en la busqueda
     * @return retorna el String con la ruta de los notos
     */
    public String recBuscar(Integer dato){
        Iterator<Integer> x=this.miArbol.recBuscar(dato);
        if (x==null){
            return ("No existe el dato en el arbol");
        }
        return (recorrido(x, "Recorrido De Busqueda:"));
    }
    
    /**
     * Realiza el recorrido del arbol en la forma de Raiz-izq-der
     * @return devuelve un String con el preOrden
     */
    public String preOrden(){
        Iterator<Integer> it=this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden:"));
    } 
    
    /**
     * Realiza el recorrido del arbol en la forma de Izq-Raiz-der
     * @return devuelve un String con el inOrden
     */
    public String inOrden(){
        Iterator<Integer> it=this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden:"));
    }
    
    /**
     * Realiza el recorrido del arbol en la forma de Izq-der-Raiz
     * @return devuelve un String con el posOrden
     */
    public String posOrden(){
        Iterator<Integer> it=this.miArbol.posOrden();
        return (recorrido(it, "Recorrido PosOrden:"));
    }
    
    /**
     * Metodo para poder ver si esta el nodo
     * @param dato - nodo a buscar
     * @return un String con un mensaje que si o no esta el nodo
     */
    public String esta(Integer dato){
        boolean siEsta=this.miArbol.buscar(dato);
        String r="";
        r+=siEsta?"Si":"No";
        return (r);
    }
    
    /**
     * Metodo para ver si el arbol esta vacio
     * @return retorna un String con la palabra lleno cuando esta con nodos 
     * y con la palabra Vacio si el arbol no tiene nodos
     */
    public String vacio(){
        boolean vacio=this.miArbol.esVacio();
        String s="";
        if(vacio == false){
            s="Lleno";
        }
        else{
            s="Vacio";
        }
        return s;
    }
    
    /**
     * Metodo para obtener la altura del arbol ingresado
     * @return un entero con el valor de la altura del arbol
     */
    public int altura(){
        return(this.miArbol.retornarAltura());
    }
    
    /**
     * Metodo para guardar el recorrido con de forma vertical
     * @param it - iterator que contiene los valores del arbol
     * @param msg - mensaje antes de mostrar lo que contiene el Iterator
     * @return retorna un String para la facil impresion en el JAreaText
     */
    private String recorrido(Iterator<Integer> it, String msg){
    String r=msg+"\n";
    while(it.hasNext())
        r+="\t"+it.next().toString()+"\n";
    return(r);
    }
    public JPanel getDibujo() {
        return this.miArbol.getDibujo();                
    } 
}

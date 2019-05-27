package clases;

import java.util.Iterator;
import javax.swing.JPanel;

public class ArbolB<T> {
    protected NodoB<T> raiz;
    protected int alt;
    public ArbolB(NodoB<T> raiz) {
        this.raiz = raiz;
    }
    public ArbolB() {
        this.raiz = null;
    }
    public NodoB<T> getRaiz() {
        return this.raiz;
    }
    public void setRaiz(NodoB<T> r) {
        this.raiz = r;
    }
    public Iterator<T> preOrden() {
        ListaS<T> l = new ListaS<>();
        preOrden(this.getRaiz(), l);
        return (l.iterator());
    }
    private void preOrden(NodoB<T> r, ListaS<T> l) {
        if (r != null) {
            l.addFin(r.getValor());
            preOrden(r.getIzq(), l);
            preOrden(r.getDer(), l);
        }
    }
    public Iterator<T> inOrden() {
        ListaS<T> l = new ListaS<>();
        inOrden(this.getRaiz(), l);
        return (l.iterator());
    }
    private void inOrden(NodoB<T> r, ListaS<T> l) {
        if (r != null) {
            inOrden(r.getIzq(), l);
            l.addFin(r.getValor());
            inOrden(r.getDer(), l);
        }
    }
    public Iterator<T> posOrden() {
        ListaS<T> l = new ListaS<>();
        posOrden(this.getRaiz(), l);
        return (l.iterator());
    }
    private void posOrden(NodoB<T> r, ListaS<T> l) {
        if (r != null) {
            posOrden(r.getIzq(), l);
            posOrden(r.getDer(), l);
            l.addFin(r.getValor());
        }
    }
    public boolean esVacio() {
        return (this.raiz == null);
    }
    public boolean esta(T info) {
        return (esta(this.raiz, info));
    }
    private boolean esta(NodoB<T> r, T info) {
        if (r == null) {
            return (false);
        }
        if (r.getValor().equals(info)) {
            return (true);
        }
        return (esta(r.getIzq(), info) || esta(r.getDer(), info));
    }
    public JPanel getDibujo() {
        return new ArbolExpresionGrafico(this);
    }
    public int retornarAltura(){
        alt = 0;
        retornarAltura(this.raiz,1);
        return alt;
    }
    private void retornarAltura(NodoB<T> nodo, int nivel){
            if (nodo != null) {
            retornarAltura(nodo.getIzq(), nivel + 1);
            if (nivel > alt) {
                alt = nivel;
            }
            retornarAltura(nodo.getDer(), nivel + 1);
        } 
    }
}

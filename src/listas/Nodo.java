package listas;

public class Nodo {
    public String contenido;

    public Nodo siguiente;

    public Nodo(String contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }
    public Nodo(String contenido, Nodo siguiente) {
        this.contenido = contenido;
        this.siguiente = siguiente;
    }
}

package examen2.ejercicio1;

public class Nodo {
    public String contenido;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(String contenido) {
        this.contenido = contenido;
        this.siguiente = null;
        this.anterior = null;
    }
}

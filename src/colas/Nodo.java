package colas;

public class Nodo {
    public Estudiante contenido;
    public Nodo siguiente;

    public Nodo(Estudiante contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }
}

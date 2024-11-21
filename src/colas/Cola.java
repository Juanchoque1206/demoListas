package colas;

public class Cola {
    private Nodo inicio;
    private Nodo finnal;

    public void insertar(Estudiante estudiante) {
        if (inicio == null) { //vacio
            Nodo nodo = new Nodo(estudiante);
            inicio = nodo;
            finnal = nodo;
        } else {//no esta vacio
            Nodo nodo = new Nodo(estudiante);

            Nodo nodoActual = inicio;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }

            nodoActual.siguiente = nodo;
            finnal = nodo;
        }
    }

    public void eliminar() {
        if (inicio != null) {
            if (inicio.siguiente == null) {
                finnal = null;
                inicio = null;
            } else {
                inicio = inicio.siguiente;
            }
        }
    }

    public void mostrar() {
        Nodo nodoActual = inicio;
        System.out.println(">>" + nodoActual.contenido.getNombre());
        while (nodoActual.siguiente != null) {
            nodoActual = nodoActual.siguiente;
            System.out.println(">>" + nodoActual.contenido.getNombre());
        }
    }
}

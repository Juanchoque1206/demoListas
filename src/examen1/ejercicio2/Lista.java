package examen1.ejercicio2;

public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public void insertar(int contenido) {
        Nodo nodo = new Nodo(contenido);
        if (inicio == null) {
            inicio = nodo;
            fin = nodo;
        } else {
            nodo.anterior = fin;
            fin.siguiente = nodo;
            fin = nodo;
        }
    }
    public void eliminar(int posicion) {
        if (inicio != null) {
            Nodo auxNodo = inicio;
            int auxPosicion = 0;
            while (auxNodo.siguiente != null && posicion != auxPosicion) {
                auxNodo = auxNodo.siguiente;
                auxPosicion++;
            }

            if (inicio.siguiente == null) {
                inicio = null;
                fin = null;
            } else {
                if (auxNodo.siguiente == null) {
                    auxNodo.anterior.siguiente = null;
                    fin = auxNodo.anterior;

                    auxNodo.anterior = null;

                } else {
                    Nodo finAux = fin.anterior;

                    auxNodo.anterior.siguiente = fin;
                    fin.anterior = auxNodo.anterior;

                    fin.siguiente = auxNodo.siguiente;
                    auxNodo.siguiente.anterior = fin;

                    fin = finAux;
                }
            }
        }
    }
}

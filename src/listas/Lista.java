package listas;

public class Lista {
    private Nodo inicio;

    public void insertInicio(String contenido) {
        if (inicio == null) {
            inicio = new Nodo(contenido);
        } else {
            Nodo nodo = new Nodo(contenido);
            nodo.siguiente = inicio;
            inicio = nodo;
        }
    }

    public void insertFinal(String contenido) {
        if (inicio == null) {
            inicio = new Nodo(contenido);
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            Nodo nodo = new Nodo(contenido);
            nodoActual.siguiente = nodo;
        }
    }


    public void insertPosicion(int posicion, String contenido) {
        if (posicion < 0) {
            posicion = 0;
        }

        if (inicio == null) {
            inicio = new Nodo(contenido);
        } else {
            Nodo nodoActual = inicio;
            Nodo nodoAnterior = null;
            int contador = 0;
            while (nodoActual.siguiente != null && posicion != contador) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.siguiente;
                contador++;
            }

            Nodo nodo = new Nodo(contenido);

            if (nodoAnterior == null) {
                nodo.siguiente = inicio;
                inicio = nodo;
            } else {
                nodoAnterior.siguiente = nodo;
                nodo.siguiente = nodoActual;
            }
        }
    }

    public void modificar(int posicion, String contenido) {
        if (posicion < 0) {
            posicion = 0;
        }

        if (inicio == null) {
            inicio = new Nodo(contenido);
        } else {
            Nodo nodoActual = inicio;
            Nodo nodoAnterior = null;
            int contador = 0;
            while (nodoActual.siguiente != null && posicion != contador) {
                nodoAnterior = nodoActual;
                nodoActual = nodoActual.siguiente;
                contador++;
            }

            Nodo nodo = new Nodo(contenido);

            if (nodoAnterior == null) {
                nodo.siguiente = nodoActual.siguiente;
                inicio = nodo;
            } else {
                nodo.siguiente = nodoActual.siguiente;
                nodoAnterior.siguiente = nodo;
            }
        }
    }

    public void eliminar(int posicion) {
        Nodo nodoActual = inicio;
        Nodo nodoAnterior = null;
        int contador = 0;
        while (nodoActual.siguiente != null && posicion != contador) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
            contador++;
        }

        if (nodoAnterior == null) {
            inicio = nodoActual.siguiente;
        } else {
            nodoAnterior.siguiente = nodoActual.siguiente;
        }
    }


    public void mostrar() {
        Nodo nodoActual = inicio;
        System.out.print(">>" + nodoActual.contenido + " ");
        while (nodoActual.siguiente != null) {
            nodoActual = nodoActual.siguiente;
            System.out.print(">>" + nodoActual.contenido + " ");
        }
    }
}

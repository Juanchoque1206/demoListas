package examen1.ejercicio3;

public class Arbol {
    private Nodo raiz;

    void insertar(int contenido) {
        this.raiz = insertarRec(this.raiz, contenido);
    }
    private Nodo insertarRec(Nodo nodoRaiz, int contenido) {
        if (nodoRaiz == null) {
            nodoRaiz = new Nodo(contenido);
            return nodoRaiz;
        }
        if (contenido < nodoRaiz.contenido) {
            nodoRaiz.izquierda = insertarRec(nodoRaiz.izquierda, contenido);
        } else if (contenido > nodoRaiz.contenido) {
            nodoRaiz.derecha = insertarRec(nodoRaiz.derecha, contenido);
        }
        return nodoRaiz;
    }


    void insertar(int contenido, String ubicacion) {
        this.raiz = insertarRec(this.raiz, contenido);
    }
    private Nodo insertarRec(Nodo nodoRaiz, int contenido, String ubicacion) {
        if (nodoRaiz == null) {
            nodoRaiz = new Nodo(contenido);
            return nodoRaiz;
        }
        if (ubicacion.equals("izquierda")) {
            nodoRaiz.izquierda = insertarRec(nodoRaiz.izquierda, contenido, ubicacion);
        } else if (ubicacion.equals("derecha")) {
            nodoRaiz.derecha = insertarRec(nodoRaiz.derecha, contenido, ubicacion);
        }
        return nodoRaiz;
    }

    void mostrar() {
        mostrarRec(this.raiz);
    }
    void mostrarRec(Nodo nodoRaiz) {
        if (nodoRaiz != null) {
            mostrarRec(nodoRaiz.izquierda);
            System.out.print(nodoRaiz.contenido + " ");
            mostrarRec(nodoRaiz.derecha);
        }
    }

    //examen
    public void trazaEjecucion(int valor) {
        if (valor >= 2) {
            insertar(valor - 1,"derecha");
            if (valor - 2 >= 2) {
                insertar(valor - 2, "izquierda");
            }

            trazaEjecucion(valor - 1);
        }
    }

}
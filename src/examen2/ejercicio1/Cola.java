package examen2.ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cola {
    private Nodo inicio;
    private Nodo fin;

    private int tam;

    public void invertir() {
        if (this.inicio != null && this.inicio.siguiente != null) {
            Nodo auxInicio = this.inicio;
            Nodo auxFin = this.fin;

            String auxContenido = auxInicio.contenido;
            auxInicio.contenido = auxFin.contenido;
            auxFin.contenido = auxContenido;

            while (auxInicio.siguiente != null &&
                    auxInicio != auxFin &&
                    auxInicio.siguiente != auxFin) {
                auxInicio = auxInicio.siguiente;
                auxFin = auxFin.anterior;

                auxContenido = auxInicio.contenido;
                auxInicio.contenido = auxFin.contenido;
                auxFin.contenido = auxContenido;
            }
        }
    }

    public void insert(String contenido) {
        Nodo nodo = new Nodo(contenido);
        if (this.inicio == null) {
            this.inicio = nodo;
            this.fin = nodo;
        } else {
            this.fin.siguiente = nodo;
            nodo.anterior = this.fin;
            this.fin = nodo;
        }
        this.tam++;
    }

    public void mostrar() {
        if (this.inicio != null) {
            Nodo nodoActual = this.inicio;
            System.out.println("=====>>" + nodoActual.contenido);
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
                System.out.println("=====>>" + nodoActual.contenido);

            }
        }
    }
}

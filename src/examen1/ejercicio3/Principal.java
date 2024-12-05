package examen1.ejercicio3;

public class Principal {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        // Inserting elements
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Printing inorder traversal
        arbol.mostrar();

        /*arbol.insertar(4);
        arbol.trazaEjecucion(4);

        arbol.mostrar();*/
    }

}

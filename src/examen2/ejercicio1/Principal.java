package examen2.ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.insert("hola");
        cola.insert("mundo");
        cola.insert("de nuevo");
        cola.insert("dede marte");

        cola.mostrar();

        cola.invertir();

        cola.mostrar();
    }
}

package listas;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertFinal("uno");
        lista.insertFinal("dos");
        lista.insertFinal("tres");
        lista.insertFinal("cuatro");

        lista.eliminar(3);

        lista.mostrar();
    }
}

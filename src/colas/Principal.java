package colas;

public class Principal {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Estudiante estudiante = new Estudiante();
        estudiante.setCi("1");
        estudiante.setNombre("Gabriel");

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setCi("2");
        estudiante1.setNombre("Fernando");

        cola.insertar(estudiante);
        cola.insertar(estudiante1);
        cola.eliminar();



        cola.mostrar();
    }
}

package examen3;

public class Ejercicio1 {
    public double suma(double total, double denominador, int incremento, int n) {
        if (n < 1) {
            return total;
        }

        if (incremento > 1) {
            denominador = denominador + incremento;
        }
        total += (1/denominador);

        return suma(total, denominador, ++incremento, --n);
    }

    public void suma0(double n) {
        double result = suma(0, 1,  1, 3);
        System.out.println("=============<<<>>>>" + result);
    }
}

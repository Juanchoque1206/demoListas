package practica.ejercicio1;

public class Ejercicios1 {
    public int[] solve(Arbol<Integer> arbol) {
        return new int []{};
    }

    public void test(int n) {
        if (n > 0) {
            System.out.println(n);
            test(n-1);
            test(n-1);
        }
    }

    public static void main(String[] args) {
        Ejercicios1 ejercicio1 = new Ejercicios1();
        ejercicio1.test(4);
    }

}

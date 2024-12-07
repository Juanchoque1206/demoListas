package practica;

public class Ejercicio5 {
    public int[] rachaExitosa(int[] ar) {
        int []res = new int[ar.length];
        for (int i = 0;i < ar.length;i++) {
            int n = ar[i];
            int racha = 0;
            for (int j = i;j >= 0;j--) {
                if (n >= ar[j]) {
                    racha = racha + 1;
                } else {
                    break;
                }
            }
            res[i] = racha;
        }
        return res;
    }

    public void mostrar(int res[]) {
        for (int i = 0;i < res.length;i++) {
            System.out.print(" " + res[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();

        int ar[] = {100,80,60,70,60,75,85};

        int res[] = ejercicio5.rachaExitosa(ar);

        //mostrar
        ejercicio5.mostrar(res);
    }
}

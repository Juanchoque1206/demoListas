package practica;

import examen3.Ejercicio1;

public class Ejercicio2 {
    public int eliminacionDePalabras(int n, String[] palabras) {
        //eliminacion iguales
        int aux = 0;
        for (int i = 0;i < n - 1;i++) {
            if (palabras[i].equals(palabras[i+1])) {
                palabras[i] = "";
                palabras[i + 1] = "";
                aux += 2;
                i += 2;
            }
        }

        if (aux > 0) {
            String[] auxPalabras = new String[n - aux];
            int aux1 = 0;
            for (int i = 0;i < n;i++) {
                if (!palabras[i].isEmpty()) {
                    auxPalabras[aux1++] = palabras[i];
                }
            }
            return eliminacionDePalabras(auxPalabras.length, auxPalabras);
        }

        return palabras.length;
    }

    public static void main(String[] args) {
        //String [] palabras = {"ab", "aa", "aa", "bc", "ab"};
        String [] palabras = {"tom", "jerry", "jerry", "tom"};

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int res = ejercicio2.eliminacionDePalabras(4, palabras);

        System.out.println("=====>"+ res);
    }


}

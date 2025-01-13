package algorithms;

public class BigO {


    public void foo(int[] array) {

        // La complejidad algorítmica de esta porción de código es O(n). La complejidad algorítmica de esta porción de código es (O(n)). 
        // Esto se debe a que el bucle `for` itera una vez sobre cada elemento del array, realizando operaciones de tiempo constante en cada iteración.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        // La complejidad algorítmica de esta porción de código vuelve a ser O(n). La complejidad algorítmica de esta porción de código es (O(n)). 
        // Esto se debe, como en el caso anterior, a que el bucle `for` itera una vez sobre cada elemento del array, realizando operaciones de tiempo constante en cada iteración.
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        // La complejidad algorítmica total de esta función de código es O(2n) que podemos sinplificar a O(n).

    }

    public void bar(int[] array1, int[] array2) {

        // Estamos tentados a pensar que la complejidad es O(n²) al ser bucles anidados pero debemos ver que son dos bucles que afectan a dos arrays distintos
        // Entonces si nos fijamos bien, la complejidad es O(n) (en relación al primer bucle sobre el primer array) y O(n) (en relación al primer bucle sobre al segundo array)
        // Para que quede más claro se suene poner así: O(n) * O(m) = O(n*m)
        for (int i = 0; i < array1.length; i++) {
             if (array1[i] % 2 == 0) {
                System.out.println(array[i]);
            }
            for (int j = 0; j < array2.length; j++) {
                 if (array2[j] % 2 == 0) {
                System.out.println(array[i]);
            }
            }
        }

    }O(n)

    public void baz(int[] array) {

        
        // Si seguimos analizando por aquí vemos que los bucles están sobre el mismo array
        // entonces la complejidad es claramente O(n²)
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
            for (int j = 0; j < array.length; j++) {
               if (array[j] % 2 == 0) {
                System.out.println(array[i]);
            }
                // Si empezamos a analizar por aquí: esta comparación del array i, j
                // ocupan un espacio constante en memoria por tanto su O(1).
                if (array[i] < array[j]) {
                   System.out.println(array[i]);
                   System.out.println(array[j]);
                }
            }
        }

    }

    public void beep(int[] array) {

        // Los bucles operan sobre el mismo array
        // por tanto, la complejidad es (O²)
        for (int i = 0; i < array.length; i++) {
            // ...
            for (int j = 0; j < array.length; j++) {
                // ...
                for (int k = 0; k < 9999999; k++) {
                    // Esto se repite casi diez mil veces pero es constante (ocupan el mismo espacio en memoria)
                    //son los bucles superiores ya tienen una compejidad cuadrática.
                }
            }
        }

    }

}

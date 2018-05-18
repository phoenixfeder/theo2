package de.dhbwka.java.sort;

import com.sun.istack.internal.NotNull;

/**
 * BubbleSort Algorithmus
 */
public class BubbleSort {
    public static void sort(@NotNull int[] array) {

        boolean wasSwitched;

        do {
            wasSwitched = false;

            // ... Gehe einmal durch das gesamte Array ...

            for (int index = 0; index <= array.length - 2; index++) {
                if (array[index] > array[index + 1]) {
                    // ... und tausche mit dem nächsten Element, falls nötig ...
                    int temp = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = temp;
                    // ... und merke, dass ein Tausch stattgefunden hat ...
                    wasSwitched = true;
                }
            }
            // ... und wiederhole dann, wenn ein Tausch stattgefunden hat
        } while (wasSwitched);
    }
}

package de.dhbwka.java.sort;

import com.sun.istack.internal.NotNull;

/**
 * Selectionsort Algorithmus
 */
public class SelectionSort {

    public static void sort(@NotNull int[] array) {

        // Für jeden Eintrag im Array ...
        for (int pointer = 0; pointer < array.length; pointer++) {
            int minIndex = pointer;

            // ... den kleinsten Wert finden ...
            for (int compareIndex = pointer + 1; compareIndex < array.length; compareIndex++) {
                if (array[compareIndex] < array[minIndex]) {
                    minIndex = compareIndex;
                }
            }

            // ... und den kleinsten Fund mit dem Eintrag vertauschen
            int temp = array[minIndex];
            array[minIndex] = array[pointer];
            array[pointer] = temp;
            //ConsolePrint.printArray("Step", array);
        }
    }
}

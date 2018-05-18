package de.dhbwka.java.sort;

import com.sun.istack.internal.NotNull;
import de.dhbwka.java.sort.helper.ConsolePrint;

/**
 * QuickSort Algorithmus
 */
public class QuickSort {

    public static void sort(@NotNull int[] array) {

        // Starte die Rekursives QuickSort zwischen Index 0 und letzter
        recursiveQuickSort(array, 0, array.length - 1, "");
    }

    private static void recursiveQuickSort(int[] array, int left, int right, String s) {
        if (left < right) {
            int i = jesus(array, left, right);
            System.out.println(s+"Pivot: " + i);
            ConsolePrint.printArray(s+"Enter", array);
            recursiveQuickSort(array, left, i - 1, s+" ");
            recursiveQuickSort(array, i + 1, right, s+" ");
            ConsolePrint.printArray(s+"Exit", array);
        }
    }

    private static int jesus(int[] array, int left, int right) {
        int temp;
        int pivot = array[right];
        int indexLeft = left;
        int indexRight = right-1;
        while(indexLeft<=indexRight) {
            if (array[indexLeft] > pivot) {
                // tausche x[i] und x[j]
                temp = array[indexLeft];
                array[indexLeft] = array[indexRight];
                array[indexRight] = temp;
                indexRight--;
            } else indexLeft++;
        }
        // tausche x[i] und x[rechts]
        temp = array[indexLeft];
        array[indexLeft] = array[right];
        array[right] = temp;

        return indexLeft;
    }
}

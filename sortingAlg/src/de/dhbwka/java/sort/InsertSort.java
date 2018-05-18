package de.dhbwka.java.sort;

import com.sun.istack.internal.NotNull;

/**
 * InsertSort Algorithmus
 */
public class InsertSort {
    public static void sort(@NotNull int[] array) {

        int temp;

        // Für jeden Eintrag im Array (außer der erste) ...
        for (int index = 1; index < array.length; index++) {
            // ... merke den Wert ...
            temp = array[index];
            int j = index;
            // ... und rücke jeden Wert links davon, der größer ist, um ein Feld nach rechts ...
            // ... (das Feld des gemerkten Wertes wird dabei überschrieben) ...
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            // ... und setze den gemerkten Wert an die Stelle, an der kein Wert mehr nach rechts gerückt wird
            array[j] = temp;
        }
    }
}
package de.dhbwka.java.sort.helper;

/**
 * Helperklasse für die Ausgabe eines Arrays
 */
public class ConsolePrint {

    /**
     * Gibt ein array im Format aus: #STRING#: [ 1, 2, 3, ... ]
     *
     * @param predicate #STRING#
     * @param array     Array
     */
    public static void printArray(String predicate, int[] array) {

        System.out.print(predicate + ": [ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + " ]\n");
    }
}

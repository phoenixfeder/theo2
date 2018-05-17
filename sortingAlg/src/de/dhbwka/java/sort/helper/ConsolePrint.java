package de.dhbwka.java.sort.helper;

public class ConsolePrint {
    public static void printArray(String predicate, int[] array) {

        System.out.print(predicate + ": [ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + " ]\n");
    }
}

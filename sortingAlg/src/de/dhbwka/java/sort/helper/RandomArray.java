package de.dhbwka.java.sort.helper;

import java.util.Random;

/**
 * Helperklasse für das erstellen eines Arrays mit zufälligen int-Werten
 */
public class RandomArray {

    /**
     * Erstellt ein Array der Länge length mit zufälligen int-Werten mit dem Zufalls-Seed seed
     *
     * @param length Array-Länge
     * @param seed   Random-Seed
     * @return Das erstellte Array
     */
    public static int[] getRandomArray(int length, int seed) {
        int[] randomArray = new int[length];
        Random rnd = new Random(seed);
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rnd.nextInt(100);
        }
        return randomArray;
    }
}

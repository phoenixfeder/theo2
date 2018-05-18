package de.dhbwka.java.sort;

import de.dhbwka.java.sort.helper.ConsolePrint;
import de.dhbwka.java.sort.helper.RandomArray;

public class Main {

    private static void sort(int[] list){
        // SelectionSort.sort(list);
        // BubbleSort.sort(list);
        InsertSort.sort(list);
    }

    public static void main(String[] args) {


        int[] list = RandomArray.getRandomArray(10, 1337);

        ConsolePrint.printArray("Vorher", list);
        long start = System.nanoTime();
        sort(list);
        long duration = System.nanoTime() - start;
        ConsolePrint.printArray("Nacher", list);
        System.out.printf("Algorithmus hat %.3fms gebraucht.", duration/1000000f);
    }
}
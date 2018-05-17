package de.dhbwka.java.sort;

import de.dhbwka.java.sort.helper.ConsolePrint;
import de.dhbwka.java.sort.helper.RandomArray;

public class Main {
    public static void main(String[] args) {

        int[] list = RandomArray.getRandomArray(10, 1337);

        ConsolePrint.printArray("Vorher", list);
        list = SelectionSort.selectionSort(list);
        ConsolePrint.printArray("Nacher", list);
    }
}

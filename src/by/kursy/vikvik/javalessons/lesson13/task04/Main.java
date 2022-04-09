package by.kursy.vikvik.javalessons.lesson13.task04;

import by.kursy.vikvik.javalessons.lesson13.util.ArrayInitializer;
import by.kursy.vikvik.javalessons.lesson13.util.Convertor;
import by.kursy.vikvik.javalessons.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        ArrayInitializer.randomInit(array, -10, 10);

        Arrays.sort(array);

        Printer.print("Input value for searching: ");
        int value = scanner.nextInt();

        boolean result = BinarySearching.checkValue(array, value);

        Printer.print("\nArray: " + Convertor.convertFromArrayToString(array));
        String msg = result ? "Yes" : "No";
        Printer.print("\nResult: " + msg);
    }
}

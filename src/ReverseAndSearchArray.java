import java.util.Scanner;
import java.util.Arrays;

public class ReverseAndSearchArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers do you want to enter? ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("#" + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        System.out.println("\nARRAYS:");
        System.out.println("Original array: " + Arrays.toString(originalArray));

        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        System.out.print("\nEnter a number to search in the array: ");
        int searchNumber = scanner.nextInt();

        System.out.println("Original array search:");
        searchArray(originalArray, searchNumber);
        System.out.println("\nReversed array search:");
        searchArray(reversedArray, searchNumber);

        scanner.close();
    }

    private static int[] reverseArray(int[] original) {
        int[] reversed = new int[original.length];
        int index = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reversed[index] = original[i];
            index++;
        }
        return reversed;
    }

    private static void searchArray(int[] array, int target) {
        int count = 0;
        for (int number : array) {
            if (number == target) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("The number " + target + " wasnt found in the array");
            return;
        }

        int[] indices = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices[index] = i;
                index++;
            }
        }

        System.out.print("The number " + target + " was found at: " + Arrays.toString(indices));
    }
}
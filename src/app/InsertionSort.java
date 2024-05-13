package app;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.net.BindException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class InsertionSort {
    public static void main(String arg[]) {
        Scanner console = new Scanner(System.in);
        int length = 15;
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("Initial array: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                {
                    j--;
                    numbers[j + 1] = key;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Enter a number to search for: ");
        int numbersNew = console.nextInt();
        System.out.println("Enter a number to search for: " + numbersNew);

        int min = 0;
        int max = numbers.length - 1;
        int index = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (numbers[mid] < numbersNew) {
                min = mid + 1;
            } else if (numbers[mid] > numbersNew) {
                max = mid - 1;
            } else if (numbers[mid] == numbersNew) {
                index = mid;
                break;
            }
        }
        if (index >= 0) {
            System.out.println(String.valueOf(index));
        } else {
            System.out.println("Not found");
        }
    }
}


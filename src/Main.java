import java.util.Arrays;

public class Main {
    public static int[] numbers = {14, 16, 19, 32, 32, 32, 56, 69, 72};
    public static int bookSize = 72;

    public static int left = 0;

    public static void main(String[] args) {
        getBiggerBooksQuantity(numbers, bookSize);
    }

    public static void getBiggerBooksQuantity(int[] arr, int newBookSize) {
        int right = arr.length;

        while (left < right && right > 0) {
            int middle = left + (right - left) / 2;
            if (middle < 1) {
                System.out.println("Количество больших чисел в массиве: " + Integer.toString(arr.length));
                break;
            }

            if (middle + 1 >= arr.length) {
                System.out.println("Количество больших чисел в массиве: 0");
                break;
            }

            int middleEl = arr[middle];

            if (newBookSize >= middleEl) {
                if (newBookSize < arr[middle + 1]) {
                    System.out.println("Количество больших чисел в массиве: " + Integer.toString(arr.length - middle - 1));
                    break;
                } else {
                    left = middle;
                }
            } else if (newBookSize >= arr[middle - 1]){
                System.out.println("Количество больших чисел в массиве: " + Integer.toString(numbers.length - middle));
                break;
            } else {
                right = middle;
            }
        }

    }
}
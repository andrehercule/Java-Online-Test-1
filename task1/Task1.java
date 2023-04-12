package task1;


import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[30];
        System.out.println("Всего чисел: " + Arrays.toString(fillArray(array)));
        System.out.println();
        System.out.println("Количество уникальных чисел: " + differentElements(array));
    }

    public static int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int differentElements(int[] element) {
        int numbers = 0;
        for (int i = 0; i < element.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (element[j] == element[i]) {
                    count++;
                    System.out.println("Повторяющиеся число: " + element[j]);
                }
            }
            if (count == 0) {
                numbers++;
            }
        }
        return numbers;
    }
}

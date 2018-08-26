import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // принимает размер массива
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];

        //принимает массив чисел
        System.out.print("Inserted array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        // найти минимальное число в массиве и вывести в консоль (без использования сортировки)
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        // найти максимальное число в массиве и вывести в консоль
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        // посчитать кол-во повторений числа 5 и вывести в консоль
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                counter += 1;
            }
        }
        System.out.println("Counter: " + counter);

        // вывести в консоль отсортированный массив
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
        // Вывод сортировки используя sort bubble
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        // Задание 2 (дополнительное)
        // вывести в консоль максимальное кол-во повторений чисел (пример 1)
        int maxCount1 = 0;
        int counter1 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    maxCount1 = array[i];
                    counter1++;
                }
        }
            System.out.println("Ответ: " + counter1 +". " + "Так как число " + maxCount1 + " " + "повторяется " + counter1 + " раза");
            counter1 = 0;
            break;
        }
    }
}




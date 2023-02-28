import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};
        String[] arr2 = new String[]{"Зависть", "Гнев", "Чревоугодие", "Жадность"};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[]{1, 2, 3};
        float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};
        String[] arr2 = new String[]{"Зависть", "Гнев", "Чревоугодие", "Жадность"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] arr = new int[]{1, 2, 3};
        float[] arr1 = new float[]{1.57f, 7.654f, 9.986f};
        String[] arr2 = new String[]{"Зависть", "Гнев", "Чревоугодие", "Жадность"};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] arr = new int[]{1, 2, 3,};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + 1 + " ");
                continue;
            }
            System.out.print(arr[i] + " ");
        }
      /*       if (arr[i] % 2 != 0) { //код в уроке, но мой мне нравится больше, так как не выводит квадратные скобки в консоль))
                arr[i] += 1;
            }
        System.out.print(Arrays.toString(arr));
  }  */

    }
}
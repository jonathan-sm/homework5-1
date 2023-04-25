import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы урок-1 ");
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("задача 1");
        int[] bigBox = new int[]{1, 2, 3};
        bigBox[0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(bigBox[i]);

        }
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        fractionalNumbers[0] = 1.57;
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.println(fractionalNumbers[i]);

        }
        int[] random = {1, 7, 9};
        random[0] = 1;
        random[1] = 7;
        random[2] = 9;
        System.out.println(random[0]);
        System.out.println(random[1]);
        System.out.println(random[2]);
    }

    public static void task2() {
        System.out.println("задача 2");
        int[] bigBox = new int[3];
        bigBox[0] = 1;
        bigBox[1] = 2;
        bigBox[2] = 3;
        for (int index = 0; index < bigBox.length; index++) {
            if (index == bigBox.length - 1) {
                System.out.println(bigBox[index]);
                break;
            }

            System.out.print(bigBox[index] + ", ");
        }
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        fractionalNumbers[0] = 1.57;
        for (int index = 0; index < fractionalNumbers.length; index++) {
            if (index == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[index]);
                break;
            }
            System.out.print(fractionalNumbers[index] + ", ");
        }
        int[] random = {1, 7, 9};
        random[0] = 1;
        random[1] = 7;
        random[2] = 9;
        for (int index = 0; index < random.length; index++) {
            if (index == random.length - 1) {
                System.out.println(random[index]);
                break;
            }
            System.out.print(random[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("задача 3");
        int[] bigBox = new int[3];
        bigBox[0] = 1;
        bigBox[1] = 2;
        bigBox[2] = 3;
        for (int index = bigBox.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(bigBox[index]);
                break;
            }

            System.out.print(bigBox[index] + ", ");
        }
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        fractionalNumbers[0] = 1.57;
        for (int index = fractionalNumbers.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(fractionalNumbers[index]);
                break;
            }
            System.out.print(fractionalNumbers[index] + ", ");
        }
        int[] random = {1, 7, 9};
        random[0] = 1;
        random[1] = 7;
        random[2] = 9;
        for (int index = random.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(random[index]);
                break;
            }
            System.out.print(random[index] + ", ");
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int [] arr = {1, 2, 3};
        for (int i = 0;i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] +1;
                System.out.println(Arrays.toString(arr));

            }

        }
    }
}
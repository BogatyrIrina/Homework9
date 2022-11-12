public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        System.out.println("Задание 2");

        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j >= max) {
                max = j;
            } else if (j<min) {
                min = j;
            }
        }
        System.out.println(min);
        System.out.println(max);

        //Задание 3
        System.out.println("Задание 3");

        double middle = 0;
        for (int j : arr) {
            middle += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + middle / arr.length + " рублей");

        //Задание 4
        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i>= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i!=0) {
                System.out.print("");
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
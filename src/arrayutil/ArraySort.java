package arrayutil;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int  x = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=x;

                }


            }

            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int  x = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=x;

                }


            }

            System.out.print(numbers[i] + " ");
        }
    }
}

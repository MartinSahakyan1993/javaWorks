package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        System.out.print("Զանգված - ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Ամենամեծ թիվը - ");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);


        System.out.print("Ամենափոքր թիվը - ");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }System.out.println(min + " ");

        System.out.print("Զույգ թվեր - ");
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                y++;
            }
        }
        System.out.println();
        System.out.print("Կենտ թվեր - ");
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                k++;
            }
        }

        System.out.println();
        System.out.println("Զույգ թվերի քանակը - " + y);
        System.out.println("կենտ թվերի քանակը - " + k);

        double sum = 0;
        int summer = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            summer = summer + array[i];
        }

        System.out.println("միջին թվաբանական - " + sum / array.length);
        System.out.println("բոլոր էլեմենտների գումարը/էլեմենտների քանակի վրա - " + array.length + " : " + summer);
    }
}

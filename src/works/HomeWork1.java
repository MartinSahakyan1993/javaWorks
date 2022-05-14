package works;

public class HomeWork1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (j = 6; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }

}

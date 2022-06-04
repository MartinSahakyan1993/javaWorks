package arrayutil1;

public class ArrSort {
    int max(int[] array) {
        int maxval = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxval < array[i]) {
                maxval = array[i];

            }
        }
        return maxval;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        return min;
    }


    void array(int[] ar) {
        System.out.print("bolor elementnery  - ");
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    void arrays(int[] arr) {
        int z = 0;
        System.out.print("zuyger -");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 1) {
                z++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print("\n" + "zuygeri qanak - " + z);
    }

    void arrays1(int[] arr1) {
        int k = 0;
        System.out.print("kenter -");
        for (int i : arr1) {
            if (i % 2 != 0) {
                k++;
                System.out.print(i + " ");

            }
        }
        System.out.print("\n" + "kenteri qanak -" + k);

    }

    double mijin(double[] tver) {
        double d = 0;
        for (int i = 0; i < tver.length; i++) {

            d = d + tver[i];
        }
        return d / tver.length;
    }

    int gumar(int[] element) {
        int t = 0;
        for (int i = 0; i < element.length; i++) {
            t = t + element[i];
        }
        return t;
    }

    void text(char[] barev) {
        for (int i = 0; i < barev.length; i++) {
            if (barev[i] != ' ') {
                System.out.print(barev[i]);
            }

        }

    }

    boolean bobArray(char[] bob) {
        boolean x = false;
        for (int i = 0; i < bob.length - 1; i++) {
            if (bob[i] == 'b' && bob[i + 2] == 'b') {
                x = true;

            }
        }
        return x;

    }

    boolean chars3(char[] ly) {
        boolean j = false;
        if (ly[ly.length - 1] == 'y' && ly[ly.length - 2] == 'l') {
            j = true;
        }
        return j;
    }

    void chars2(char[] mej) {
        int x = mej.length / 2;
        System.out.print(mej[x - 1]);
        System.out.print(mej[x]);
    }

    int chars(char[] ch) {
        char c = 'o';
        int l = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                l++;
            }
        }
        return l;
    }
}

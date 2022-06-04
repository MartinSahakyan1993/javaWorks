package arrayutil1.practic;

public class PracticHomew {
    int maxLength(int[] array1, int[] array2) {
        int x;
        if (array1.length > array2.length) {
            x = array1.length;
        } else {
            x = array2.length;
        }
        return x;
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    boolean lessThanOrEqualToZero(int number) {
        boolean less = false;
        if (number <= 0) {
            less = true;
        } else {
            less = false;
        }
        return less;
    }

    boolean isSameNum(int a, int b) {
        boolean is = false;
        if (a == b) {
            is = true;
        }else {
            is = false;
        }
        return is;
    }
    int nextNumber(int number){
        return ++ number;
    }
    int calcAge(int years){
        return years * 365;
    }
    long convert(int minutes){
        return minutes = 60;
    }
}

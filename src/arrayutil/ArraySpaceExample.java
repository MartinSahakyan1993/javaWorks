package arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int start = 0;
        int back = spaceArray.length - 1;
        while (start < spaceArray.length && spaceArray[start] == ' ') {
            start++;
        }
        while (back < spaceArray.length && spaceArray[back] == ' ') {
            back--;
        }

        int s = 0;
        char[] result = new char[back];
        for (int i = start; i <= back; i++) {
            result[s] = spaceArray[i];
            System.out.print(result[s]);
            s++;
        }
    }
}

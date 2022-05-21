package arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                x++;
            }

        }
        System.out.println(x);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int z = chars.length / 2;
        int j = z - 1;
        System.out.println(chars2[j] + " " + chars[z]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        int k = chars3.length - 2;
        int b = chars.length - 1;
        if (chars3[k] == chars3[b]) {

        }
        System.out.println(chars3[k] + " " + chars3[b]);
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean l = false;
        for (int i = 0; i < bobArray.length - 2; i ++) {
            if (bobArray[i] == bobArray [i +2]){
                l = true;
            }
        }            System.out.println(l);

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i]!= ' '){
                System.out.print(text[i]);
            }

        }
    }
}

package arrayutil1;

public class ArrSortDemo {
    public static void main(String[] args) {


        ArrSort au = new ArrSort();
        int[] nums = new int[]{14, 27, 67, 85, 24, 28, 32};
        System.out.println("maximal -:" + au.max(nums));


        System.out.println("minimal -:" + au.min(nums));

        au.array(new int[]{2, 5, 8, 10, 32, 22, 11, 66, 12, 30});
        System.out.println();
        au.arrays(new int[]{2, 5, 8, 10, 32, 22, 11, 66, 12, 30});
        System.out.println();
        au.arrays1(new int[]{2, 5, 8, 10, 32, 22, 11, 66, 12, 30});
        System.out.println();
        System.out.print("mijin tvabanakan -:" + au.mijin(new double[]{2, 5, 8, 10, 32, 22, 11, 66, 12, 30}));
        System.out.println();
        System.out.println("elementneri gumar -:" + au.gumar(new int[]{2, 5, 8, 10, 32, 22, 11, 66, 12, 30}));
        au.text(new char[]{' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '});
        System.out.println();
        System.out.println(au.bobArray(new char[]{'b','a','b','o','l','a'}));
        System.out.println(au.chars3(new char[]{ 'j','a','v','a','l','o','l', 'y'}));
        au.chars2(new char[] {'j','a','v','a','l','o','l', 'y'});
        System.out.println();
        System.out.println (au.chars(new char[]{'j','a','v','a','l','o','v', 'e'}));
    }
}

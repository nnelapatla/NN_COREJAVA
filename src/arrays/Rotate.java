package arrays;

import java.util.Arrays;

public class Rotate {


    public static void main(String[] args) {

        int [] rot = {1, 2, 3, 4, 5, 6, 7};
        int[] newarr = new int[rot.length];

        for (int i = 2; i < rot.length; i++) {

            newarr[i-2] = rot[i];

        }
        for(int i = 0; i < 2; i++) {
            newarr[rot.length-2+i] = rot[i];
        }

        System.out.println(Arrays.toString(newarr));
    }
}

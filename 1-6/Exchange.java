package practice;

import java.util.Arrays;

/**
 * @author ellen
 * @date 2019-01-06 19:36
 * @description
 */
public class Exchange {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(exchangeAB(arr)));
        int a = 1;
        int b = 2;
        swap(a, b);
    }
    public static int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
    public int[] exchangeAB1(int[] AB) {
        AB[1] = AB[0] + AB[1];
        AB[0] = AB[1]-AB[0];  //AB[1]
        AB[1] = AB[1]- AB[0];
        return AB;
    }
    private static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }


}

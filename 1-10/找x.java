package 每日一题.day27;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-10 13:02
 * @description
 */
public class 找x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n: the length of the array
        int n = scanner.nextInt();
        // array
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // value of the x
        int x = scanner.nextInt();
        System.out.println(
                index(array,x)
        );
    }
    private static int index(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                // find the index, return it
                return i;
            }
        }
        // can not find a x in array
        return -1;
    }
}

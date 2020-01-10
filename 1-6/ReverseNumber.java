package practice;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2019-01-06 19:48
 * @description
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(new Integer(scanner.nextInt()).toString()));
    }
    private static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        StringBuffer buffer = sb.reverse();
        return new String(buffer);
    }
}

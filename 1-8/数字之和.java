package 每日一题.day26;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-09 17:18
 * @description
 */
public class 数字之和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.print(getSum(n) + " ");
            System.out.print(getSum(n * n));
            System.out.println();
        }
        scanner.close();
    }

    private static int getSum(int n) {
        if(n / 10 == 0){
            return n;
        }
        return getSum(n / 10) + (n % 10);
    }

    private static int getSum1(int n) {
        //TODO：循环实现
        return 0;
    }
}

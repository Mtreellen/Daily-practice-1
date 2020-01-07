package 每日一题.day24;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-07 20:56
 * @description：完美
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = 0;
            for (int i = 1; i <= n; i++) {
                b = scanner.nextInt();
                a = ability(a, b);
            }
            System.out.println(a);
        }
        scanner.close();
    }

    private static int ability(int a, int b) {
        if(a >= b){
            a += b;
        }else{
            a += maxCommonDivisor(a, b);
        }
        return a;
    }
    private static int maxCommonDivisor(int x, int y){
        for (int i = Math.min(x, y); i >= 2; i--) {
            if(x % i == 0 && y % i == 0){
                return i;
            }
        }
        return 1;
    }
}

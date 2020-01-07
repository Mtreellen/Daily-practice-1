package 每日一题.day24;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-07 21:13
 * @description：有问题
 */
public class HighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 第一行：获取学生的人数 N 和操作数 M
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];

        // 第二行：获取 N 个学生的成绩
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // M 次操作过程
        // 获取字符
        for (int i = 0; i < M; i++) {
            System.out.println(Arrays.toString(arr));
//            char ch = scanner.next().charAt(0);
            String ch = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if("Q".equals(ch)){
                System.out.println(maxScore(arr, a - 1, b - 1));
            }else if("U".equals(ch)){
                arr[a - 1] = b;
            }
        }
        scanner.close();
    }

    /*
        学生的 id 从 a 到 b 的中，成绩最高学生的 id
     */
    private static int maxScore(int[] arr, int a, int b) {
        int max = arr[a];
        for (int i = a + 1; i <= b; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

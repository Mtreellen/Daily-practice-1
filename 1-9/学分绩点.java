package 每日一题.day25;

import java.util.Scanner;

/**
 * @author ellen
 * @date 2020-01-09 18:09
 * @description
 */
public class 学分绩点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        float a = 0;
        for(int i = 0;i<n;i++){
            int grade = arr1[i];

            if(grade>=90){
                a +=4.0*arr[i];
            }
            if(grade>=85&&grade <= 89){
                a +=3.7*arr[i];
            }
            if(grade <= 84 && grade>=82 ){
                a +=3.3*arr[i];

            }
            if(grade <= 81 && grade>=78){
                a +=3.0*arr[i];
            }
            if(grade <= 77 && grade>=75 ){
                a +=2.7*arr[i];
            }
            if(grade <= 74 && grade>=72){
                a +=2.3*arr[i];
            }
            if(grade<=71 && grade>=68 ){
                a +=2.0*arr[i];
            }
            if( grade<=67 && grade>=64){
                a +=1.5*arr[i];
            }
            if(grade<=63 && grade>=60){
                a +=1.0*arr[i];
            }
            if(grade<60){
                a += 0;
            }
        }
        System.out.println(String.format("%.2f",a / sum));
    }
    private static double[] GPA(int[] grade){
        double[] point = new double[grade.length];
        for (int i = 0; i < grade.length; i++) {
            if(grade[i] >= 90 && grade[i] <= 100){
                point[i] = 4.0;
            }else if(grade[i] >= 85 && grade[i] <= 89){
                point[i] = 3.7;
            }else if(grade[i] >= 82 && grade[i] <= 84){
                point[i] = 3.3;
            }else if(grade[i] >= 78 && grade[i] <= 81){
                point[i] = 3.0;
            }else if(grade[i] >= 75 && grade[i] <= 77){
                point[i] = 2.7;
            }else if(grade[i] >= 72 && grade[i] <= 74){
                point[i] = 2.3;
            }else if(grade[i] >= 68 && grade[i] <= 71){
                point[i] = 2.0;
            }else if(grade[i] >= 64 && grade[i] <= 67){
                point[i] = 1.5;
            }else if(grade[i] >= 60 && grade[i] <= 63){
                point[i] = 1.0;
            }else if(grade[i] < 60){
                point[i] = 0.1;
            }
        }
        return point;
    }

    private static double GPAS(double[] gpa, int[] arr) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < gpa.length; i++) {
            i1 += gpa[i] * arr[i];
            i2 += arr[i];
        }
        return i1 / i2;
    }
}

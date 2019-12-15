package sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ellen
 * @date 2019-12-15 13:28
 * @description：快速排序
 *      - 递归实现快排
 *      - 栈实现快排
 */
public class QuickSort {
    private static int[] buildArray(){
        int[] arr = {8, 3, 7, 2, 4, 2, 1, -1, 5, 0};
        return arr;
    }
    private static int[] buildArrayRandom(){
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100000);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = buildArrayRandom();
        long start = System.currentTimeMillis();
//        quickSortHelper(arr, 0, arr.length - 1);
        quickSortLoop(arr);
        long end = System.currentTimeMillis();
        System.out.println("快速排序时间：" + ((double)(end - start) / 1000) + "秒");// 0.032秒
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSortHelper(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int index = partition(arr, left, right);
        quickSortHelper(arr, left, index - 1);
        quickSortHelper(arr, index + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int baseVal = arr[right];
        int baseIndex = right;
        while(left < right){
            while(left < right && arr[left] <= baseVal){
                left++;
            }
            while(left < right && arr[right] >= baseVal){
                right--;
            }
            swap(arr, left, right);
        }
        swap(arr, left, baseIndex);
        return left;
    }
    private static void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
    private static void quickSortLoop(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        stack.push(0);
        while(!stack.empty()){
            int left = stack.pop();
            int right = stack.pop();
            if(left >= right){
                continue;
            }
            int index = partition(arr, left, right);
            stack.push(index - 1);
            stack.push(left);
            stack.push(right);
            stack.push(index + 1);
        }
    }
}

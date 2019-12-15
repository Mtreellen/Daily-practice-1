package sort;

import java.util.Arrays;

/**
 * @author ellen
 * @date 2019-12-15 14:22
 * @description：快排优化
 * （1）基准值的选择
 *      - 三元取中
 *      - 随机选择
 */
public class QuickSort2 {
    private static void threeNumMid(int[] arr, int low, int high){
        int mid = (low + high) / 2;

        if(arr[mid] > arr[low]){
            swap(arr, low, mid);
        }
        if(arr[mid] > arr[high]){
            swap(arr, low, mid);
        }
        if(arr[low] > arr[high]){
            swap(arr, low, high);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {23, 31, 0, -1, 34, 4, 3, -6, 341, 1, 11, 45, 9, 4, 234, 6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static int partition(int[] arr, int low, int high){
        int tmp = arr[low];
        while(low < high){
            while(low < high && arr[high] >= tmp){
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= tmp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;
    }
    private static void quickSort(int[] arr){
        quick(arr, 0 ,arr.length - 1);
    }
    private static void quick(int[] arr, int low, int high){

        threeNumMid(arr, low, high);
        int par = partition(arr, low, high);
        if(par > low + 1){
            quick(arr, low, par - 1);
        }
        if(par < high - 1){
            quick(arr, par + 1, high);
        }
    }
}

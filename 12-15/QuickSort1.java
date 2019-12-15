package sort;

import java.util.Arrays;

/**
 * @author ellen
 * @date 2019-12-15 13:44
 * @description：快速排序
 *  O(n * log2n)
 *  快排和堆排比较
 */
public class QuickSort1 {
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
//            if(low >= high){
//                arr[low] = tmp;
//                break;
//            }else{
//                arr[low] = arr[high];
//            }
            while(low < high && arr[low] <= tmp){
                low++;
            }
            arr[high] = arr[low];
//            if(low >= high){
//                arr[low] = tmp;
//                break;
//            }else{
//                arr[high] = arr[low];
//            }
        }
        arr[low] = tmp;
        return low;
    }
    private static void quickSort(int[] arr){
        quick(arr, 0 ,arr.length - 1);
    }
    private static void quick(int[] arr, int low, int high){
        int par = partition(arr, low, high);
        if(par > low + 1){
            quick(arr, low, par - 1);
        }
        if(par < high - 1){
            quick(arr, par + 1, high);
        }
    }
}

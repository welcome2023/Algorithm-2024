package com.algorithmdoor.sort;

/**
 * @author cmsxyz@163.com
 * @date 2024-01-14 23:40
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {-1, 5, 3, -4, 7, 6, 2};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }


    // 调整为大根堆 上浮

    /**
     * @param arr 用数组来存储堆
     * @param index 子节点索引
     */

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    /** 功能:取出最大值,然后将最后一个值与根节点交换,heapSize--,使其依旧为大根堆
     * @param arr 用数组来存储堆
     * @param index    父节点索引
     * @param heapSize 最大索引,防止索引越界
     *                 largest:子节点中最大的孩子索引
     */
    // 下沉
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

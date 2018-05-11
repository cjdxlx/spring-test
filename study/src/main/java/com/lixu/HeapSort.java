package com.lixu;

public class HeapSort {

	public static void main(String[] args) {
		int[] a = {9,8,7,6,12,10,3,5,4,1,2};
		int[] sortHeap = sortHeap(a);
		for(int i = 0;i<sortHeap.length;i++) {
			
			System.out.print(sortHeap[i]+",");
		}
	}

	public static int[] sortHeap(int[] array) {
        buildHeap(array);// 构建堆
        int n = array.length;//数组中元素的个数
        
        for (int i = n - 1; i >= 1; i--) {
            swap(array, 0, i);//交换首尾元素
            if(i>0) {
            	adjustHeap(array, 0, i);//调整堆
            }
        }
        return array;
    }


    /**
     * 构建大顶堆堆
     * 从最后一个非叶子结点开始调整堆。每次都是从父结点，左节点，右结点三者中选最大值与父结点交换
     * @param array
     */
    private static void buildHeap(int[] array) {
        int n = array.length;// 数组中元素的个数
        
        for (int i = n / 2 - 1; i >= 0; i--)//i= n/2-1  表示最后一个非叶子结点的索引值
            adjustHeap(array, i, n);
    }
    /**
     * 调整堆
     * @param A
     * @param idx
     * @param max 堆的大小
     */
    private static void adjustHeap(int[] A, int idx, int max) {
        int left = 2 * idx + 1;// 左孩子的下标（如果存在的话）
        int right = left + 1;// 左孩子的下标（如果存在的话）
        int largest = 0;// 寻找3个节点中最大值节点的下标
        
        if (left < max && A[left] > A[idx])//左孩子的值比父结点的值大
            largest = left;
        else
            largest = idx;
        
        if (right < max && A[right] > A[largest])
            largest = right;
        
        if (largest != idx) {
            swap(A, largest, idx);//从左节点，右结点中选最大值与父结点交换
            adjustHeap(A, largest, max);
        }
    }
    private static void swap(int[] array, int i, int i2) {
        int temp = array[i];
        array[i] = array[i2];
        array[i2] = temp;
    }
}

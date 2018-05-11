package com.lixu;

public class Test2 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11};
		int[] f = f(array,9);
		for(int t:f) {
			
			System.out.println(t);
		}
	}

	static int[] f(int[] array,int k) {
		if(k>1) {
			return f(f(array,k-1),1);
		}else {
			int temp = array[0];
			for(int i=0;i<array.length-1;i++) {
				array[i] = array[i+1];
			}
			array[array.length-1] = temp;
			return array;
		}
		 
	}
}

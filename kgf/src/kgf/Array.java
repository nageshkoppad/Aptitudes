package kgf;

import java.util.Iterator;

public class Array {
	
	public static int[] array(int[] arr) {
		int[] m=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			m[i]=arr[i]*2;
		}
		return m;
	}
	public static void main(String[] args) {
        int[] arr= {10,20,30,40};  
		int[] a=array(arr);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}

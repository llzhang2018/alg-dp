package DP;

import java.util.Scanner;

/**
 * 给定一个连续递增序列
 * 找出序列中第K个缺失值
 * @author DELL
 *
 */
public class KthMissingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int K=sc.nextInt();	
		    int[] arr=new int[N];
		    for(int j=0;j<N;j++)
		    	arr[j]=sc.nextInt();
		    System.out.println(findK(arr, K));
		}	
		sc.close();
	}

	public static int  findK(int[] arr, int k){
		int target=-1;
		int i=0,ksum=0;
		for(;i<arr.length-1 && k>=0;){
			int temp=arr[i+1]-arr[i];
			if(temp==1)
				i++;
			else{	
				int diff=temp-1;
				ksum+=diff;
				if(ksum<k)
					i++;
				else
					return arr[i]+diff-(ksum-k);	
			}	
		}
		return target;
	}
	
}

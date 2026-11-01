import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[]={1, -2, -3, -4};
		int narr[]=new int[arr.length];
		int i=0;
		int p=0;
		int n=0;
		while(i<arr.length){
			while(p<arr.length&&arr[p]<0)p++;
			while(n<arr.length&&arr[n]>=0)n++;
			if(p<arr.length){
				narr[i]=arr[p];
				i++;
				p++;
			}
			if(n<arr.length){
				narr[i]=arr[n];
				i++;
				n++;
			}
			if(n>=arr.length&&p>=arr.length)break;
			
		}
		for(int ns:narr)System.out.println(ns);
	}
}
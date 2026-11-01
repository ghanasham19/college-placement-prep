import java.util.*;
class Demo{
	public static void main(String[]args){
		int n=9;
		for(int i=0;i<n*2-1;i++){
			for(int j=0;j<n*2-1;j++){
				int up=i;
				int down=(n*2-2)-i;	
				int left=j;
				int right=(n*2-2)-j;
				int p=Math.min(Math.min(up,down),Math.min(left,right));
				System.out.print(n-p);
				
			}	
			System.out.println();
		}
	}
}
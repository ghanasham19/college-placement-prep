class Demo{
	public static void main(String[]args){
		int n=20;
		for(int i=0;i<(n*2)-1;i++){
			int a=i-n;
			for(int j=0;j<n;j++){
				
				if((i<n && i+j<n-1) ||(i>=n && a>=0) )System.out.print("_");
				else System.out.print("* ");
				if(i>=n)a--;
				
			}
			System.out.println();
		}
	}
}
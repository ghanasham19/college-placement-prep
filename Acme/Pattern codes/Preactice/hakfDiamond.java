class Demo{
	public static void main(String[]args){
		int n=28;
		for(int i=0;i<(n*2-1);i++){
			int a;
			if(i<n)a=i;
			else a=(n*2-2)-i;
			for(int j=0;j<=a;j++){
				System.out.print("*" );
			}	
				System.out.println();
		}
		
	}
}
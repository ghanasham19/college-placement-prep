class Demo{
	public static void main(String[]args){
		int n=7;
		int p=10;
		for(int i=0;i<2*n-1;i++){
			for(int j=0;j<2*n-1;j++){
				if(i==j || i+j==2*n-2){
					if(i%2!=0)System.out.print("* ");
					else System.out.print(p);	
				}
				else System.out.print("  ");
			}
			if(i<n-1)p+=10;
			else p-=10;
			System.out.println();
		}
	}
}
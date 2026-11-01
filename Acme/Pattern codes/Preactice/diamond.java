class Demo{
	public static void main(String[]args){
		int n=20;
		for(int i=0;i<(n*2)-1;i++){
			int a=i-n;
			for(int j=0;j<n;j++){
				if(i<n){
					if(i+j<n-1)System.out.print("_");
					else System.out.print("* ");
				}else{
					
					if(a>=0){
						System.out.print("_");	
						a--;
					}
					else System.out.print("* ");	
				}
			}
			System.out.println();
		}
	}
}
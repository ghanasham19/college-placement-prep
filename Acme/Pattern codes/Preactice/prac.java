class Demo{
	public  static void main(String[]args){
		int n=7;
		for(int i=0;i<n;i++){
				int p=n-(i+1);
			for(int j=0;j<n	;j++){
				if(p>0){
					System.out.print("_");			
					p--;
				}
				else System.out.print("*"+" ");
				
			}
				System.out.println();	
		}
	}
}
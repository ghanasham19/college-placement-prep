class Demo{
	public static void main(String[]args){
		int n=15;
		int pri=10;
		int gap=1;
		int cur=2;
		
		for(int i=1;i<=n;i++){
				int spac=n-i;
				int prinnum=pri;
				
			for(int j=1;j<=n;j++){

				if(i==cur){
					if(spac>0){
						System.out.print("_");
						spac--;
					}else{
						System.out.print(prinnum+"_");
						prinnum+=10;
						if(j==n){
							pri+=10;
							gap++;
							cur=i+(gap+1);
						}	
					}
					
					
				}else{
					
					if(spac>0){
						System.out.print("_");
						spac--;
					}else System.out.print("*"+"_");
				}	
			}

			System.out.println();
		}
	}
}
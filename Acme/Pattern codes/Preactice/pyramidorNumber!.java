class Demo{
	public static void main(String[]args){
		int n=9;
		for(int i=0;i<n;i++){
			int s=(n-1)-i;
			int p=i+1;
			boolean w=true;
			for(int j=0;j<n+i;j++){
				if(s>0){
					System.out.print("_ ");
					s--;
					continue;
				}
				else System.out.print(p+" ");
				if(w){
				p--;
				if(p==1)w=false;
				}else{
				p++;
				}
			}
				System.out.println();
		}
	}
}
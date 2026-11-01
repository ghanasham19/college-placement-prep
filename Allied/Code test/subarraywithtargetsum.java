import java.util.*;
class Demo{
	public static void main(String[]args){	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size pf arrray you want to create");
		int size= sc.nextInt();
		int arr[] =  new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the: "+i+" th index value for arraay: ");
			arr[i]=sc.nextInt();	
		}
		System.out.println("Enter the target: ");
		int target=sc.nextInt();
		System.out.println("hello");

		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			ArrayList<Integer> ar = new ArrayList<>();
			int sum=0;
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
				ar.add(arr[j]);
				if(sum==target){
					al.add( new ArrayList<>(ar));
				}
				
			}
		}
		System.out.println(al);
	}
}
import java.util.*;
class Demo{
	public static int isPalindrome(String s,int start,int end){
		while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
			start--;
			end++;
		}
		return end-start-1;
	
	}
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	int len=0;
	int start=0;
		for(int i=0;i<s.length();i++){
			System.out.println(i);
			System.out.print(s.charAt(i));
			int l1=isPalindrome(s,i,i);
			int l2=isPalindrome(s,i,i+1);
			if(l2>l1)l1=l2;
			System.out.println(l1);
			if(l1%2==0){
				if(l1>len){
					len=l1;
					start=i-(l1/2)+1;
				}
			}else{
				if(l1>len){
					len=l1;
					start=i-(l1/2);
				}

			}
		}
		for(int i=start;i<start+len;i++){
			System.out.print(s.charAt(i));
		}

	}
}
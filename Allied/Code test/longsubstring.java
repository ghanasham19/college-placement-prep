import java.util.*;
class Demo{
	
	public static boolean isPalindrome(StringBuilder sb){
		int i=0;
		int j=sb.length()-1;
		while(i<j){
			if(sb.charAt(i)!=sb.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;

	}
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String ans="";
		String s= sc.nextLine();
		for(int i=0;i<s.length()-1;i++){
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));
			for(int j=i+1;j<s.length();j++){
				sb.append(s.charAt(j));
				//System.out.println(sb);
				if(s.charAt(i)==s.charAt(j)){
					if(isPalindrome(sb)){
						int n = sb.length();
						if(n>ans.length())ans=sb.toString();
					}
					
				}
			}
		}
		
		System.out.println(ans);

	}
}
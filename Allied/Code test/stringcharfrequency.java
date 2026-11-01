import java.util.*;
class Demo{
	public static void main(String[]args){
		String s="aaabbccccdde";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++){
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(hm.get(s.charAt(i))!=0){
				sb.append(s.charAt(i));
				sb.append(hm.get(s.charAt(i)));
				hm.put(s.charAt(i),0);
			}	
		}
		System.out.println(sb	);
		
	}
}
//10-10-10 how many times

import java.util.*;

class StringHW{
	public static void main(String... args){
		String s= "10101100000111111110111000100001101000101";
		int count=0;
		
		for(int i=0;i<s.length()-1;i++){
		
		//char a=s.charAt(i);
		//char b=s.charAt(i+1);
		if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
		count++;
		}
		}
		System.out.println(count);
	}
}
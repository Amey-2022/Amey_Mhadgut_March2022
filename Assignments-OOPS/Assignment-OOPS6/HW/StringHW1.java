//101-101-101 how many times
import java.util.*;

class StringHW1{
	public static void main(String... args){
		String s= "1010110000011111111011100010100110100010101";
		int count=0;
		
		for(int i=0;i<s.length()-2;i++){
		
		//char a=s.charAt(i);
		//char b=s.charAt(i+1);
		if(s.charAt(i)=='1' && s.charAt(i+1)=='0' && s.charAt(i+2)=='1' ){
		count++;
		}
		}
		System.out.println(count);
	}
}
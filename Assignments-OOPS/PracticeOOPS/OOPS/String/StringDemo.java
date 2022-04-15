/*String
1. Reverse the string
2. Anagram string
3. Count duplicate character
4. Print uppercase & lowercase letters
5. Palindrome String
6. Repeated & non-repeated character
7. Find repeated word in file
8. Reverse words of string object
9. Count the number of vowels
10. Count number of words in string
11. Display vowel, digits & blank spaces*/
import java.util.*;
class Questions{
	void Q1(){
		String str="abcdefghi",str1="";
		char ch;
		System.out.println("Original String : "+str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		System.out.println("Reverse String : "+str1);
	}
	
	void Q2(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Anagram");
		System.out.println("Enter String 1 :");
		String s1=sc.nextLine();
		System.out.println("Enter String 2 :");
		String s2=sc.nextLine();
		if(isAnagram(s1,s2))
		{
			System.out.println(s1+ " and "+ s2 +" are Anagram");
		}
		else{
			System.out.println(s1+ " and "+ s2 +" are Not Anagram");
		}
		
		
	}
	
	public boolean isAnagram(String s1,String s2){
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length() != s2.length())
		{
			return false;
		}
		else{
			ArrayList<Character> list1=new ArrayList<>();
			ArrayList<Character> list2=new ArrayList<>();
			
			for(int i=0;i<s1.length();i++)
			{
				list1.add(s1.charAt(i));
			}
			
			for(int i=0;i<s2.length();i++)
			{
				list2.add(s2.charAt(i));
			}
			
			Collections.sort(list1);
			Collections.sort(list2);
			
			if(list1.equals(list2))
				return true;
			else
				return false;
		}
	}
	
	void Q3(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Count duplicate character");
		System.out.print("Enter String  :");
		String s=sc.nextLine();
		int distinct=0,count=0;
		for (int i = 0; i < s.length(); i++) {

        for (int j = 0; j < s.length(); j++) {

            if(s.charAt(i)==s.charAt(j))
            {
                //distinct++;
				count++;
				System.out.print("Duplicate characters are : "+s.charAt(i));
				break;
            }
        }   
         /*System.out.println(s.charAt(i)+"--"+distinct);
        String d=String.valueOf(s.charAt(i)).trim();
        s=s.replaceAll(d,"");
        distinct = 0;*/
	}	
	
	}	
	
	void Q4(){
	Scanner sc=new Scanner(System.in);
		System.out.println("Print uppercase & lowercase letters");
		System.out.print("Enter String :");
		String s1=sc.nextLine();
		System.out.println();
		char ch[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
				
		System.out.print("Uppercase letters:");
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				System.out.print(ch[i] + " ");
			}
		}
		
		System.out.println();

		 
		System.out.print("Lowercase letters:");
		for(int i=0;i<s1.length();i++)
			{
			if(ch[i]>=97 && ch[i]<=122)
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
	
	void Q5(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Repeated & non-repeated character");
		System.out.print("Enter String  :");
		String s=sc.nextLine();
		char ch[]=new char[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		System.out.print("Repeated characters : ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.length()>(j)&&ch[i]==ch[j])
				{
					count++;
					ch[j]='0';
				}
				
			}
			
			if(count > 1 && ch[i]!='0')
			{
				System.out.print(ch[i]+" ");
			}
			
		
		}
		
	}
	
	void Q6(){
		String str="abccba",str1="";
		char ch;
		String temp=str;
		System.out.println("Original String : "+str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		if(temp.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
		
	}
}


class StringDemo{
	public static void main(String []args){
		Questions q = new Questions();
		//q.Q1();
		//q.Q2();
		//q.Q3();
		//q.Q4();
		//q.Q5();
		q.Q6();
	}
}
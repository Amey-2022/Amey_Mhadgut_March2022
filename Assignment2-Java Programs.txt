Assignment 2
Date: 03/03/2022
Submission Date: 05/03/2022

-----------------------------------------------------------------------------------------------------------------------------
1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov

public class Main
{
	public static void main(String[] args) {
        
        System.out.println("Hello");
       
        System.out.println("Alexandra Abramov");
    }
}


-----------------------------------------------------------------------------------------------------------------------------
2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36

public class Main
{
	public static void main(String[] args) {
        
        System.out.println("74 + 36 = "+ (74+36));
    }
}

-----------------------------------------------------------------------------------------------------------------------------
3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16
public class Main
{
	public static void main(String[] args) {
        
        System.out.println(" 50/3 = "+ (50/3));
    }
}

-----------------------------------------------------------------------------------------------------------------------------
4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13

public class Main
{
	public static void main(String[] args) {
        
        System.out.println("-5 + 8 * 6 = "+ (-5 + 8 * 6));
        System.out.println("(55+9) % 9 = "+ (55 + 9) % 9);
        System.out.println("20 + -3*5 / 8 = "+ (20 + -3*5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = "+ (5 + 15 / 3 * 2 - 8 % 3));
    }
}


-----------------------------------------------------------------------------------------------------------------------------
5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125

public class Main
{
	public static void main(String[] args) {
        
        int n1=25,n2=5;
        System.out.println("first number :" + n1);
        System.out.println("second number :" + n2);
        System.out.println( n1 + " x " + n2 + " = " + (n1*n2) );
    }
}


-----------------------------------------------------------------------------------------------------------------------------
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

public class Main
{
	public static void main(String[] args) {
        
        int n1=125,n2=24;
        System.out.println("first number :" + n1);
        System.out.println("second number :" + n2);
        System.out.println( n1 + "+" + n2 + " = " + (n1+n2)  );
        System.out.println( n1 + "-" + n2 + " = " + (n1-n2) );
        System.out.println( n1 + "x" + n2 + " = " + (n1*n2) );
        System.out.println( n1 + "/" + n2 + " = " + (n1/n2) );
        System.out.println( n1 + "mod" + n2 + " = " + (n1%n2) );
    }
}
-----------------------------------------------------------------------------------------------------------------------------
7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        
        
    }
}



-----------------------------------------------------------------------------------------------------------------------------
8. Write a Java program to display the following pattern.
Sample Pattern :
public class Main
{
	public static void main(String[] args) {
        
      System.out.println("   J    a   v     v  a");
      System.out.println("   J   a a   v   v  a a");
      System.out.println("J  J  aaaaa   v v  aaaaa");
      System.out.println(" JJ  a     a   v  a     a");
  
        
    }
}

-----------------------------------------------------------------------------------------------------------------------------
9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889

public class Main
{
	public static void main(String[] args) {
     
      double d;
      d=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
      System.out.println(d);
        
    }
}


-----------------------------------------------------------------------------------------------------------------------------
10. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765

public class Main
{
	public static void main(String[] args) {
     
      double d;
      d=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
      System.out.println(d);
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
     final float pi=3.1428F;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Radius = ");
     float r=sc.nextFloat();
     double p,a;
     p=2*pi*r;
     a=pi*r*r;
     System.out.println("Perimeter is = "+p);
     System.out.println("Area is = "+a);
        
    }
}
-----------------------------------------------------------------------------------------------------------------------------
12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number : ");
     float a=sc.nextFloat();
     System.out.println("Enter second number : ");
     float b=sc.nextFloat();
     System.out.println("Enter third number : ");
     float c=sc.nextFloat();
     double avg;
    
     avg=(a+b+c)/3;
     System.out.println("Average = "+avg);
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

public class Main
{
	public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Width : ");
     float w=sc.nextFloat();
     System.out.println("Enter Height : ");
     float h=sc.nextFloat();
 
     float a,p;
    
     a=w*h;
     p=2*(w+h);
     System.out.println("Area is " +w + " x "+h+ " = "+a);
     System.out.println("Perimeter is 2 x  ( "+w+" + "+h+ " ) = "+p);
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
14. Write a Java program to print an American flag on the screen.
Expected Output
public class Main
{
	public static void main(String[] args) {
     
    System.out.println("* * * * * * ========================================");
    System.out.println(" * * * * *  ========================================");
    System.out.println("* * * * * * ========================================");
    System.out.println(" * * * * *  ========================================");
    System.out.println("* * * * * * ========================================");
    System.out.println(" * * * * *  ========================================");
    System.out.println("* * * * * * ========================================");
    System.out.println(" * * * * *  ========================================");
    System.out.println("* * * * * * ========================================");
    System.out.println("====================================================");
    System.out.println("====================================================");
    System.out.println("====================================================");
    System.out.println("====================================================");
    System.out.println("====================================================");
    System.out.println("====================================================");
    }
}
-----------------------------------------------------------------------------------------------------------------------------
15. Write a Java program to swap two variables.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number : ");
     int n1=sc.nextInt();
     System.out.println("Enter second number : ");
     int n2=sc.nextInt();
     int temp;
     temp=n1;
     n1=n2;
     n2=temp;
     System.out.println("Number after swaping : n1 = " + n1 +"    n2 = "+ n2);

    }
}

-----------------------------------------------------------------------------------------------------------------------------
16. Write a Java program to print a face.
Expected Output
public class Main
{
	public static void main(String[] args) {
     
     System.out.println(" +\"\"\"\"\"+");
     System.out.println("[| o o |]" );
     System.out.println(" |  ^  |");
     System.out.println(" | '_' |");
     System.out.println(" +-----+");

    }
}


-----------------------------------------------------------------------------------------------------------------------------
17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
        //int sum;                
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first binary number : ");
        String b1=sc.next();
     
        System.out.print("Enter second binary number : ");
        String b2=sc.next();
     
    
        int n1=Integer.parseInt(b1,2); 
        int n2=Integer.parseInt(b2,2); 
        
        // System.out.println("Conversion of first binary number into decimal number : "+n1);
        // System.out.println("Conversion of second binary number into decimal number : "+n2);
        
        // sum=n1+n2;
        // System.out.println(sum);
        
        System.out.println("Sum of two binary numbers = "+Integer.toBinaryString(n1+n2)); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
        int sum;                
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first binary number : ");
        String b1=sc.next();
     
        System.out.print("Enter second binary number : ");
        String b2=sc.next();
     
    
        int n1=Integer.parseInt(b1,2); 
        int n2=Integer.parseInt(b2,2); 
        
        // System.out.println("Conversion of first binary number into decimal number : "+n1);
        // System.out.println("Conversion of second binary number into decimal number : "+n2);
        
        // sum=n1+n2;
        // System.out.println(sum);
        
        System.out.println("Product of two binary numbers = "+Integer.toBinaryString(n1*n2)); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
                        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter decimal number : ");
        int n1=sc.nextInt();
     
        System.out.println("Binary numbers is "+Integer.toBinaryString(n1)); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
                        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter decimal number : ");
        int n1=sc.nextInt();
     
        System.out.println("Hexadecimal numbers is "+Integer.toHexString(n1)); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
21. Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
                        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter decimal number : ");
        int n1=sc.nextInt();
     
        System.out.println("Octal numbers is "+Integer.toOctalString(n1)); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
22. Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter binary number (1/0) : ");
        String b1=sc.next();
     
        int n1=Integer.parseInt(b1,2); 
       
        System.out.println("Decimal numbers is "+n1); 
     
    }
}
-----------------------------------------------------------------------------------------------------------------------------
23. Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter binary number (1/0) : ");
        String b1=sc.next();
     
        int n1=Integer.parseInt(b1,2); 
        String hex=Integer.toHexString(n1);
       
        System.out.println("Hexadecimal numbers is "+hex); 
     
    }
}
-----------------------------------------------------------------------------------------------------------------------------
24. Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter binary number (1/0) : ");
        String b1=sc.next();
     
        int n1=Integer.parseInt(b1,2); 
        String oct=Integer.toOctalString(n1);
       
        System.out.println("Octal numbers is "+oct); 
     
    }
}

-----------------------------------------------------------------------------------------------------------------------------
25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
     
                        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter octal number : ");
        String s1=sc.next();
     
        int decimal=Integer.parseInt(s1,8);
        System.out.println("Decimal numbers is "+decimal); 
    
    }
}
-----------------------------------------------------------------------------------------------------------------------------
package CoreJavaPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= "Rajib Panigrahi";
		System.out.println("Please Enter the String to reverse: ");
		Scanner read = new Scanner(System.in);
		String str=read.nextLine();
		String reverse="";
		for(int i=str.length()-1; i>=0;i--)
		{
			reverse= reverse+str.charAt(i);
		}
		System.out.println("Origional String is: "+ str);
		System.out.println("Reverse String is: "+ reverse);
		
		System.out.println("-----------------------------------------");
		//Using String builder
		System.out.println("Please enter the string to reverse: ");
		Scanner read1 = new Scanner(System.in);
		String str1=read.nextLine();
		StringBuilder sb =new StringBuilder();
		for(int i=str1.length()-1; i>=0;i--)
		{
			sb.append(str1.charAt(i));
		}
		
		System.out.println("Reverse string is: "+sb.toString());
	}

}

package day_4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringOps_9 {
	public String stringMaker(String s1,int option) {
		String output="";
		switch(option) {
		case 1:
			System.out.println("Add the String to itself");
			output=s1+s1;
			break;
		case 2 :
			System.out.println("Replace Odd positions with #");
			output= IntStream.range(0,s1.length()).mapToObj(i -> (i%2!=0)? "#":String.valueOf(s1.charAt(i))).reduce("", String::concat);
			break;
		case 3 :
			System.out.println("Remove duplicate characters in the string");
			output= s1.chars().distinct().mapToObj(i-> String.valueOf((char)i)).collect(Collectors.joining());
			break;
		case 4:
			System.out.println("Change odd characters to uppercase");
			output=IntStream.range(0, s1.length()).mapToObj(i->i%2==0 ? String.valueOf(Character.toUpperCase(s1.charAt(i))):String.valueOf(s1.charAt(i)))
					.reduce("", String::concat);
			break;
		default:{
			output= "Please select option";
		}
			
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		System.out.println("Please select string operation 1 to 4");
		int input2=sc.nextInt();
		StringOps_9 ops=new StringOps_9();
		System.out.println(ops.stringMaker(input, input2));
	}
}

package day_4;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PositiveString_10 {
	
	public static boolean validator(String s1) {
		 return IntStream.range(1, s1.length()).allMatch(i->s1.charAt(i)> s1.charAt(i-1));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		System.out.println(validator(s1));
	}

}

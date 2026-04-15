package java_basics_Day1_2;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first_name :");
		String first_name=sc.nextLine();
		System.out.println("last_name :");
		String last_name=sc.nextLine();
		System.out.println("gender :");
		String gender=sc.nextLine();
		System.out.println("age :");
		int age=sc.nextInt();
		System.out.println("weight :");
		double weight= sc.nextDouble();
		Person person=new Person(first_name,last_name,gender,age,weight);
		System.out.println(person);
		
	}

}

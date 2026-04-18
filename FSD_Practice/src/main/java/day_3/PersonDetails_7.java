package day_3;

import java.util.Scanner;

public class PersonDetails_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first_name :");
		String first_name=sc.nextLine();
		System.out.println("last_name :");
		String last_name=sc.nextLine();
		System.out.println("phoneNumber :");
		
		long phoneNumber=sc.nextLong();
		System.out.println("age :");
		int age=sc.nextInt();
		System.out.println("weight :");
		double weight= sc.nextDouble();
		Person person=new Person(first_name,last_name,age,GenderEnum_8.M,weight,phoneNumber);
		System.out.println(person);
		
	}

}

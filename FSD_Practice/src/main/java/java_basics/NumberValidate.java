package java_basics;

public class NumberValidate {

	public static void main(String[] args) {
		if( args.length==0) {
			System.out.println("provide number in command line arguments");
			return;
		}
		int number=Integer.parseInt(args[0]);
		if(number>0) {
			System.out.println("Number is positive");
		}else if(number<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Zero");
		}
	}

}

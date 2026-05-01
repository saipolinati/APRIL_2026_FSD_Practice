package day_6;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		String[] products = {"Laptop", "Mobile", "Tablet"};

        for (int i = 0; i < products.length; i++) {
            char[] chars = products[i].toCharArray();

            Arrays.sort(chars); 

            products[i] = new String(chars);
        }

        for (String product : products) {
            System.out.println(product);
        }

}}
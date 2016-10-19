/**
 * 
 */
package samplePogrammes;

import java.util.Scanner;

/**
 * @author farooq
 *programm to print hello message and addition of two number
 *
 */
public class FirstProgram {

	public static void main(String[] args)
	{
		System.out.println("hello there");
		System.out.println("enter the two numbers");
	
		int n1, n2;
		Scanner Keyboard = new Scanner(System.in);
		n1 = Keyboard.nextInt();
		n2 = Keyboard.nextInt();
		
		System.out.println("The sum of two numbers");
		System.out.println(n1 + n2);
	}
	
}

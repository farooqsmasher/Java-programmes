/**
 * 
 */
package samplePogrammes;

/**
 * @author farooq
 * programm to demonstrate average array values
 *
 */
public class AverageArrayValues {
	public static void main(String[] args){
		double num[] = {1.1,2.1,3.1,4.1,5.1};
		double result = 0;
		int i;
		
		for(i = 0; i<5; i++)
			result = result + num[i];
		System.out.println("average is :" +result /5);
	}

}

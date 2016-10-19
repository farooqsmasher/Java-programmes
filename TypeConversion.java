/**
 * 
 */
package samplePogrammes;

/**
 * @author farooq
 * programm vill demonstrate conversion int to byte,double to int, double to int
 * demonstrate cast
 */
public class TypeConversion {
	public static void main(String[] args)
	{
		int i = 50;
		double d = 343.44;
		byte b;
		
		System.out.println("\n conversion int to byte.");
		b = (byte)i;
		System.out.println("i and b " + i  + " " + b );
		//conversion of double to in
        System.out.println("\n conversion double to int.");
        i =(int) d;
        System.out.println("d and i " + d + " " + i);
        //conversion of double to byte
        System.out.println("\n conversion of double to byte");
        b = (byte) d;
        System.out.println("d and b " +d + " " + b);
        
		
	}

}

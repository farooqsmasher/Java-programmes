/**
 * 
 */
package samplePogrammes;

/**
 * @author farooq
 * programm to measure distance of light
 * 
 *
 */
public class UsingLong {
	
	public static void main(String[]  args)
	{
		long lightSpeed;
		long days;
		long seconds;
		long distance;
		
		//approximate speed of light in miles per second
		lightSpeed = 186000;
		days = 1000; //specifing the number of days
		seconds = days * 24 * 60 * 60; // convert into seconds
		distance = lightSpeed * seconds; //compute distance
		
		System.out.println("IN :" +days);
		System.out.println("days light vill travel about");
		System.out.println(distance + "miles.");
		
		
	}

}

package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author Anjali
 */
public class JavaUtility {
	/**
	 * This method is used to capture current system time and date
	 * @return system date and time
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":","-" );
	}
	/**
	 * This method will return random number within 1000
	 * @return
	 */
	public int getRandomNUmber() {
		Random ran=new Random();
		 return ran.nextInt(1000);
	}
}

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class UpTime {
	public static String getUpTime(){
		RuntimeMXBean mx = ManagementFactory.getRuntimeMXBean();
		long elapsedTime = mx.getUptime();
		elapsedTime = elapsedTime / 1000;
		long DAY = (elapsedTime / 86400);
		long HR = (elapsedTime / 3600) - (DAY * 24);
		long MIN = (elapsedTime / 60) - (DAY * 1440) - (HR * 60);
		return ("Days: " + DAY + " Hrs: " + HR + " Mins: " + MIN + "");
	}
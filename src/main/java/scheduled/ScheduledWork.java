/*

package scheduled;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import log.Main;
import lombok.SimpleMain;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ScheduledWork {
	private static final Logger Log = Logger.getLogger(Main.class);

	//@Scheduled(cron="0/5 * * * * ?")
	public void work1() {
		System.out.println("5초마다 작업시작");
		
	}
	
	//@Test
	//@Scheduled(cron="0/10 * * * * ?")
	public void log() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("스케쥴 실행 : " +dateFormat.format(calendar.getTime()));
	}
	

	//@Scheduled(cron="0/5 * * * * ?")
	public void logger() {
		String name = "test";
		log.debug("debug log = {}" , name);
	}
		
		//@Scheduled(cron="0/5 * * * * ?")
		public void timelogger() {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			log.debug("debug log = {}" , dateFormat.format(calendar.getTime()));
	
		}
	
}
*/
package eu.noelvaes.housekeeping.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component
@Lazy
@Profile("smallHouse")
public class CleaningServiceImpl implements CleaningService {
	private CleaningTool tool;
	private float rate;

	public CleaningServiceImpl() {
		System.out.println("CleaningServiceImpl: constructor");
	}

	@Autowired
	public void setCleaningTool(
	   @Qualifier("shaggy") CleaningTool tool) {
		this.tool = tool;
	}

	@Value("9")
	public void setRate(float rate) {
		this.rate = rate;
	}

	@PostConstruct
	public void init() {
		System.out.println("CleaningService preparing for work.");
	}

   @PreDestroy
   public void destroy() {
   	System.out.println("CleaningService cleaning up.");
   }

	public void clean() {
		System.out.println("Cleaning the house");
		tool.doCleanJob();
	}
}

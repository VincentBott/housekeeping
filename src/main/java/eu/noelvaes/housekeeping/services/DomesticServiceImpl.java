package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component("domesticService")
public class DomesticServiceImpl implements DomesticService {
	private CleaningService cleaningService;
	private GardeningService gardeningService;
	@Autowired
	private Logger logger;
	
	@Autowired
	public void setCleaningService(@Qualifier("robot") CleaningService cleaningService) {
		this.cleaningService = cleaningService;
	}

	@Autowired
	public void setGardeningService(GardeningService gardeningService) {
		this.gardeningService = gardeningService;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("DomesticService preparing for work.");
	}

   @PreDestroy
   public void destroy() {
   	System.out.println("DomesticService cleaning up.");
   }

	public void runHousehold() {
	   logger.info("Running household");
		cleaningService.clean();
		gardeningService.garden();
	}	
}

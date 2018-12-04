package eu.noelvaes.housekeeping.services;



import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component
public class GardeningServiceImpl implements GardeningService {
	private GardeningTool tool;
	
	//@Autowired
	@Resource
	public void setGardeningTool(GardeningTool tool) {
		this.tool = tool;
	}
   
	@PostConstruct
	public void init() {
		System.out.println("GardeningService preparing for work.");
	}

   @PreDestroy
   public void destroy() {
   	System.out.println("GardeningService cleaning up.");
   }
	
	public void garden() {
   	System.out.println("Working in the garden.");
   	tool.doGardenJob();
   }
}

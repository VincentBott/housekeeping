package eu.noelvaes.housekeeping.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CleaningServiceImpl implements CleaningService {

    @Autowired
    private CleaningTool tool;

    public void setCleaningTool(CleaningTool tool) {
        this.tool = tool;
    }


    @Override
    public void clean() {
        System.out.println("Cleaning the house.");
        tool.doCleanJob();
    }
}

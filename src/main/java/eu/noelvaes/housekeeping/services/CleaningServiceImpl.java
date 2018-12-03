package eu.noelvaes.housekeeping.services;



public class CleaningServiceImpl implements CleaningService {

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

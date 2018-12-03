package eu.noelvaes.housekeeping.services;



public class Broom implements CleaningTool {


    public Broom() {
        System.out.println("Boodschap broom");
    }


    @Override
    public void doCleanJob() {

        System.out.println("Scrub scrub");
    }
}

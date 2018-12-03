package eu.noelvaes.housekeeping.services;


public class Sponge implements CleaningTool {


    public Sponge() {

        System.out.println("Boodschap sponge");
    }


    @Override
    public void doCleanJob() {

        System.out.println("Splash splash");
    }
}

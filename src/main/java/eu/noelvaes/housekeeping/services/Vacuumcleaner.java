package eu.noelvaes.housekeeping.services;


public class Vacuumcleaner implements CleaningTool {


    public Vacuumcleaner() {

        System.out.println("Boodschap vacuumcleaner");
    }


    @Override
    public void doCleanJob() {
        System.out.println("Zuuuuuuuuuuuuuuuuuuu");
    }
}

package eu.noelvaes.housekeeping.services;



public class LawnMower implements GardeningTool {


    public LawnMower() {
        System.out.println("Ik ben de lawnmower.");
    }

    @Override
    public void doGardenJob() {
        System.out.println("Ik rij het gras af.");
    }
}

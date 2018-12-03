package eu.noelvaes.housekeeping.services;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LawnMower implements GardeningTool {


    public LawnMower() {
        System.out.println("Ik ben de lawnmower.");
    }


    @Override
    public void doGardenJob() {
        System.out.println("Ik rij het gras af.");
    }
}

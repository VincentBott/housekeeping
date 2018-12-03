package eu.noelvaes.housekeeping.services;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class Broom implements CleaningTool {


    public Broom() {
        System.out.println("Boodschap broom");
    }

    @Bean
    @Override
    public void doCleanJob() {

        System.out.println("Scrub scrub");
    }
}

package eu.noelvaes.housekeeping;


import eu.noelvaes.housekeeping.services.*;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan
public class AppConfig {


}
/*
    @Bean
    public LawnMower lawnmower() {
        return new LawnMower();
    }

    @Bean
    @Scope(value="prototype")
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean
    @Scope(value="prototype")
    public CleaningTool vacuum() {
        return new Vacuumcleaner();
    }

    @Bean
    @Scope(value="prototype")
    public CleaningTool sponge() {
        return new Sponge();
    }

    @Bean
    @Lazy
    public CleaningService jill() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(broom());
        return cs;
    }

    @Bean
    @Lazy
    public CleaningService jane() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(vacuum());
        return cs;
    }

    @Bean
    @Lazy
    public CleaningService richard() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTool(sponge());
        return cs;
    }
    */


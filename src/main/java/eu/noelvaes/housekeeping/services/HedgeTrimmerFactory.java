package eu.noelvaes.housekeeping.services;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalTime;


@Component
public class HedgeTrimmerFactory {
    @Bean
    @Profile("bigHouse")
    public GardeningTool getHedgeTrimmer() {

        int hour = LocalTime.now().getHour();
        if (hour > 8 || hour < 18) {
            return () -> System.out.println("Trimming electric (noisily)");
        } else {
            return () -> System.out.println("Trimming manual (silently)");
        }
    }

    @PostConstruct
    public void init() {
        System.out.println("HedgeTrimmerFactory intializing.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("HedgeTrimmerFactory closing.");
    }

}

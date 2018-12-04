package eu.noelvaes.housekeeping.services;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
@Order(2)
@Profile("!smallHouse")
public class VacuumCleaner implements CleaningTool {

    public VacuumCleaner() {
        System.out.println("VacuumCleaner: constructor");
    }

    public void doCleanJob() {
        System.out.println("Zuuuuuuuuuuu");
    }
}

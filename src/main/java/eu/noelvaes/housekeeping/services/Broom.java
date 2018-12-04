package eu.noelvaes.housekeeping.services;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
@Order(1)
@Profile("smallHouse")
public class Broom implements CleaningTool {
	public Broom() {
		System.out.println("Broom: constructor");
	}

	public void doCleanJob() {
		System.out.println("Scrub scrub");
	}
}

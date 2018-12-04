package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(3)
@Profile("bigHouse")
public class Sponge implements CleaningTool {
	public Sponge() {
		System.out.println("Sponge: constructor");
	}

   public void doCleanJob() {
      System.out.println("Splash splash");
   }
}

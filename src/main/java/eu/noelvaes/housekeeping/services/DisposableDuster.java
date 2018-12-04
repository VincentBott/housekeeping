package eu.noelvaes.housekeeping.services;



import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
@Profile("bigHouse")
public class DisposableDuster implements CleaningTool {

	private boolean used = false;

	public void doCleanJob() {


		if (used) {

			System.out.println(
			   "I'm already used. Please throw me away!");

		} else {

			System.out.println("Wipe the dust away");
			used = true;
		}
	}
}

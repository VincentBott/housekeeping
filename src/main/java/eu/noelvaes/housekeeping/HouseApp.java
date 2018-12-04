package eu.noelvaes.housekeeping;


import eu.noelvaes.housekeeping.services.DomesticService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HouseApp {

    public static void main(String[] args) {


        try (
                AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                        AppConfig.class)) {


            ctx.getEnvironment().setActiveProfiles("smallHouse");

            // ctx.getEnvironment().setActiveProfiles("bigHouse");

            ctx.register(AppConfig.class);

            ctx.refresh();

            System.out.println("Container initialized");

            DomesticService service = ctx.getBean("domesticService", DomesticService.class);

            service.runHousehold();
        }
    }
}

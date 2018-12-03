package eu.noelvaes.housekeeping;


import eu.noelvaes.housekeeping.services.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HouseApp
{
    public static void main( String[] args )
    {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        CleaningService jill = ctx.getBean("jill", CleaningService.class);


        CleaningService jane = ctx.getBean("jane", CleaningService.class);


        CleaningService richard = ctx.getBean("richard", CleaningService.class);


        // for(int )

        jill.clean();

        jane.clean();
        richard.clean();

        ctx.close();
    }
}


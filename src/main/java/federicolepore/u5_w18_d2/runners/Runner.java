package federicolepore.u5_w18_d2.runners;

import federicolepore.u5_w18_d2.entities.Menu;
import federicolepore.u5_w18_d2.entities.Ordine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    private final Menu menu;
    private final Ordine ordine1;

    // il runner ha bisogno di un costruttore
    public Runner(Menu menu, Ordine ordine) {
        this.menu = menu;
        this.ordine1 = ordine;
    }


    @Override
    public void run(String... args) throws Exception {
        logger.info("MENÙ");
        logger.info("Pizze");
        menu.getPizzaList().forEach(p -> logger.info(p.toString()));

        logger.info("Toppings");
        menu.getToppingList().forEach(t -> logger.info(t.toString()));

        logger.info("Drinks");
        menu.getDrinkList().forEach(d -> logger.info(d.toString()));

        logger.info("OREDINE");
        logger.info(ordine1.toString());
    }
}

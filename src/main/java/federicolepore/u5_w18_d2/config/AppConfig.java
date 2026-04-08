package federicolepore.u5_w18_d2.config;

import federicolepore.u5_w18_d2.entities.*;
import federicolepore.u5_w18_d2.enumerators.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    //    proseguo giorno 2

    @Value("${menu.costo-coperto}")
    private double costoCoperto;

    // tavoli
    @Bean(name = "tavolo1")
    public Tavolo tavolo1Bean() {
        return new Tavolo(1, 4, StatoTavolo.LIBERO);
    }

    @Bean(name = "tavolo2")
    public Tavolo tavolo2Bean() {
        return new Tavolo(2, 6, StatoTavolo.LIBERO);
    }

    //ordine
    @Bean(name = "ordine1")
    public Ordine ordine1Bean() {
        List<Pizza> pizze = new ArrayList<>();
        pizze.add(pizzaMargheritaBean());
        pizze.add(pizzaSalameBean());

        List<Drink> drink = new ArrayList<>();
        drink.add(acquaBean());
        drink.add(limonataBean());

        Tavolo tavolo = tavolo1Bean();
        tavolo.setStato(StatoTavolo.OCCUPATO);

        return new Ordine(1, 2, tavolo, pizze, drink, costoCoperto);
    }


    //topping
    @Bean(name = "topping_pomodoro")
    public Topping toppingPomodoroBean() {
        return new Topping("Pomodoro", 0, 0);
    }

    @Bean(name = "toppping_formaggio")
    public Topping toppingFormaggioBean() {
        return new Topping("Formaggio", 92, 0.69);
    }

    @Bean(name = "topping_prosciutto")
    public Topping toppingProsciuttoBean() {
        return new Topping("Prosciutto", 35, 0.99);
    }

    @Bean(name = "topping_ananas")
    public Topping toppingAnanasBean() {
        return new Topping("Ananas", 24, 0.79);
    }

    @Bean(name = "topping_salame")
    public Topping toppingSalameBean() {
        return new Topping("Salame", 86, 0.99);
    }

    //pizze
    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingFormaggioBean());
        return new Pizza("Pizza Margherita", toppingList);
    }

    @Bean(name = "pizza_hawaiana")
    public Pizza pizzaHawaianaBean() {
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingFormaggioBean());
        toppingList.add(toppingProsciuttoBean());
        toppingList.add(toppingAnanasBean());
        return new Pizza("Hawaiian Pizza", toppingList);
    }

    @Bean(name = "pizza_salame")
    public Pizza pizzaSalameBean() {
        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoroBean());
        toppingList.add(toppingFormaggioBean());
        toppingList.add(toppingSalameBean());
        return new Pizza("Salami Pizza", toppingList);
    }

    //bibite
    @Bean(name = "limonata")
    public Drink limonataBean() {
        return new Drink("Limonata", 128, 1.29);
    }

    @Bean(name = "acqua")
    public Drink acquaBean() {
        return new Drink("Acqua", 0, 1.29);
    }

    @Bean(name = "vino")
    public Drink vinoBean() {
        return new Drink("Vino", 607, 7.49);
    }

    //menu
//    @Bean(name = "menu")
//    public Menu menuBean() {
//        List<Pizza> pizzaList = new ArrayList<>();
//        List<Drink> drinkList = new ArrayList<>();
//        List<Topping> toppingsList = new ArrayList<>();
//
//        pizzaList.add(pizzaMargheritaBean());
//        pizzaList.add(pizzaHawaianaBean());
//        pizzaList.add(pizzaSalameBean());
//
//        drinkList.add(limonataBean());
//        drinkList.add(acquaBean());
//        drinkList.add(vinoBean());
//
//        toppingsList.add(toppingPomodoroBean());
//        toppingsList.add(toppingFormaggioBean());
//        toppingsList.add(toppingProsciuttoBean());
//        toppingsList.add(toppingAnanasBean());
//        toppingsList.add(toppingSalameBean());
//
//        return new Menu(pizzaList, drinkList, toppingsList);
//    }


}

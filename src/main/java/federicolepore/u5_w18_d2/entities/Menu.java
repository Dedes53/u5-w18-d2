package federicolepore.u5_w18_d2.entities;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@ToString
//@NoArgsConstructor
//@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

    // costruttore con la classe Menu come @Component
    public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingLIst) {
        this.pizzaList = pizzaList;
        this.drinkList = drinkList;
        this.toppingList = toppingLIst;
    }

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}

package federicolepore.u5_w18_d2.entities;

import java.util.List;

public class Pizza {

    private String nome;
    private List<Topping> toppingList;
    private int calorie;
    private double prezzo;

    public Pizza(String nome, List<Topping> toppingList) {
        this.nome = nome;
        this.toppingList = toppingList;
        this.calorie = setCalorie(toppingList);
        this.prezzo = prezzo;
    }

    public int setCalorie(List<Topping> toppingList) {
        int tot = 1012;
        if (toppingList != null) {
            for (int i = 0; i < toppingList.size(); i++) {
                tot += toppingList.get(i).getCalorie();
            }
        }
        return tot;
    }

    public double setPrice(List<Topping> t) {
        double tot = 4.30;
        if (t != null) {
            for (int i = 0; i < t.size(); i++) {
                tot += t.get(i).getPrezzo();
            }
        }
        return tot;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                ", nome='" + nome + '\'' +
                ", toppingList=" + toppingList +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

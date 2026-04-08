package federicolepore.u5_w18_d2.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink {

    private String nome;
    private int calorie;
    private double prezzo;

    public Drink(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + nome + '\'' +
                ", calories=" + calorie +
                ", price=" + prezzo +
                '}';
    }
}

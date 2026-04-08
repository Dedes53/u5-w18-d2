package federicolepore.u5_w18_d2.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Topping {

    private String nome;
    private int calorie;
    private double prezzo;

    public Topping(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + nome + '\'' +
                ", calories=" + calorie +
                ", price=" + prezzo +
                '}';
    }
}

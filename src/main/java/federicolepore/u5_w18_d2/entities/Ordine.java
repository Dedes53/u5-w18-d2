package federicolepore.u5_w18_d2.entities;


import federicolepore.u5_w18_d2.enumerators.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString

public class Ordine {

    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDate oraOrine;
    private List<Pizza> pizzeOrdinate;
    private List<Drink> drinkOrdinati;
    private Tavolo tavolo;
    private double importoTotale;
    private double costoCoperto;

    public Ordine(int numeroOrdine, int numeroCoperti, Tavolo tavolo, List<Pizza> pizzeOrdinate, List<Drink> drinkOrdinati, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = StatoOrdine.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.oraOrine = LocalDate.now();
        this.pizzeOrdinate = pizzeOrdinate;
        this.drinkOrdinati = drinkOrdinati;
        this.tavolo = tavolo;
        this.costoCoperto = costoCoperto;
        this.importoTotale = calcolaTotale();
    }

    private double calcolaTotale() {
        double tot = 0;

        if (pizzeOrdinate != null) {
            for (Pizza p : pizzeOrdinate) {
                tot += p.getPrezzo();
            }
        }

        if (drinkOrdinati != null) {
            for (Drink d : drinkOrdinati) {
                tot += d.getPrezzo();
            }
        }

        tot += costoCoperto * numeroCoperti;
        return tot;
    }


}

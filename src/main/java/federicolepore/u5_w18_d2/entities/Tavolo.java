package federicolepore.u5_w18_d2.entities;

import federicolepore.u5_w18_d2.enumerators.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {

    private int numero;
    private int copertiMAx;
    private StatoTavolo stato;


}

package edu.badpals.extras;

import edu.badpals.order.Comanda;

import java.util.Optional;

public abstract class Extra {

    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";

    static String extraProduct = "";
    static Optional<Extra> nextExtra ;

    public Extra () {
    }

    public void setNextExtra(Extra extra){
        this.nextExtra = Optional.of(extra);
    };

    public abstract void sumExtras(Comanda order);


}

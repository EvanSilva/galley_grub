package edu.badpals.extras;

import edu.badpals.items.RetailPrice;
import edu.badpals.order.Comanda;

import java.util.Optional;

public class SauceExtra extends Extra{

    public SauceExtra(){};

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sauceCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase("sauce"))
                .map(item -> RetailPrice.getPrice(Extra.SAUCE))
                .reduce(Double::sum);

        if (sauceCharge.isPresent()) {
            order.updateTotal(sauceCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}

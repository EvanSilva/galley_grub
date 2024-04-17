package edu.badpals.extras;

import edu.badpals.items.Item;
import edu.badpals.items.RetailPrice;
import edu.badpals.order.Comanda;

import java.util.Optional;

public class CheeseExtra extends Extra{

    public CheeseExtra(){};

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> cheeseCharge  = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase("cheese"))
                .map(item -> RetailPrice.getPrice(Extra.CHEESE))
                .reduce(Double::sum);

        if (cheeseCharge.isPresent()) {
            order.updateTotal(cheeseCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}

package edu.badpals.extras;

import edu.badpals.items.Item;
import edu.badpals.items.RetailPrice;
import edu.badpals.order.Comanda;

import java.util.Optional;

public class CheeseExtra extends Extra{

    public CheeseExtra(){};

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sumRegularPrices = order.itemList().stream()
                .map(item -> RetailPrice.getPrice(Extra.CHEESE))
                .reduce(Double::sum);

        if (sumRegularPrices.isPresent()) {
            order.updateTotal(sumRegularPrices.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}

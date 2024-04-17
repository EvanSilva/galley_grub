package edu.badpals.extras;

import edu.badpals.items.Item;
import edu.badpals.order.Comanda;

import java.util.Optional;

public class Regular extends Extra {

    public Regular() {};

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sumRegularPrices = order.itemList().stream()
                .map(Item::price)
                .reduce(Double::sum);

        if (sumRegularPrices.isPresent()) {
            order.updateTotal(sumRegularPrices.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }
}

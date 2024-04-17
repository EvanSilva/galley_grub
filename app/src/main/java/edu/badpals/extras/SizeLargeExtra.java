package edu.badpals.extras;

import edu.badpals.items.RetailPrice;
import edu.badpals.order.Comanda;

import java.util.Optional;

public class SizeLargeExtra extends Extra{

    public SizeLargeExtra(){};

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> SizeCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase("size_large"))
                .map(item -> RetailPrice.getPrice(Extra.SIZE_LARGE))
                .reduce(Double::sum);

        if (SizeCharge.isPresent()) {
            order.updateTotal(SizeCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}

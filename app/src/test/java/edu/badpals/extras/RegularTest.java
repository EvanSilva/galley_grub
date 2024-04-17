package edu.badpals.extras;

import edu.badpals.order.Order;
import edu.badpals.receipt.Receipt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularTest {

    Receipt receipt;
    Regular regular;
    Order order;

    @Test
    public void sum_extras_regular_test() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium");
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");

        receipt = new Receipt(order);

        regular = new Regular();
        receipt.setChain(regular);

        regular.sumExtras(order);
        assertEquals(6.75d, order.getTotal(), 0.1d);
    }

    @Test
    public void sum_regular_test() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafoam Soda", 1.00);

        receipt = new Receipt(order);

        regular = new Regular();
        receipt.setChain(regular);
        Regular regular = new Regular();
        regular.setNextExtra(regular);

        regular.sumExtras(order);
        assertEquals(6.75d, order.getTotal(), 0.1d);


    }

}
package edu.badpals.receipt;

import edu.badpals.extras.Extra;
import edu.badpals.order.Comanda;

import java.util.Map;

public class Receipt implements Ticket{

    private Double total = 0.0;
    private final Comanda order;
    private Extra firstExrta = null;


    public Receipt(Comanda order) {
        this.order = order;
        this.total = order.getTotal();
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public void setChain(Extra extra) {
        this.firstExrta = extra;
    }

    @Override
    public Extra getChain() {
        return this.firstExrta;
    }

    @Override
    public Double total() {
        return this.total;
    }

    @Override
    public void sumExtrasCharge() {
    }

    @Override
    public void print() {
        this.order.display();
        System.out.println("\t" + "Total -------->" + this.total + "$") ;

    }

}

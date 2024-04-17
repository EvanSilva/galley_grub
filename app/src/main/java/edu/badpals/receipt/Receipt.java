package edu.badpals.receipt;

import edu.badpals.extras.Extra;
import edu.badpals.order.Comanda;

public class Receipt implements Ticket{

    private Double total = 0.0;
    private final Comanda order;
    private Extra firstExtra = null;


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
        this.firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return this.firstExtra;
    }

    @Override
    public Double total() {
        if (this.total == 0.0) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal();
        }
        return this.total;
    }
1
    @Override
    void sumExtrasCharge() {
        if (this.firstExtra != null) {
            this.firstExtra.sumExtras(this.order);
        }
    }

    @Override
    public void print() {
        this.order.display();
        System.out.println("\t" + "Total -------->" + this.total() + "$") ;

    }

}

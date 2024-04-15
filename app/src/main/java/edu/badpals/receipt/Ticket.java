package edu.badpals.receipt;

import edu.badpals.extras.Extra;
import edu.badpals.order.Comanda;

public interface Ticket {


    public Comanda getOrder();

    public void setChain(Extra extra);

    public Extra getChain();

    public Double total();

    public void sumExtrasCharge();

    public void print();

}

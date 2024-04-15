package edu.badpals.order;

import edu.badpals.items.Item;

import java.util.List;

public interface Comanda {

    public void addItem (String nombre, double precio);

    public void addItem (String nombre, double precio, String extra);

    public int size ();

    public List<Item> itemList ();

    public Double getTotal ();

    public void updateTotal (Double total);
    public void display ();

}

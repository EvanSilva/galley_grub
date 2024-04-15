package edu.badpals.order;

import edu.badpals.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{

    private Double total = 0.0;
    private final List<Item> items = new ArrayList<Item>();

    public Order(){

    };

    @Override
    public void addItem(String nombre, double precio) {

    }

    @Override
    public void addItem(String nombre, double precio, String extra) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List<Item> itemList() {
        return null;
    }

    @Override
    public Double getTotal() {
        return null;
    }

    @Override
    public void updateTotal(Double total) {

    }

    @Override
    public void display() {

    }
}

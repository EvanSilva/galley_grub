package edu.badpals.order;

import edu.badpals.items.Item;
import edu.badpals.items.ItemFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Order implements Comanda{

    private Double total = 0.0;
    private final List<Item> items = new ArrayList<Item>();

    public Order(){

    };

    @Override
    public void addItem(String nombre, double precio) {
        Item item = new ItemFactory().getItem(nombre, precio);
        this.items.add(item);
    }

    @Override
    public void addItem(String nombre, double precio, String extra) {
        Item item = new ItemFactory().getItem(nombre, precio, extra);
        this.items.add(item);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    @Override
    public Double getTotal() {
        return this.total;
    }

    @Override
    public void updateTotal(Double total) {
        this.total += total;
    }

    @Override
    public void display() {
        StringBuilder display = new StringBuilder();
        display.append("\n\t --- ORDER ---  \n");
        for ( Item order : items){
            display.append("\t" + order+ "$"+ "\n");
        }
        display.toString();
        System.out.println(display);
    }
}

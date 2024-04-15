package edu.badpals.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static final Map<String, Item> itemMap = new HashMap<String, Item>();


    public ItemFactory() {};

    public static Item getItem(String nombre, double precio){
        itemMap.putIfAbsent(nombre, new Item(nombre,precio));
        return itemMap.get(nombre);
    }

    public static Item getItem(String nombre, double precio, String extra){

        itemMap.putIfAbsent(nombre + extra, new Item(nombre, precio, extra));
        return itemMap.get(nombre + extra);

    }

    public static int size(){
        return itemMap.size();
    }

    public static void clear(){
        itemMap.clear();
    }
}

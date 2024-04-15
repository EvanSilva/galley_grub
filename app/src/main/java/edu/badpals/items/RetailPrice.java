package edu.badpals.items;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class RetailPrice {

    static Map<String, Double> prices = new HashMap<>();

    public RetailPrice(){}

    public static void initPrices(){
        prices.put("large", 0.5);
        prices.put("sauce", 0.5);
        prices.put("medium", 0.25);
        prices.put("cheese", 0.25);

    }

    public static Double getPrice(String price){
        return prices.get(price);

    }

    public static boolean contains(String item){
         return prices.containsKey(item);

    }

    public static void display(){
        StringBuilder display = new StringBuilder();
         for (Map.Entry<String, Double> price : prices.entrySet()){
             display.append("\t" + price + "\n");
        }
         display.toString();
        System.out.println(display);

    }
}
package com.tts;
import java.util.*;

public class Hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("accord", "Honda");
        carMap.put("civic", "Honda");
        carMap.put("crv", "Honda");
        carMap.put("pilot", "Honda");
        carMap.put("hrv", "Honda");
        carMap.put("passport", "Honda");
        carMap.put("insight", "Honda");
        carMap.put("clarity", "Honda");
        carMap.put("fit", "Honda");
        carMap.put("odyssey", "Honda");
        carMap.put("ridgeline", "Honda");
        carMap.put("camry", "Toyota");
        carMap.put("corolla", "Toyota");
        carMap.put("rav4", "Toyota");
        carMap.put("highlander", "Toyota");
        carMap.put("prius", "Toyota");
        carMap.put("avalon", "Toyota");
        carMap.put("mirai", "Toyota");
        carMap.put("86", "Toyota");
        carMap.put("supra", "Toyota");
        carMap.put("sienna", "Toyota");
        carMap.put("tacoma", "Toyota");
        carMap.put("tundra", "Toyota");
        carMap.put("chr", "Toyota");
        carMap.put("venza", "Toyota");
        carMap.put("4runner", "Toyota");
        carMap.put("sequoia", "Toyota");
        carMap.put("land cruiser", "Toyota");
        carMap.put("sentra", "Nissan");
        carMap.put("altima", "Nissan");
        carMap.put("maxima", "Nissan");
        carMap.put("rogue", "Nissan");
        carMap.put("versa", "Nissan");
        carMap.put("leaf", "Nissan");
        carMap.put("gtr", "Nissan");
        carMap.put("370z", "Nissan");
        carMap.put("kicks", "Nissan");
        carMap.put("murano", "Nissan");
        carMap.put("pathfinder", "Nissan");
        carMap.put("armada", "Nissan");
        carMap.put("frontier", "Nissan");
        carMap.put("titan", "Nissan");
        System.out.println ("We have the largest selection of Hondas, Toyotas, and Nissans available!");
        System.out.println ("What car model are you looking for? " );
        String carModel = scanner.next();
        String carModelLower = carModel.toLowerCase();
        String model = carMap.get(carModelLower);
        if(model == null){
            System.out.println("Sorry we don't have that");
        } else {
            System.out.println("Our " + model + " selection is right this way!");
        }
    }
}



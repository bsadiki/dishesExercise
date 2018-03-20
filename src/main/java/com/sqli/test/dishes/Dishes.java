package com.sqli.test.dishes;

import java.util.HashMap;

public class Dishes {
    private HashMap<Integer, Dish> dishes;
    private final static String NO_SIGNAL = "No signal !";

    public Dishes(String... dishesInfos) {
        this.dishes = DishesFactory.createDishes(dishesInfos);
    }

    public String signal(String channel) {
        Integer signal = 0;
        for (Dish dish : dishes.values()){
            signal = Math.max(signal, dish.signalPower(SatelliteFactory.createSatellite(channel)));
        }
        return printSignal(signal);
    }

    public void move(String dishId, String deviationInfo) {
        Dish dish = this.dishes.get(Integer.parseInt(dishId));
        Double deviation = DishFactory.deviation(deviationInfo);
        if (deviation!=null)
            dish.move(deviation);
    }

    private String printSignal(Integer signal) {
        if (signal == 0)
            return NO_SIGNAL;
        else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("|");
            for (int i = 0; i < signal; i++){
                stringBuilder.append("*");
            }
            for (int i = signal; i < 10; i++){
                stringBuilder.append(".");
            }
            stringBuilder.append("|");
            return stringBuilder.toString();
        }

    }
}

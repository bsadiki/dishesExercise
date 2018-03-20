package com.sqli.test.dishes;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DishesFactory {
    private final static Pattern pattern = Pattern.compile("(\\d*),(.*)");

    static HashMap<Integer, Dish> createDishes(String... dishesInfos) {
        HashMap<Integer, Dish> dishes = new HashMap<>();
        for (String dishInfo : dishesInfos) {
            Matcher matcher = pattern.matcher(dishInfo);
            if(matcher.find()){
                dishes.put(Integer.parseInt(matcher.group(1)),DishFactory.createDish(matcher.group(2)));
            }
        }
        return dishes;
    }
}

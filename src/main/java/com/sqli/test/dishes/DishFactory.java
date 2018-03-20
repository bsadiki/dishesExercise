package com.sqli.test.dishes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DishFactory {
    private final static Pattern pattern = Pattern.compile("(.*)(W|E)");
    private final static String WEST = "W";
    private final static String EAST = "E";

    static Dish createDish(String dishInfo) {
        Matcher matcher = pattern.matcher(dishInfo);
        if (matcher.find()) {
            Double value = Double.parseDouble(matcher.group(1));
            if (matcher.group(2).equals(WEST))
                return new Dish(-value);
            else if (matcher.group(2).equals(EAST))
                return new Dish(value);
        }
        return null;
    }
    static Double deviation(String deviation){
        Matcher matcher = pattern.matcher(deviation);
        if (matcher.find()) {
            Double value = Double.parseDouble(matcher.group(1));
            if (matcher.group(2).equals(WEST))
                return -value;
            else if (matcher.group(2).equals(EAST))
                return value;
        }
        return null;
    }
}

package com.sqli.test.dishes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SatelliteFactory {
    private final static Pattern pattern = Pattern.compile("[\\w]*, (\\w)");
    static Satellite createSatellite(String channelAndSatellite){
        Matcher matcher = pattern.matcher(channelAndSatellite);
        if(matcher.find()){
            switch (matcher.group(1)) {
                case "A":
                    return Satellite.ASTRA;
                case "H":
                    return Satellite.HOTBIRD;
                case "N":
                    return Satellite.NILESAT;
            }
        }
        return null;
    }
}

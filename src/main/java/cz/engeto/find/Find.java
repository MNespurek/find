package cz.engeto.find;

import java.util.List;

public class Find {
    public static Double findMatching(List<Double> list, Double lowerLimit, Double upperLimit) {

        for(Double number : list) {
            if(number >= lowerLimit && number <= upperLimit) {
                return number;
            }
        }
        return null;

    }


}

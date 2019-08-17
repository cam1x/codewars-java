package com.company.kyu6;

import java.util.stream.Stream;

/*
    Condition: https://www.codewars.com/kata/59279aea8270cc30080000df
 */

public class FreewayGame {

    public static int freewayGame(final double distKmToExit, final double mySpeedKph, final double[][] otherCars) {
        double myTimeToExit = (distKmToExit % mySpeedKph) * 60 / mySpeedKph;

        long behind = Stream.of(otherCars).filter(car -> car[0] > 0).mapToDouble(car -> ((distKmToExit % car[1]) * 60 / car[1]) + car[0]).filter(timeToExit -> timeToExit < myTimeToExit).count();
        long ahead = Stream.of(otherCars).filter(car -> car[0] < 0).mapToDouble(car -> ((distKmToExit % car[1]) * 60 / car[1]) + car[0]).filter(timeToExit -> timeToExit > myTimeToExit).count();

        return (int) (ahead - behind);
    }
}

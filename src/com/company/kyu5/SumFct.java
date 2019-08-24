package com.company.kyu5;

import java.math.BigInteger;
import java.util.*;

/*
    Condition: https://www.codewars.com/kata/559a28007caad2ac4e000083
 */

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        List<BigInteger> sides=new ArrayList<>();
        sides.add(BigInteger.ONE);
        sides.add(BigInteger.ONE);
        BigInteger sum=BigInteger.valueOf(2);
        for (int i=2;i<=n.intValue();i++){
            sides.add(sides.get(i-1).add(sides.get(i-2)));
            sum=sum.add(sides.get(sides.size()-1));
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}

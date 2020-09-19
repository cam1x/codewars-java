package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
 */

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int[] cash = new int[]{0, 0, 0};

        for (int value : peopleInLine) {
            switch (value) {
                case 25 -> cash[0]++;
                case 50 -> {
                    cash[0]--;
                    cash[1]++;
                }
                case 100 -> {
                    if (cash[1] > 0) {
                        cash[1]--;
                    } else {
                        cash[0] -= 2;
                    }

                    cash[0]--;
                }
            }

            if (cash[0] < 0) {
                return "NO";
            }
        }

        return "YES";
    }
}

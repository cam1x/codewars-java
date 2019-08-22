package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/5384df88aa6fc164bb000e7d
 */

public class Player {
    public Player(int cakes) {
    }
    // Decide who move first - player or opponent (true if player)
    public boolean firstMove(int cakes) {
        return cakes != 1 && cakes % 4 != 2;
    }

    // Decide your next move
    public int move(int cakes, int last) {
        return cakes % 4 < 3 ? 3 : 1;
    }
}

package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/551dc350bf4e526099000ae5
 */

public class Dubstep {
    public static String SongDecoder (String song)
    {
        String[] decoded=song.split("(WUB)+");
        return String.join(" ",decoded).trim();
    }
}

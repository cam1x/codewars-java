package com.company.kyu5;

import java.util.*;
import java.util.regex.*;

/*
    Condition: https://www.codewars.com/kata/57c178e16662d0d932000120
 */

public class Bundesliga {
    public static String table(String[] results) {
        Pattern clubFinder=Pattern.compile("(\\d.\\s)?[A-Za-z][^\\-]+");
        Pattern scoreFinder=Pattern.compile("[\\d-]+");
        Matcher clubMatcher;
        Matcher scoreMatcher;

        List<Club> clubs=new ArrayList<>();
        for (int i=0;i<results.length;i++){
            clubMatcher=clubFinder.matcher(results[i]);
            scoreMatcher=scoreFinder.matcher(results[i]);
            clubMatcher.find();
            scoreMatcher.find();

            Club club1=new Club(clubMatcher.group().trim());
            if (scoreMatcher.group().trim().matches("\\d+")){
                club1.setScored(Integer.parseInt(scoreMatcher.group().trim()));
            }
            clubMatcher.find();
            scoreMatcher.find();

            Club club2=new Club(clubMatcher.group().trim());
            if (scoreMatcher.group().trim().matches("\\d+")){
                club2.setScored(Integer.parseInt(scoreMatcher.group().trim()));
            }

            if (club1.getScored()==-1 || club2.getScored()==-1){
                club1.setScored(0);
                club2.setScored(0);
                clubs.add(club1);
                clubs.add(club2);
                continue;
            }

            club1.setMissed(club2.getScored());
            club2.setMissed(club1.getScored());
            club1.intMatches();
            club2.intMatches();

            if (club1.getScored()>club2.getScored()){
                club1.setPoints(3);
            } else{
                if (club2.getScored()>club1.getScored()){
                    club2.setPoints(3);
                } else{
                    club1.setPoints(1);
                    club2.setPoints(1);
                }
            }

            clubs.add(club1);
            clubs.add(club2);
        }

        clubs.sort(((o1, o2) -> {return (o1.compareTo(o2)==0)?o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()):o1.compareTo(o2);}));

        StringBuilder table=new StringBuilder();

        int place=1;
        for (int i=0;i<clubs.size();i++){
            if (i>=1 && clubs.get(i).compareTo(clubs.get(i-1))==1){
                place=i+1;
            }
            table.append( ((place)>9?"":" ")+(place)+". "+clubs.get(i));
        }

        return table.deleteCharAt(table.length()-1).toString();
    }

    public static void main(String[] args) {
        String[] results = new String[]
                {
                        "5:3 FC Bayern Muenchen - Werder Bremen",
                        "3:4 Eintracht Frankfurt - Schalke 04",
                        "4:3 FC Augsburg - VfL Wolfsburg",
                        "2:2 Hamburger SV - FC Ingolstadt",
                        "3:4 1. FC Koeln - SV Darmstadt",
                        "3:3 Borussia Dortmund - FSV Mainz 05",
                        "1:3 Borussia Moenchengladbach - Bayer Leverkusen",
                        "5:3 Hertha BSC Berlin - SC Freiburg",
                        "0:1 TSG 1899 Hoffenheim - RasenBall Leipzig"
                };
        System.out.println(table(results));
    }
}

class Club implements Comparable<Club>{
    private String name;
    private int points;
    private int scored=-1;
    private int missed;
    private int matchesPlayed;

    Club(String name){
        this.name=name;
    }

    public void setPoints(int points){
        this.points=points;
    }

    public void setScored(int scored){
        this.scored=scored;
    }

    public void setMissed(int missed){
        this.missed=missed;
    }

    public void intMatches(){
        matchesPlayed++;
    }

    public int getPoints(){
        return points;
    }

    public int getScored(){
        return scored;
    }

    public int getMissed(){
        return missed;
    }

    public int getDifference(){
        return scored-missed;
    }

    public String getName(){
        return name;
    }

    public int getMatchesPlayed(){
        return matchesPlayed;
    }

    @Override
    public String toString(){
        return String.format("%-30s%1s  ",name,matchesPlayed+"") + (points==3?"1":"0")+"  "+
                (points==1?"1":"0") +"  "+ (points==0 && matchesPlayed>0?"1":"0") +"  " +scored+":"+missed+"  "+points+"\n";
    }

    @Override
    public int compareTo(Club o){
        if (points>o.points){
            return -1;
        }else{
            if (points<o.points){
                return 1;
            }
        }

        if (scored-missed>o.scored-o.missed){
            return -1;
        }else{
            if (scored-missed<o.scored-o.missed){
                return 1;
            }
        }

        if (scored>o.scored){
            return -1;
        }else {
            if (scored < o.scored) {
                return 1;
            }
        }

        return 0;
    }
}

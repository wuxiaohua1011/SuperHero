package com.michaelwu.listviewandsorting;

/**
 * Created by csaper6 on 1/19/17.
 */
public class Superhero implements Comparable<Superhero>{


    private String name,power;
    private int ranking;


    public Superhero(String name, String power, int ranking) {
        this.name = name;
        this.power = power;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


    @Override
    public int compareTo(Superhero other) {
                return this.ranking - other.ranking;
    }


}


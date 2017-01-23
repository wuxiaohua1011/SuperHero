package com.michaelwu.listviewandsorting;

import java.util.Comparator;

/**
 * Created by csaper6 on 1/23/17.
 */
public class HeroComparatorPower implements Comparator<Superhero> {
    @Override
    public int compare(Superhero superhero, Superhero t1) {
        return superhero.getPower().length()-t1.getPower().length();
    }
}

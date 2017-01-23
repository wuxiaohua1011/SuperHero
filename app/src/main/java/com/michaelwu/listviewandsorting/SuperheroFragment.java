package com.michaelwu.listviewandsorting;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by csaper6 on 1/19/17.
 */

public class SuperheroFragment extends ListFragment {
    private List<Superhero> heroes;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        heroes = new ArrayList<>();
        populate();
        Collections.sort(heroes, new HeroComparatorPower());

        HeroAdapter adapter = new HeroAdapter(getActivity(),heroes);
        setListAdapter(adapter);
        return rootView;
    }

    private void populate() {
        heroes.add(new Superhero("Michael Wu", "Never Die", 1));
        heroes.add(new Superhero("try1","try1p",2));
        heroes.add(new Superhero("moone","give hard test",0));
    }
}

package com.example.niki.fragmentst;

/**
 * Created by NIKI on 8/23/2016.
 */
public class DirectionsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recepies.directions[index].split("`");
    }
}

package com.example.niki.fragmentst;

/**
 * Created by NIKI on 8/23/2016.
 */
public class IngredientsFragment extends CheckboxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recepies.ingredients[index].split("`");
    }
}

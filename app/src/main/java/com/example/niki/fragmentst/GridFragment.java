package com.example.niki.fragmentst;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by NIKI on 8/23/2016.
 */
public class GridFragment extends Fragment {

    public interface onRecipeSelectedInterface {
        void onGridRecipeSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        onRecipeSelectedInterface listener = (onRecipeSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        GridAdapter gridAdapter = new GridAdapter(listener);
        recyclerView.setAdapter(gridAdapter);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int numColumns = (int) (dpWidth / 200);
        RecyclerView.LayoutManager  layoutManager = new GridLayoutManager(getActivity(), numColumns);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}

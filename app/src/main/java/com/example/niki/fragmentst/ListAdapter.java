package com.example.niki.fragmentst;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by NIKI on 8/22/2016.
 */
public class ListAdapter extends RecyclerAdapter {
    private final ListFragment.onRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.onRecipeSelectedInterface listener) {
        mListener = listener;
    }


    @Override
    protected void onRecipeSelected(int index) {
        mListener.onListRecipeSelected(index);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }
}

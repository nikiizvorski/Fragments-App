package com.example.niki.fragmentst;

/**
 * Created by NIKI on 8/23/2016.
 */
public class GridAdapter extends RecyclerAdapter{

    private final GridFragment.onRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.onRecipeSelectedInterface listener) {
        mListener = listener;
    }


    @Override
    protected void onRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }
}

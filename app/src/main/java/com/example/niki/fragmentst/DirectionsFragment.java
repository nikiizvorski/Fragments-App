package com.example.niki.fragmentst;

        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by NIKI on 8/23/2016.
 */
public class DirectionsFragment extends CheckboxesFragment {

    @Override
    public String[] getContents(int index) {
        return Recepies.directions[index].split("`");
    }
}

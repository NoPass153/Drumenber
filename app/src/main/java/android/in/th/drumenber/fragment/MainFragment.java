package android.in.th.drumenber.fragment;


import android.in.th.drumenber.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Student on 31/01/2561.
 */

public class MainFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }



} //Main Class

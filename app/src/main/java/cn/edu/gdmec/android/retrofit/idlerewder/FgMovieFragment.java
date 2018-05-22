package cn.edu.gdmec.android.retrofit.idlerewder;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.gdmec.android.retrofit.R;

/**
 * Created by apple on 18/5/22.
 */

public class FgMovieFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_movie_1,container,false);
    }
    @Override
    public void onViewCreated(View view,Bundle saveInstanceState){
        super.onViewCreated(view,saveInstanceState);

    }
}


package com.example.latte.delegates;

import android.icu.util.MeasureUnit;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;


/**
 * Created by W on 2018-09-20.
 */

public abstract class BaseDelegate extends SwipeBackFragment{

    private Unbinder mUnbinder = null;

    public abstract Object setLayout();

    public abstract void onBindView(@Nullable Bundle savedInstanceState,View rootView);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=null;
        if (setLayout() instanceof Integer){
            rootView=inflater.inflate((Integer) setLayout(),container,false);
        }else if (setLayout() instanceof View){
            rootView= (View) setLayout();
        }
        if(rootView!=null){
            mUnbinder = ButterKnife.bind(this,rootView);
            onBindView(savedInstanceState,rootView);

        }
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}

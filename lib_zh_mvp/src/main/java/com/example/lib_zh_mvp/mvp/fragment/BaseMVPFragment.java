package com.example.lib_zh_mvp.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lib_zh_mvp.mvp.view.IBaseView;

public abstract class BaseMVPFragment extends Fragment implements IBaseView {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = getLayout();
        return view;
    }

    protected abstract View getLayout();
}

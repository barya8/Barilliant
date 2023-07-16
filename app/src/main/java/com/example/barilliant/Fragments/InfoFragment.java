package com.example.barilliant.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.barilliant.R;
import com.google.android.material.textview.MaterialTextView;

public class InfoFragment extends Fragment {
    private MaterialTextView en_LBL_info;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_fragment, container, false);
        en_LBL_info = rootView.findViewById(R.id.en_LBL_info);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void setInfo(String info) {
        en_LBL_info.setText(info);
    }
}

package com.beast.botoneraraissiguier;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Pablo on 24/3/2016.
 */
public class MainFragment extends Fragment {

    MediaPlayer mMediaPlayer;

    public static MainFragment newInstance() {

        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(com.beast.botoneraraissiguier.R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(com.beast.botoneraraissiguier.R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(com.beast.botoneraraissiguier.R.raw.ptt_20160324_wa0032);
            }
        });

        view.findViewById(com.beast.botoneraraissiguier.R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(com.beast.botoneraraissiguier.R.raw.ptt_20160324_wa0033);
            }
        });

        view.findViewById(com.beast.botoneraraissiguier.R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(com.beast.botoneraraissiguier.R.raw.ptt_20160324_wa0034);
            }
        });

        view.findViewById(com.beast.botoneraraissiguier.R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(com.beast.botoneraraissiguier.R.raw.ptt_20160324_wa0035);
            }
        });
    }

    private void playSound(int resources){
        mMediaPlayer = MediaPlayer.create(getContext(), resources);
        mMediaPlayer.start();
    }
}

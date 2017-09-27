package com.example.classproject;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lizhiguo on 2017/9/22.
 */

public class ClassOneActivity extends Activity implements View.OnClickListener {
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_one);

        btn_1 = (Button) findViewById(R.id.bt_1_1);
        btn_2 = (Button) findViewById(R.id.bt_1_2);
        btn_3 = (Button) findViewById(R.id.bt_1_3);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1_1:
                mMediaPlayer = MediaPlayer.create(ClassOneActivity.this,R.raw.dao);
                mMediaPlayer.start();
                break;
            case R.id.bt_1_2:
                mMediaPlayer = MediaPlayer.create(ClassOneActivity.this,R.raw.fa);
                mMediaPlayer.start();
                break;
            case R.id.bt_1_3:
                mMediaPlayer = MediaPlayer.create(ClassOneActivity.this,R.raw.mi);
                mMediaPlayer.start();
                break;
        }
    }
}

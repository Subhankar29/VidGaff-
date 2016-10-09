package com.example.subhankar29.test2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class convertVid extends AppCompatActivity {

    VideoView v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_vid);

        v1= (VideoView) findViewById(R.id.converted_view);
        Intent i2 = getIntent();
        Bundle bundle = i2.getExtras();
        Object value = bundle.get("video1");
        v1.setVideoURI((Uri) value);
        v1.setMediaController(new MediaController(this));
        v1.requestFocus();
        v1.start();





    }
}

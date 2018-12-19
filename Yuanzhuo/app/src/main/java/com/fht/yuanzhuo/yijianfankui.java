package com.fht.yuanzhuo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class yijianfankui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yijianfankui);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent();
    intent.setClass(yijianfankui.this, yijianfinish.class);
     startActivity(intent);



        // Do something in response to button
    }
}

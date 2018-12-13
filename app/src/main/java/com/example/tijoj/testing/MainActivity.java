package com.example.tijoj.testing;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.textstuff);

        textView.setText("Starting log statements stuff");


        final Handler handler = new Handler();

        for(int i=0;i <1000;i++){
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    String text = "MOre logs";
                    textView.setText(text+"\n"+textView.getText());
                }
            },500*i);

        }


    }

}

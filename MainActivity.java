package com.example.sirius.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity // implements View.OnClickListener {
{
    // int seen = 0;

    //Button button = (Button)findViewById(R.id.button);
    //final ImageView imv1 = (ImageView)findViewById(R.id.imageView);
    //final ImageView imv2 = (ImageView)findViewById(R.id.imageView2);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //imv2.setVisibility(View.GONE);
    }



//    @Override
//    public void onClick(View v) {
//         button.setOnClickListener(this);
//
//        switch (v.getId()) {
//            case R.id.button:
//                if (seen == 0) {
//                    imv1.setVisibility(View.GONE);
//                    imv2.setVisibility(View.VISIBLE);
//                    seen++;
//                } else if (seen == 1) {
//                    imv2.setVisibility(View.GONE);
//                    imv1.setVisibility(View.VISIBLE);
//                    seen--;
//                }
//        }
//    }

}

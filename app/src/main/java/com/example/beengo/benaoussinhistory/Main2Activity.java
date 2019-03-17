package com.example.beengo.benaoussinhistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       int images [] = {R.drawable.tel4, R.drawable.tel9, R.drawable.tel6, R.drawable.tel5, R.drawable.tel2};
        v_flipper = findViewById(R.id.v_flipper);
      /* for (int i = 0; i < images.length; i++){
           flipperImages(images[i]);
       }*/
      for (int image: images) {
          flipperImages(image);
      }

    }
    public void flipperImages (int image){
        ImageView imageView = new ImageView(this);
        imageView .setBackgroundResource(image);
        v_flipper .addView(imageView);
        v_flipper .setFlipInterval(4000);
        v_flipper .setAutoStart(true);

        v_flipper .setOutAnimation(this,android.R.anim.slide_out_right);
        }









}
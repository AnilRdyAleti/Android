package com.logcat.anilreddy.androidapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends ActionBarActivity {

   // private static final String TAG = MainActivity.class.getSimpleName();

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//For inner class onclicklistener
        //FButton = (Button) findViewById(R.id.FirstButton);
        //FButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  FButton.setText("First Button Cliked");
            //}
        //});

     //   SButton = (Button) findViewById(R.id.SecondButton);
       // SButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View v) {
          //      SButton.setText("Sceond Button Cliked");
       //     }
//        });

// For implements View.OnClickListener
       // FButton = (Button) findViewById(R.id.FirstButton);
        //FButton.setOnClickListener(MainActivity.this);
       // SButton = (Button) findViewById(R.id.SecondButton);
       // FButton.setOnClickListener(MainActivity.this);
   // }
   // @Override
   // public void onClick(View v) {

      //  switch (v.getId())
       // {
       //     case  R.id.FirstButton:
              //  Log.d(TAG,"First Button Clicked ");
              //  break;

          //  case R.id.SecondButton:
          //      Log.d(TAG,"Second Button Clicked ");
          //      break;
      //  }

        // onclick on XML
        public void Clickevent(View v)
        {
            switch (v.getId())
             {
                 case  R.id.FirstButton:
              Log.d("S","First Button Clicked ");
              break;

              case R.id.SecondButton:
                Log.d("S","Second Button Clicked ");
                  break;
              }
        }
}

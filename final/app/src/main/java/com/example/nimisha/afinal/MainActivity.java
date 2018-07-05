package com.example.nimisha.afinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent int1 = new Intent(getApplicationContext(), Splash_Screen.class);
        startActivity(int1);



        //Intent cspace = new Intent(getApplicationContext(), activity2.class);
       // startActivity(cspace);
    }


}

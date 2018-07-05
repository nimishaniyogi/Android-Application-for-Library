package com.example.nimisha.afinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Landing_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__page);



    }

    public void read_more(View view){
        Intent int3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libraries.wichita.edu/ablah/index.php/10-general/194-ablah"));
        startActivity(int3);
    }

    public void servicesoflib(View view)
    {
        Intent int4 = new Intent(getApplicationContext(), Library_srv.class);
        startActivity(int4);

    }


}

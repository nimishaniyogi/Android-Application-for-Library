package com.example.nimisha.afinal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Srv_of_cspace extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srv_of_cspace);

    }


    public void gotoprinting(View view) {
        Intent print = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/creationspace/3Dprinting"));
        startActivity(print);
    }

    public void gotodevelopment(View view) {
        Intent development = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2721330"));
        startActivity(development);
    }

    public void gotodesign(View view) {
        Intent design = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2721327"));
        startActivity(design);
    }

    public void gotoOS_zone(View view) {
        Intent os_zone = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2721329"));
        startActivity(os_zone);
    }

    public void gotosound_booth(View view) {
        Intent sound_booth = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2760052"));
        startActivity(sound_booth);
    }

    public void gotoresources(View view) {
        Intent resources = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2761059"));
        startActivity(resources);
    }

    public void gotocolor_printing(View view) {
        Intent color_print = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2687350"));
        startActivity(color_print);
    }

    public void gotohours(View view) {
        Intent hours = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2613301"));
        startActivity(hours);
    }

    public void gotohelp(View view) {
        Intent help = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2737347"));
        startActivity(help);
    }

    public void gotofeedback(View view) {
        Intent feedback = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=120017&p=2753632"));
        startActivity(feedback);
    }

    public void gotohome(View view) {
        Intent srv = new Intent(getApplicationContext(), Library_srv.class);
        startActivity(srv);
    }


    public void gototest(View view){
        Intent test = new Intent(getApplicationContext(), test.class);
        startActivity(test);
    }
}
package com.example.nimisha.afinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Library_srv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_srv);

    }

    public void gotocatalog(View view) {
        Intent cat = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libcat.wichita.edu/vwebv/searchBasic"));
        startActivity(cat);

    }
    public void gotocspace(View view) {
        System.out.println("TST__Start TEst");
        try {
            Intent startActivity = new Intent();
            startActivity.setClass(getApplicationContext(), cspace_test.class);
            startActivity.setAction(cspace_test.class.getName());
            startActivity.setFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                            | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            getApplicationContext().startActivity(startActivity);
        } catch (Exception e) {
            System.out.println("End Test:::" +e.getMessage());
        }
    }
    public void community_centre(View view) {
        Intent int6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=579046&p=3996233"));
        startActivity(int6);
    }
    public void gotocollection(View view){
        Intent research = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/c.php?g=464279&p=3218654"));
        startActivity(research);
    }
    public void music(View view) {
        Intent int8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/musiclibrary"));
        startActivity(int8);

    }
    public void chem_library(View view) {
        Intent int8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/Chemistry"));
        startActivity(int8);

    }
    public void study_room(View view) {
        Intent study_room = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wichita.libcal.com/booking/studyrooms"));
        startActivity(study_room);
    }
    public void seminar_room(View view) {
        Intent seminar_room = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wichita.libcal.com/booking/seminarrooms"));
        startActivity(seminar_room);
    }
    public void more_options(View view) {
        Intent more_options = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libraries.wichita.edu/ablah/"));
        startActivity(more_options);
    }
    public void gotoloan(View view) {
        Intent loan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libraries.wichita.edu/ablah/index.php?id=5"));
        startActivity(loan);
    }
    public void gotolibhours(View view){
        Intent hours = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/hours"));
        startActivity(hours);
    }
    public void gotocomp(View view){
        Intent availability = new Intent(Intent.ACTION_VIEW, Uri.parse("http://websvc-310.ad.wichita.edu/cats/"));
        startActivity(availability);
    }
    public void gotoevents(View view){
        Intent availability = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wichita.libcal.com/calendar/events/?cid=2293&t=d&d=0000-00-00&cal%5B%5D=2293"));
        startActivity(availability);
    }
    public void gotosearch(View view) {
        Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eds.a.ebscohost.com/eds/search/advanced?vid=0&sid=3c21cee7-bc46-4c0e-9569-d4fc737c67a5%40sessionmgr4006"));
        startActivity(search);

    }
    public void gotoLib_guides(View view) {
        Intent lib_guide = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/library-technologies"));
        startActivity(lib_guide);

    }

    public void gotocirculation(View view) {
        Intent circulation = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/Circulation/libservices"));
        startActivity(circulation);

    }

    public void gotodirectory(View view) {
        Intent directory = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/directory"));
        startActivity(directory);

    }
}



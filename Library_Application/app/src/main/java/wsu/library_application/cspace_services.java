package wsu.library_application;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class cspace_services extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cspace_services);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void gotomondayworkshop(View view){

        Intent workshop = new Intent(getApplicationContext(), monday_workshop.class);
        startActivity(workshop);
    }

    public void gototechtuesday(View view){

        Intent tech = new Intent(getApplicationContext(), tech_tuesday.class);
        startActivity(tech);
    }

    public void gotomulti_os(View view){

        Intent multi = new Intent(getApplicationContext(), Multi_os.class);
        startActivity(multi);
    }

    public void gotomedia_zone(View view){

        Intent media = new Intent(getApplicationContext(), media_zone.class);
        startActivity(media);
    }

    public void gotoadvance(View view){
        Intent advance = new Intent(getApplicationContext(), advance_zone.class);
        startActivity(advance);
    }

    public void gotosound_booth(View view){
        Intent booth = new Intent(getApplicationContext(), sound_booth4.class);
        startActivity(booth);
    }


    public void gotoprint_scan(View view){
        Intent booth = new Intent(getApplicationContext(), print_scan.class);
        startActivity(booth);
    }

    public void gotoprint(View view){
        Intent color_print = new Intent(getApplicationContext(), color_print.class);
        startActivity(color_print);
    }

    public void gotohours(View view){
        Intent time = new Intent(getApplicationContext(), Timings.class);
        startActivity(time);
    }

    public void gotofeedback(View view){
        Intent feedback_cspace = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdI1vX6JGA8qEbDrvDqjYpN829hlijY8TqR7lnbk_pvo7pg-w/viewform?c=0&w=1"));
        startActivity(feedback_cspace);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.home:
                intent = new Intent(getApplicationContext(), LandingPageActivity.class);
                break;
            case R.id.offcampus:
                intent = new Intent(getApplicationContext(), off_campus_users.class);
                break;
            case R.id.facultyToolbox:
                intent = new Intent(getApplicationContext(), toolbox.class);
                break;
            case R.id.studentToolbox:
                intent = new Intent(getApplicationContext(), toolbox.class);
                break;
        }

        if (intent != null) {
            startActivity(intent);
            drawerLayout.closeDrawers();
        }

        return true;
    }





}

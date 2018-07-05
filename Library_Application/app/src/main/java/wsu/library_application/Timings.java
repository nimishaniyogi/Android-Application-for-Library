package wsu.library_application;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Timings extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timings);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goto_time(View view) {
        Intent time = new Intent(Intent.ACTION_VIEW, Uri.parse("http://libresources.wichita.edu/hours"));
        startActivity(time);

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

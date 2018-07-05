package com.example.nimisha.afinal;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cspace_test extends AppCompatActivity {


   // private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cspace_test);
      /* b1 = (Button) findViewById(R.id.serv_1);
       b1.setOnClickListener(new View.OnClickListener(){

           public void onClick(View view){
               Intent int10 = new Intent(getApplicationContext(), Srv_of_cspace.class);
               startActivity(int10);
           }
       });
*/
    }

    public void srv_c_space(View view){
        Intent srv = new Intent(getApplicationContext(), Srv_of_cspace.class);
        startActivity(srv);

    }


    public void gotostaff(View view) {
        Intent staff = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/10rDACjSn75qeol0QQRwFGsn7rXSYx6M7MBGFFwVo_lI/edit"));
        startActivity(staff);
    }
}

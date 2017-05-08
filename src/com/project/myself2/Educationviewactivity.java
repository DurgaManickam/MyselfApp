package com.project.myself2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;


public class Educationviewactivity extends SherlockActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.educationviewactivity);
		
		//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("EDUCATION - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
		
		Variable variable = new Variable();
    	
        TextView sslcmarkview = (TextView) findViewById(R.id.sslcmarktextView);
        TextView sslcpercentageview = (TextView) findViewById(R.id.sslcpercentagetextView);
        TextView hscmarkview = (TextView) findViewById(R.id.hsc_marktextView);
        TextView hscpercentageview = (TextView) findViewById(R.id.hscpercentagetextView);
        TextView degreeview = (TextView) findViewById(R.id.degreetextView);
        TextView degreegradepointview = (TextView) findViewById(R.id.degreegradepointtextView);
        
      
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
        
        
        sslcmarkview.setText(preferences.getString("SSLC", Variable.sslcmark));
 		hscmarkview.setText(preferences.getString("HSC", Variable.hscmark));
 		sslcpercentageview.setText(preferences.getString("SSLCPERCENT", Variable.sslcpercentage));
 		hscpercentageview.setText(preferences.getString("HSCPERCENT", Variable.hscpercentage));
 		degreeview.setText(preferences.getString("DEGREE", Variable.degree));
 		degreegradepointview.setText(preferences.getString("DEGREEPOINT", Variable.degreegradepoint));
 		
 		//remove the application icon from title bar
        actionBar.setDisplayShowHomeEnabled(true);
     }
          
	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getSupportMenuInflater();
	    inflater.inflate(R.menu.style1,menu);
	    return true;
	    } 


	@Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // action with ID action_refresh was selected
	    case R.id.ic_action_edit:startActivity(new Intent(Educationviewactivity.this, Educationeditactivity.class));
	      break;
	    }
	    return true;
	  } 
  

}

   				
   	
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


public class Biodataviewactivity extends SherlockActivity {
	 
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
			
			
	    	super.onCreate(savedInstanceState);
	    	setContentView(R.layout.biodataviewactivity);
	    	
	    	
	    	//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("BIODATA - VIEW");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
	    	
	    		    	
	    	Variable variable = new Variable(); 
	    	
	        TextView nameview = (TextView) findViewById(R.id.nametextView);
	        TextView DOBview = (TextView) findViewById(R.id.dobtextView);
	        TextView ageview = (TextView) findViewById(R.id.agetextView);
	        TextView addressview = (TextView) findViewById(R.id.addresstextView);
	        TextView contact1view = (TextView) findViewById(R.id.contact_notextView);
	        TextView bloodgroupview = (TextView) findViewById(R.id.bloodgrouptextView);
	        TextView hometownview = (TextView) findViewById(R.id.hometowntextView);
	        TextView emergency1view = (TextView) findViewById(R.id.emergency1textView);
	        TextView emergency2view = (TextView) findViewById(R.id.emergency2textView);
	        	
	        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
	     	
	           nameview.setText(preferences.getString("NAME",Variable.name));
	           DOBview.setText(preferences.getString("DOB",Variable.dob));
	           ageview.setText(preferences.getString("AGE",Variable.age));
	           addressview.setText(preferences.getString("ADDRESS",Variable.address));
	           contact1view.setText(preferences.getString("CONTACT",Variable.contactno));
	           bloodgroupview.setText(preferences.getString("BLOOD",Variable.bloodgroup));
	           hometownview.setText(preferences.getString("HOME",Variable.hometown));
	           emergency1view.setText(preferences.getString("E1",Variable.emergencycontact1));
	           emergency2view.setText(preferences.getString("E2",Variable.emergencycontact2));      
	           
	           
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
		    case R.id.ic_action_edit:startActivity(new Intent(Biodataviewactivity.this, Biodataeditactivity.class));
		      break;
		    }
		    return true;
		  } 
	    

}

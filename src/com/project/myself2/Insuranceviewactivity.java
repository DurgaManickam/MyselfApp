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


public class Insuranceviewactivity extends SherlockActivity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.insuranceviewactivity);
    	
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("INSURANCE - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
    	         
    	Variable variable = new Variable();
    	
        TextView insurancetypeview = (TextView) findViewById(R.id.insurance_typetextView);
        TextView periodview = (TextView) findViewById(R.id.insurance_periodtextView);
        TextView policynumberview = (TextView) findViewById(R.id.policy_numbertextView);
        TextView policydetailsview = (TextView) findViewById(R.id.policy_detailstextView);

        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
        
           insurancetypeview .setText(preferences.getString("INSURANCE",Variable.insurancetype));
           periodview .setText(preferences.getString("PERIOD",Variable.period));
           policynumberview .setText(preferences.getString("POLICYNO",Variable.policynumber));
           policydetailsview .setText(preferences.getString("POLICYDETAILS",Variable.policydetails));
           
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
	    case R.id.ic_action_edit:startActivity(new Intent(Insuranceviewactivity.this, Insuranceeditactivity.class));
	      break;
	    }
	    return true;
	  } 
  

}

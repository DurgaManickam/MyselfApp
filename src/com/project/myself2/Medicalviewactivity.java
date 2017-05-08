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

public class Medicalviewactivity extends SherlockActivity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.medicalviewactivity);
    	         
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("MEDICAL - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
	           
    	Variable variable = new Variable();
    	
        TextView diseasenameview = (TextView) findViewById(R.id.diseasenametextView);
        TextView hospitalnameview = (TextView) findViewById(R.id.hospitalnametextView);
        TextView doctornameview = (TextView) findViewById(R.id.doctornametextView);
        TextView contact_noview = (TextView) findViewById(R.id.contactnumbertextView);
        TextView heightview = (TextView) findViewById(R.id.heighttextView);
        TextView weightview = (TextView) findViewById(R.id.weighttextView);
        TextView eyepowerview = (TextView) findViewById(R.id.eyepowertextView);
        TextView shouldersizeview = (TextView) findViewById(R.id.shouldersizetextView);
        TextView foodallergyview = (TextView) findViewById(R.id.foodallergytextView);
        TextView med_allergyview = (TextView) findViewById(R.id.allergicmedicinetextView);
  
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
        
        
        
           diseasenameview.setText(preferences.getString("DISEASE",Variable.diseasename));
           hospitalnameview.setText(preferences.getString("HOSPITAL",Variable.hospitalname));
           doctornameview.setText(preferences.getString("DOCTOR",Variable.doctorname));
           contact_noview.setText(preferences.getString("CONTACT",Variable.contact_no));
           heightview.setText(preferences.getString("HEIGHT",Variable.height));
           weightview.setText(preferences.getString("WEIGHT",Variable.weight));
           eyepowerview.setText(preferences.getString("EYEPOWER",Variable.eyepower));
           shouldersizeview.setText(preferences.getString("SHOULDER",Variable.shouldersize));
           foodallergyview .setText(preferences.getString("FOOD",Variable.foodallergy));
           med_allergyview.setText(preferences.getString("MED",Variable.med_allergy));
         
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
	    case R.id.ic_action_edit:startActivity(new Intent(Medicalviewactivity.this, Medicaleditactivity.class));
	      break;
	    }
	    return true;
	  } 
    
}


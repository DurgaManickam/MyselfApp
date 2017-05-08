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

public class Vehicleviewactivity extends SherlockActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.vehicleviewactivity);
    	
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("VEHICLE - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
    	
    	Variable variables = new Variable();
    	
        TextView vehnametextview = (TextView) findViewById(R.id.textViewm18);
        TextView vehnumbertextview = (TextView) findViewById(R.id.textViewm19);
        TextView licensetextview = (TextView) findViewById(R.id.textViewm20);
        TextView purchasedatetextview = (TextView) findViewById(R.id.textViewm21);
        TextView Amounttextview = (TextView) findViewById(R.id.textViewm22);
        TextView installmenttextview = (TextView) findViewById(R.id.textViewm23);
        TextView Servicestextview = (TextView) findViewById(R.id.textViewm24);
        TextView Engine_Notextview = (TextView) findViewById(R.id.textViewm25);
        TextView chasis_Notextview = (TextView) findViewById(R.id.textViewm26);
        
        
        
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
        
    	vehnametextview.setText(preferences.getString("VEHICLENAME",Variable.vehname));
 		vehnumbertextview.setText(preferences.getString("NAME",Variable.vehnumber));
 		licensetextview.setText(preferences.getString("LICENSE",Variable.license));
 		purchasedatetextview.setText(preferences.getString("PURDATE",Variable.purchasedate));
 		Amounttextview.setText(preferences.getString("AMT",Variable.Amount));
 		installmenttextview.setText(preferences.getString("INSTAL",Variable.installment));
 		Servicestextview.setText(preferences.getString("SERVICES",Variable.Services));
 		Engine_Notextview.setText(preferences.getString("ENGINE",Variable.Engine_No));
 		chasis_Notextview.setText(preferences.getString("CHASIS",Variable.chasis_No));
          


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
   		    case R.id.ic_action_edit:startActivity(new Intent(Vehicleviewactivity.this, Vehicleeditactivity.class));
   		      break;
   		    }
   		    return true;
   		  } 
   	}

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

public class Taxviewactivity extends SherlockActivity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.taxviewactivity);
    	         
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("TAX - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
	           
    	Variable variable = new Variable();
    	
        TextView taxtypetextview = (TextView) findViewById(R.id.tax_typetextView);
        TextView assessmentnumbertextview = (TextView) findViewById(R.id.assess_numbertextView);
        TextView nextpaymenttextview = (TextView) findViewById(R.id.nextdue_datetextView);
        
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);     
        
        
           taxtypetextview.setText(preferences.getString("TAX",Variable.taxtype));
           assessmentnumbertextview.setText(preferences.getString("ASSESS",Variable.assessmentnumber));
           nextpaymenttextview.setText(preferences.getString("NEXT",Variable.nextpayment));
           
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
	    case R.id.ic_action_edit:startActivity(new Intent(Taxviewactivity.this, Taxeditactivity.class));
	      break;
	    }
	    return true;
	  } 

}

           
    
          
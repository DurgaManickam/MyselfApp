package com.project.myself2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class Educationeditactivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.educationeditactivity);
		
		final Variable variable = new Variable();
			
	        final EditText sslcmarkeditview=(EditText) findViewById(R.id.sslcmarkedit);
	        final EditText sslcpercentageeditview=(EditText)findViewById(R.id.sslcpercentageedit);
	        final EditText hscmarkeditview=(EditText) findViewById(R.id.hscmarkedit);
        	final EditText hscpercentageeditview=(EditText)findViewById(R.id.hscpercentageedit);
        	final EditText degreeeditview=(EditText)findViewById(R.id.degreeedit);
        	final EditText degreegradepointeditview=(EditText)findViewById(R.id.degreegradepointedit);
        	
        
        	 SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
        	 
        	sslcmarkeditview.setText(preferences.getString("SSLC", Variable.sslcmark));
     		hscmarkeditview.setText(preferences.getString("HSC", Variable.hscmark));
     		sslcpercentageeditview.setText(preferences.getString("SSLCPERCENT", Variable.sslcpercentage));
     		hscpercentageeditview.setText(preferences.getString("HSCPERCENT", Variable.hscpercentage));
     		degreeeditview.setText(preferences.getString("DEGREE", Variable.degree));
     		degreegradepointeditview.setText(preferences.getString("DEGREEPOINT", Variable.degreegradepoint));
     		
     		//Change the title of the action bar
        	ActionBar actionBar = getSupportActionBar();
        	actionBar.setTitle("EDUCATION - EDIT");
            
    	       //remove the application icon from title bar
    	           actionBar.setDisplayShowHomeEnabled(false);
    }
    		      
    		@Override
    		protected void onPause() {
    				super.onPause();
    			
    				SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
    				SharedPreferences.Editor editor = preferences.edit();
    				
    				Variable variable = new Variable();
    				
    				editor.putString("SSLC",Variable.sslcmark);
    				editor.putString("HSC",Variable.hscmark);
    				editor.putString("SSLCPERCENT",Variable.sslcpercentage);
    				editor.putString("HSCPERCENT",Variable.hscpercentage);
    				editor.putString("DEGREE",Variable.degree);
    				editor.putString("DEGREEPOINT",Variable.degreegradepoint);		 		
    				editor.commit();
    		   }
    		
    		@Override
    		  public boolean onCreateOptionsMenu(Menu menu) {
    		    MenuInflater inflater = getSupportMenuInflater();
    		    inflater.inflate(R.menu.style2,  menu);
    		    return true;
    		    } 
    	
    		@Override
    		  public boolean onOptionsItemSelected(MenuItem item) {
    		    
    		
    		    if(item.getItemId() == R.id.accept){
    		    	
    		    	final Variable variable = new Variable();
    				
    		        final EditText sslcmarkeditview=(EditText) findViewById(R.id.sslcmarkedit);
    		        final EditText sslcpercentageeditview=(EditText)findViewById(R.id.sslcpercentageedit);
    		        final EditText hscmarkeditview=(EditText) findViewById(R.id.hscmarkedit);
    	        	final EditText hscpercentageeditview=(EditText)findViewById(R.id.hscpercentageedit);
    	        	final EditText degreeeditview=(EditText)findViewById(R.id.degreeedit);
    	        	final EditText degreegradepointeditview=(EditText)findViewById(R.id.degreegradepointedit);
    	        	
    	        	Variable.sslcmark = sslcmarkeditview.getText().toString();
    		 		Variable.hscmark = hscmarkeditview.getText().toString();
    		 		Variable.sslcpercentage = sslcpercentageeditview.getText().toString();
    		 		Variable.hscpercentage = hscpercentageeditview.getText().toString();
    		 		Variable.degree = degreeeditview.getText().toString();
    		 		Variable.degreegradepoint = degreegradepointeditview.getText().toString();
    		    	
    		 		Toast.makeText(Educationeditactivity.this, "Record Inserted",500000).show();
    		 		startActivity(new Intent(Educationeditactivity.this, Educationviewactivity.class));			 	 			    
	    }	    
	        
		return true;
	  } 
 
	
}
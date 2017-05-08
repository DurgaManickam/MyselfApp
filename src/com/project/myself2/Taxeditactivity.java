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

public class Taxeditactivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.taxeditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText taxtypeeditview=(EditText) findViewById(R.id.taxtypeedit);
	           final EditText assessmentnumbereditview=(EditText)findViewById(R.id.assessmentnumberedit);
	           final EditText nextpaymenteditview=(EditText)findViewById(R.id.nextpaymentedit);
	           	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
			
	 		taxtypeeditview.setText(preferences.getString("TAX",Variable.taxtype));
	 		assessmentnumbereditview.setText(preferences.getString("ASSESS",Variable.assessmentnumber));
	 		nextpaymenteditview.setText(preferences.getString("NEXT",Variable.nextpayment));

			//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("TAX - EDIT");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
}

			@Override
				protected void onPause() {
					super.onPause();
	
					SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
					SharedPreferences.Editor editor = preferences.edit();
	
					Variable variable = new Variable();
	
					editor.putString("TAX",Variable.taxtype);
					editor.putString("ASSESS",Variable.assessmentnumber);
					editor.putString("NEXT",Variable.nextpayment);
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
	  					
					 	 final EditText taxtypeeditview=(EditText) findViewById(R.id.taxtypeedit);
					 	 final EditText assessmentnumbereditview=(EditText)findViewById(R.id.assessmentnumberedit);
					 	 final EditText nextpaymenteditview=(EditText)findViewById(R.id.nextpaymentedit);
			    	
						Variable.taxtype = taxtypeeditview.getText().toString();
				 		Variable.assessmentnumber = assessmentnumbereditview.getText().toString();
				 		Variable.nextpayment = nextpaymenteditview.getText().toString();
				 		
				 		
				         Toast.makeText(Taxeditactivity.this, "Record Inserted",500000).show();
				         startActivity(new Intent(Taxeditactivity.this, Taxviewactivity.class));	 				    
				    }	    
				        
					return true;
				  } 
			  
}


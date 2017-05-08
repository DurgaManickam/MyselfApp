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

public class Medicaleditactivity extends SherlockActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.medicaleditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText diseasenameeditview=(EditText) findViewById(R.id.diseasenameedit);
	           final EditText hospitalnameeditview=(EditText)findViewById(R.id.hospitalnameedit);
	           final EditText doctornameeditview=(EditText)findViewById(R.id.doctornameedit);
	           final EditText contact_noeditview=(EditText)findViewById(R.id.contact_noedit);
	           final EditText heighteditview=(EditText)findViewById(R.id.heightedit);
	           final EditText weighteditview=(EditText)findViewById(R.id.weightedit);
	           final EditText eyepowereditview=(EditText)findViewById(R.id.eyepoweredit);
	           final EditText shouldersizeeditview=(EditText)findViewById(R.id.shouldersizeedit);
	           final EditText foodallergyeditview=(EditText)findViewById(R.id.foodallergyedit);
	           final EditText med_allergyeditview=(EditText)findViewById(R.id.med_allergyedit);
	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
			
	 		diseasenameeditview.setText(preferences.getString("DISEASE",Variable.diseasename));
	 		hospitalnameeditview.setText(preferences.getString("HOSPITAL",Variable.hospitalname));
	 		doctornameeditview.setText(preferences.getString("DOCTOR", Variable.doctorname));
	 		contact_noeditview.setText(preferences.getString("CONTACT", Variable.contact_no));
	 		heighteditview.setText(preferences.getString("HEIGHT",Variable.height));
	 		weighteditview.setText(preferences.getString("WEIGHT",Variable.weight));
	 		eyepowereditview.setText(preferences.getString("EYEPOWER",Variable.eyepower));
	 		shouldersizeeditview.setText(preferences.getString("SHOULDER",Variable.shouldersize));
	 		foodallergyeditview.setText(preferences.getString("FOOD",Variable.foodallergy));
	 		med_allergyeditview.setText(preferences.getString("MED",Variable.med_allergy));
	 		
	 		 
			//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("MEDICAL - EDIT");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
}

			@Override
				protected void onPause() {
						super.onPause();
							
						SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
						SharedPreferences.Editor editor = preferences.edit();
						
						Variable variable = new Variable();
		           		
						editor.putString("DISEASE",Variable.diseasename);
						editor.putString("HOSPITAL",Variable.hospitalname);
						editor.putString("DOCTOR",Variable.doctorname);
						editor.putString("CONTACT",Variable.contactno);
						editor.putString("HEIGHT",Variable.height);
						editor.putString("WEIGHT",Variable.weight);
						editor.putString("EYEPOWER",Variable.eyepower);
						editor.putString("DOCTOR",Variable.doctorname);
						editor.putString("SHOULDER",Variable.shouldersize);
						editor.putString("FOOD",Variable.foodallergy);
						editor.putString("MED",Variable.med_allergy);
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
						
					   final EditText diseasenameeditview=(EditText) findViewById(R.id.diseasenameedit);
			           final EditText hospitalnameeditview=(EditText)findViewById(R.id.hospitalnameedit);
			           final EditText doctornameeditview=(EditText)findViewById(R.id.doctornameedit);
			           final EditText contact_noeditview=(EditText)findViewById(R.id.contact_noedit);
			           final EditText heighteditview=(EditText)findViewById(R.id.heightedit);
			           final EditText weighteditview=(EditText)findViewById(R.id.weightedit);
			           final EditText eyepowereditview=(EditText)findViewById(R.id.eyepoweredit);
			           final EditText shouldersizeeditview=(EditText)findViewById(R.id.shouldersizeedit);
			           final EditText foodallergyeditview=(EditText)findViewById(R.id.foodallergyedit);
			           final EditText med_allergyeditview=(EditText)findViewById(R.id.med_allergyedit);
			           
						Variable.diseasename = diseasenameeditview.getText().toString();
				 		Variable.hospitalname = hospitalnameeditview.getText().toString();
				 		Variable.doctorname = doctornameeditview.getText().toString();
				 		Variable.contact_no = contact_noeditview.getText().toString();
				 		Variable.height = heighteditview.getText().toString();
				 		Variable.weight = weighteditview.getText().toString();
				 		Variable.eyepower = eyepowereditview.getText().toString();
				 		Variable.shouldersize = shouldersizeeditview.getText().toString();
				 		Variable.foodallergy = foodallergyeditview.getText().toString();
				 		Variable.med_allergy = med_allergyeditview.getText().toString();
				 	
				 		 Toast.makeText(Medicaleditactivity.this, "Record Inserted",500000).show();
				 		startActivity(new Intent(Medicaleditactivity.this, Medicalviewactivity.class)); 				    
				    }	    
				        
					return true;
				  } 
			  
				
			}
					     
							
			


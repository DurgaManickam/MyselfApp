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



public class Biodataeditactivity extends SherlockActivity {
	     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.biodataeditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText Name=(EditText) findViewById(R.id.nameedit);
	           final EditText DOB=(EditText)findViewById(R.id.dobedit);
	           final EditText age=(EditText)findViewById(R.id.ageedit);
	           final EditText address=(EditText)findViewById(R.id.addressedit);
	           final EditText contact1=(EditText)findViewById(R.id.contact1edit);
	           final EditText bloodgroup=(EditText)findViewById(R.id.bloodgroupedit);
	           final EditText hometown=(EditText)findViewById(R.id.hometownedit);
	           final EditText emergency1=(EditText)findViewById(R.id.emergencycontact1edit);
	           final EditText emergency2=(EditText)findViewById(R.id.emergencycontact2edit);
	           
	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
	     	  
	   		   Name.setText(preferences.getString("NAME", Variable.name));
	   		   DOB.setText(preferences.getString("DOB",Variable.dob));
	   		   age.setText(preferences.getString("AGE",Variable.age));
	           address.setText(preferences.getString("ADDRESS",Variable.address));
	           contact1.setText(preferences.getString("CONTACT",Variable.contactno));
	           bloodgroup.setText(preferences.getString("BLOOD",Variable.bloodgroup));
	           hometown.setText(preferences.getString("HOME",Variable.hometown));
	           emergency1.setText(preferences.getString("E1",Variable.emergencycontact1));
	           emergency2.setText(preferences.getString("E2",Variable.emergencycontact2));          
	   		
	           
				//Change the title of the action bar
		    	ActionBar actionBar = getSupportActionBar();
		    	actionBar.setTitle("BIODATA - EDIT");
		        
			       //remove the application icon from title bar
			           actionBar.setDisplayShowHomeEnabled(false);
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		Variable variable = new Variable();
		
		editor.putString("NAME",Variable.name);
		editor.putString("DOB",Variable.dob);
		editor.putString("AGE",Variable.age);
		editor.putString("ADDRESS",Variable.address);
		editor.putString("CONTACT",Variable.contactno);
		editor.putString("BLOOD",Variable.bloodgroup);
		editor.putString("HOME",Variable.hometown);
		editor.putString("E1",Variable.emergencycontact1);
		editor.putString("E2",Variable.emergencycontact2);
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
	    	
	    	   final EditText Name=(EditText) findViewById(R.id.nameedit);
	           final EditText DOB=(EditText)findViewById(R.id.dobedit);
	           final EditText age=(EditText)findViewById(R.id.ageedit);
	           final EditText address=(EditText)findViewById(R.id.addressedit);
	           final EditText contact1=(EditText)findViewById(R.id.contact1edit);
	           final EditText bloodgroup=(EditText)findViewById(R.id.bloodgroupedit);
	           final EditText hometown=(EditText)findViewById(R.id.hometownedit);
	           final EditText emergency1=(EditText)findViewById(R.id.emergencycontact1edit);
	           final EditText emergency2=(EditText)findViewById(R.id.emergencycontact2edit);
	           
	    	Variable variables = new Variable();
	    	Variable.name = Name.getText().toString();
	 		Variable.dob = DOB.getText().toString();
	 		Variable.age = age.getText().toString();
	 		Variable.address = address.getText().toString();
	 		Variable.contactno = contact1.getText().toString();
	 		Variable.bloodgroup = bloodgroup.getText().toString();
	 		Variable.hometown = hometown.getText().toString();
	 		Variable.emergencycontact1 = emergency1.getText().toString();
	 		Variable.emergencycontact2 = emergency2.getText().toString();
	 		
	 		
	         Toast.makeText(Biodataeditactivity.this, "Record Inserted",500000).show();
	    	 startActivity(new Intent(Biodataeditactivity.this,Biodataviewactivity.class)); 				    
	    }	    
	        
		return true;
	  } 
  
	
}
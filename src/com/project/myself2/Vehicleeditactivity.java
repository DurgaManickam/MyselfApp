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

public class Vehicleeditactivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.vehicleeditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText vehnameeditview=(EditText) findViewById(R.id.vehnameedit);
	           final EditText vehnumbereditview=(EditText)findViewById(R.id.vehnumberedit);
	           final EditText licenseeditview=(EditText)findViewById(R.id.licenseedit);
	           final EditText purchasedateeditview=(EditText)findViewById(R.id.purchasedateedit);
	           final EditText Amounteditview=(EditText)findViewById(R.id.Amountedit);
	           final EditText installmenteditview=(EditText)findViewById(R.id.installmentedit);
	           final EditText Serviceseditview=(EditText)findViewById(R.id.Servicesedit);
	           final EditText Engine_Noeditview=(EditText)findViewById(R.id.engine_Noedit);
	           final EditText chasis_Noeditview=(EditText)findViewById(R.id.chasis_Noedit);
	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
			
	 		vehnameeditview.setText(preferences.getString("VEHICLENAME",Variable.vehname));
	 		vehnumbereditview.setText(preferences.getString("NAME",Variable.vehnumber));
	 		licenseeditview.setText(preferences.getString("LICENSE",Variable.license));
	 		purchasedateeditview.setText(preferences.getString("PURDATE",Variable.purchasedate));
	 		Amounteditview.setText(preferences.getString("AMT",Variable.Amount));
	 		installmenteditview.setText(preferences.getString("INSTAL",Variable.installment));
	 		Serviceseditview.setText(preferences.getString("SERVICES",Variable.Services));
	 		Engine_Noeditview.setText(preferences.getString("ENGINE",Variable.Engine_No));
	 		chasis_Noeditview.setText(preferences.getString("CHASIS",Variable.chasis_No));
			
	 		//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("VEHICLE - EDIT");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
}

				@Override
					protected void onPause() {
							super.onPause();
							
							SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
							SharedPreferences.Editor editor = preferences.edit();
							
							Variable variable = new Variable();
							
							editor.putString("VEHICLENAME",Variable.vehname);
							editor.putString("NAME",Variable.vehnumber);
							editor.putString("LICENSE",Variable.license);
							editor.putString("PURDATE",Variable.purchasedate);
							editor.putString("AMT",Variable.Amount);
							editor.putString("INSTAL",Variable.installment);
							editor.putString("SERVICES",Variable.Services);
							editor.putString("ENGINE",Variable.Engine_No);
							editor.putString("CHASIS",Variable.chasis_No);
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
	     	  					
								   final EditText vehnameeditview=(EditText) findViewById(R.id.vehnameedit);
						           final EditText vehnumbereditview=(EditText)findViewById(R.id.vehnumberedit);
						           final EditText licenseeditview=(EditText)findViewById(R.id.licenseedit);
						           final EditText purchasedateeditview=(EditText)findViewById(R.id.purchasedateedit);
						           final EditText Amounteditview=(EditText)findViewById(R.id.Amountedit);
						           final EditText installmenteditview=(EditText)findViewById(R.id.installmentedit);
						           final EditText Serviceseditview=(EditText)findViewById(R.id.Servicesedit);
						           final EditText Engine_Noeditview=(EditText)findViewById(R.id.engine_Noedit);
						           final EditText chasis_Noeditview=(EditText)findViewById(R.id.chasis_Noedit);
						           
	 			           				        	
						Variable.vehname = vehnameeditview.getText().toString();
				 		Variable.vehnumber = vehnumbereditview.getText().toString();
				 		Variable.license = licenseeditview.getText().toString();
				 		Variable.purchasedate = purchasedateeditview.getText().toString();
				 		Variable.Amount = Amounteditview.getText().toString();
				 		Variable.installment = installmenteditview.getText().toString();
				 		Variable.Services = Serviceseditview.getText().toString();
				 		Variable.Engine_No = Engine_Noeditview.getText().toString();
				 		Variable.chasis_No = chasis_Noeditview.getText().toString();
				 		
				 		
				         Toast.makeText(Vehicleeditactivity.this, "Record Inserted",500000).show();
				         startActivity(new Intent(Vehicleeditactivity.this, Vehicleviewactivity.class));
					}
				       
						    return true;
 	}
	

}


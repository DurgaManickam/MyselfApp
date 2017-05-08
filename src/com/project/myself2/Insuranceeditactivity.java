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

public class Insuranceeditactivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.insuranceeditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText insurancetypeeditview=(EditText) findViewById(R.id.insurancetypeedit);
	           final EditText periodeditview=(EditText)findViewById(R.id.periodedit);
	           final EditText policynumbereditview=(EditText)findViewById(R.id.policynumberedit);
	           final EditText policydetailseditview=(EditText)findViewById(R.id.policydetailsedit);
	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
	           
	        insurancetypeeditview.setText(preferences.getString("INSURANCE",Variable.insurancetype));
	 		periodeditview.setText(preferences.getString("PERIOD", Variable.period));
	 		policynumbereditview.setText(preferences.getString("POLICYNO", Variable.policynumber));
	 		policydetailseditview.setText(preferences.getString("POLICYDETAILS", Variable.policydetails));
	 		
	 		//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("INSURANCE - EDIT");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
}
		
		@Override
		protected void onPause() {
			super.onPause();
			SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = preferences.edit();
			
			Variable variable = new Variable();

			editor.putString("INSURANCE",Variable.insurancetype);
			editor.putString("PERIOD", Variable.period);
			editor.putString("POLICYNO", Variable.policynumber);
			editor.putString("POLICYDETAILS", Variable.policydetails);
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
		    	
		    	   final EditText insurancetypeeditview=(EditText) findViewById(R.id.insurancetypeedit);
		           final EditText periodeditview=(EditText)findViewById(R.id.periodedit);
		           final EditText policynumbereditview=(EditText)findViewById(R.id.policynumberedit);
		           final EditText policydetailseditview=(EditText)findViewById(R.id.policydetailsedit);
		    	
						Variable.insurancetype = insurancetypeeditview.getText().toString();
				 		Variable.period = periodeditview.getText().toString();
				 		Variable.policynumber = policynumbereditview.getText().toString();
				 		Variable.policydetails = policydetailseditview.getText().toString();

		       
				 		startActivity(new Intent(Insuranceeditactivity.this, Insuranceviewactivity.class));		
				 		Toast.makeText(Insuranceeditactivity.this, "Record Inserted",500000).show();
	    				    
	    }	    
	        
		return true;
	  } 
 
	

}

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


public class Bankeditactivity extends SherlockActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.bankeditactivity);
			
			final Variable variable = new Variable();
     	  					
			   final EditText banknameeditview=(EditText) findViewById(R.id.banknameedit);
	           final EditText brancheditview=(EditText)findViewById(R.id.branchedit);
	           final EditText accounttypeeditview=(EditText)findViewById(R.id.accounttypeedit);
	           final EditText account_Noeditview=(EditText)findViewById(R.id.account_Noedit);
	           final EditText loantypeeditview=(EditText)findViewById(R.id.loantypeedit);
	           final EditText loan_Noeditview=(EditText)findViewById(R.id.loan_Noedit);
	           final EditText loanamounteditview=(EditText)findViewById(R.id.loanamountedit);
	           final EditText ATMcard_Noeditview=(EditText)findViewById(R.id.ATMcard_Noedit);
	           final EditText cardtypeeditview=(EditText)findViewById(R.id.cardtypeedit);
	           final EditText CVnumbereditview=(EditText)findViewById(R.id.CVnumberedit);
	           final EditText PANnumbereditview=(EditText)findViewById(R.id.PANnumberedit);
	           
	        
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
		     	  
	           banknameeditview.setText(preferences.getString("BANKNAME", Variable.bankname));
	           brancheditview.setText(preferences.getString("BRANCH",Variable.branch));
	           accounttypeeditview.setText(preferences.getString("ACTYPE",Variable.accounttype));
	           account_Noeditview.setText(preferences.getString("ACNO",Variable.account_No));
	           loantypeeditview.setText(preferences.getString("LOANTYPE",Variable.loantype));
	           loan_Noeditview.setText(preferences.getString("LOANNO",Variable.loan_No));
	           loanamounteditview.setText(preferences.getString("LOANAMT",Variable.loanamount));
	           ATMcard_Noeditview.setText(preferences.getString("ATMCN",Variable.ATMcard_No));
	           cardtypeeditview.setText(preferences.getString("CT",Variable.cardtype));          
	           CVnumbereditview.setText(preferences.getString("CVN",Variable.CVnumber));
	           PANnumbereditview.setText(preferences.getString("PANN",Variable.PANnumber));
	           

				//Change the title of the action bar
		    	ActionBar actionBar = getSupportActionBar();
		    	actionBar.setTitle("BANK - EDIT");
		        
			       //remove the application icon from title bar
			           actionBar.setDisplayShowHomeEnabled(false);
	           }		
	 		
	@Override
	protected void onPause() {
		super.onPause();
		SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = preferences.edit();
		Variable variable = new Variable();
		editor.putString("BANKNAME", Variable.bankname);
		editor.putString("BRANCH",Variable.branch);
		editor.putString("ACTYPE",Variable.accounttype);
		editor.putString("ACNO",Variable.account_No);
		editor.putString("LOANTYPE",Variable.loantype);
		editor.putString("LOANNO",Variable.loan_No);
		editor.putString("ATMCN",Variable.ATMcard_No);
		editor.putString("CVN",Variable.CVnumber);
		editor.putString("PANN",Variable.PANnumber);
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
	    	
	    	 final EditText banknameeditview=(EditText) findViewById(R.id.banknameedit);
	           final EditText brancheditview=(EditText)findViewById(R.id.branchedit);
	           final EditText accounttypeeditview=(EditText)findViewById(R.id.accounttypeedit);
	           final EditText account_Noeditview=(EditText)findViewById(R.id.account_Noedit);
	           final EditText loantypeeditview=(EditText)findViewById(R.id.loantypeedit);
	           final EditText loan_Noeditview=(EditText)findViewById(R.id.loan_Noedit);
	           final EditText loanamounteditview=(EditText)findViewById(R.id.loanamountedit);
	           final EditText ATMcard_Noeditview=(EditText)findViewById(R.id.ATMcard_Noedit);
	           final EditText cardtypeeditview=(EditText)findViewById(R.id.cardtypeedit);
	           final EditText CVnumbereditview=(EditText)findViewById(R.id.CVnumberedit);
	           final EditText PANnumbereditview=(EditText)findViewById(R.id.PANnumberedit);
	           
	           
	    	Variable variables = new Variable();
			Variable.bankname = banknameeditview.getText().toString();
	 		Variable.branch = brancheditview.getText().toString();
	 		Variable.accounttype = accounttypeeditview.getText().toString();
	 		Variable.account_No = account_Noeditview.getText().toString();
	 		Variable.loantype = loantypeeditview.getText().toString();
	 		Variable.loan_No = loan_Noeditview.getText().toString();
	 		Variable.loanamount = loanamounteditview.getText().toString();
	 		Variable.ATMcard_No = ATMcard_Noeditview.getText().toString();
	 		Variable.cardtype = cardtypeeditview.getText().toString();
	 		Variable.CVnumber = CVnumbereditview.getText().toString();
	 		Variable.PANnumber = PANnumbereditview.getText().toString();

	 		
	 		
	 		Toast.makeText(Bankeditactivity.this, "Record Inserted",500000).show();
	         startActivity(new Intent(Bankeditactivity.this, Bankviewactivity.class)); 				    
	    }	    
	        
		return true;
	  } 

	
}
			
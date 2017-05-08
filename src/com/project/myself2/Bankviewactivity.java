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

public class Bankviewactivity extends SherlockActivity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.bankviewactivity);
    	         
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("BANK - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
    	
    	Variable variable = new Variable();
    	
        TextView banknameview = (TextView) findViewById(R.id.banknametextView);
        TextView branchview = (TextView) findViewById(R.id.branchtextView);
        TextView accounttypeview = (TextView) findViewById(R.id.accounttypetextView);
        TextView account_Noview = (TextView) findViewById(R.id.accountnumbertextView);
        TextView loantypeview = (TextView) findViewById(R.id.loantypetextView);
        TextView loan_Noview = (TextView) findViewById(R.id.loannumbertextView);
        TextView loanamountview = (TextView) findViewById(R.id.loanamounttextView);
        TextView ATMcard_Noview = (TextView) findViewById(R.id.atmcardnumbertextView);
        TextView cardtypeview = (TextView) findViewById(R.id.atmcardtypetextView);
        TextView CVnumberview = (TextView) findViewById(R.id.cvnumbertextView);
        TextView PANnumberview = (TextView) findViewById(R.id.pancardnumbertextView);
        
        
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
     	
        banknameview.setText(preferences.getString("NAME",Variable.bankname));
        branchview.setText(preferences.getString("AGE",Variable.branch));
        accounttypeview.setText(preferences.getString("DOB",Variable.dob));
        account_Noview.setText(preferences.getString("ADDRESS",Variable.address));
        loantypeview.setText(preferences.getString("CONTACT",Variable.contactno));
        loan_Noview.setText(preferences.getString("BLOOD",Variable.bloodgroup));
        loanamountview.setText(preferences.getString("HOME",Variable.hometown));
        ATMcard_Noview.setText(preferences.getString("E1",Variable.emergencycontact1));
        cardtypeview.setText(preferences.getString("E2",Variable.emergencycontact2));     
        CVnumberview.setText(preferences.getString("E2",Variable.emergencycontact2));
        PANnumberview.setText(preferences.getString("E2",Variable.emergencycontact2));
        
           banknameview.setText(Variable.bankname);
           branchview.setText(Variable.branch);
           accounttypeview.setText(Variable.accounttype);
           account_Noview.setText(Variable.account_No);
           loantypeview.setText(Variable.loantype);
           loan_Noview.setText(Variable.loan_No);
           loanamountview.setText(Variable.loanamount);
           ATMcard_Noview.setText(Variable.ATMcard_No);
           cardtypeview.setText(Variable.cardtype);
           CVnumberview.setText(Variable.CVnumber);
           PANnumberview.setText(Variable.PANnumber);
          
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
	    case R.id.ic_action_edit:startActivity(new Intent(Bankviewactivity.this, Bankeditactivity.class));
	      break;
	    }
	    return true;
	  } 
  


}           
    
           
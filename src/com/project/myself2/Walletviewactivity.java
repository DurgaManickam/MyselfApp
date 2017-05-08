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

public class Walletviewactivity extends SherlockActivity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {

    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.walletviewactivity);
    	         
    	//Change the title of the action bar
    	ActionBar actionBar = getSupportActionBar();
    	actionBar.setTitle("WALLET - VIEW");
        
	       //remove the application icon from title bar
	           actionBar.setDisplayShowHomeEnabled(false);
	           
    	Variable variable = new Variable();
    	
        TextView license_notextview = (TextView) findViewById(R.id.licensenumbertextView);
        TextView voter_idtextview = (TextView) findViewById(R.id.voteridtextView);
        TextView rationcard_notextview = (TextView) findViewById(R.id.rationcardnumbertextView);
        TextView Banktextview = (TextView) findViewById(R.id.banknametextView);
        TextView ATMcard_notextview = (TextView) findViewById(R.id.atmcardnumbertextView);
        TextView CV_notextview = (TextView) findViewById(R.id.cvnumbertextView);
        TextView pin_notextview = (TextView) findViewById(R.id.pinnumbertextView);
        TextView passport_notextview = (TextView) findViewById(R.id.passportnumbertextView);
        TextView PAN_notextview = (TextView) findViewById(R.id.pancardnumbertextView);
        TextView EBcard_notextview = (TextView) findViewById(R.id.ebcardnumbertextView);
        TextView watercard_notextview = (TextView) findViewById(R.id.watercardnumbertextView);
        TextView housetaxassessment_notextview = (TextView) findViewById(R.id.housetaxnumbertextView);
        TextView LPG_notextview= (TextView) findViewById(R.id.lpgnumbertextView);
        TextView LPG_reftextview = (TextView) findViewById(R.id.lpgreferencenumbertextView);
        TextView Aadhar_notextview = (TextView) findViewById(R.id.aadharcardnumbertextView);
        TextView SSCcertificate_notextview = (TextView) findViewById(R.id.sslccerti_numtextView);
        TextView HSCcertificate_notextview = (TextView) findViewById(R.id.hsccerti_numtextView);

        
        SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);      
        
        
        license_notextview.setText(preferences.getString("LICENCE",Variable.license_no));
        voter_idtextview.setText(preferences.getString("VOTER",Variable.voter_id));
        rationcard_notextview.setText(preferences.getString("RATION",Variable.rationcard_no));
        Banktextview.setText(preferences.getString("BANK",Variable.Bank));
 		ATMcard_notextview.setText(preferences.getString("ATMCARD",Variable.ATMcard_no));
 		CV_notextview.setText(preferences.getString("CV",Variable.CV_no));
 		pin_notextview.setText(preferences.getString("PIN",Variable.pin_no));
 		passport_notextview.setText(preferences.getString("PASSPORT",Variable.passport_no));
 		PAN_notextview.setText(preferences.getString("PAN",Variable.PAN_no));
 		EBcard_notextview.setText(preferences.getString("EB",Variable.EBcard_no));
 		watercard_notextview.setText(preferences.getString("WATER",Variable.watercard_no));
 		housetaxassessment_notextview.setText(preferences.getString("HOUSETAX",Variable.housetaxassessment_no));
 		LPG_notextview.setText(preferences.getString("LPG",Variable.LPG_no));
 		LPG_reftextview.setText(preferences.getString("LPGREF",Variable.LPG_ref));
 		Aadhar_notextview.setText(preferences.getString("AADAHR",Variable.Aadhar_no));
        SSCcertificate_notextview.setText(preferences.getString("SSLCCER",Variable.SSCcertificate_no));
 		HSCcertificate_notextview.setText(preferences.getString("HSCCER",Variable.HSCcertificate_no));
 		
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
	    case R.id.ic_action_edit:startActivity(new Intent(Walletviewactivity.this, Walleteditactivity.class));
	      break;
	    }
	    return true;
	  } 
 

}


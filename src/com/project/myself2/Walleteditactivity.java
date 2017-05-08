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

public class Walleteditactivity extends SherlockActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			
		
			super.onCreate(savedInstanceState);
			setContentView(R.layout.walleteditactivity);
			
			final Variable variable = new Variable();
	    					
			   final EditText license_noeditview=(EditText) findViewById(R.id.licenseedit);
	           final EditText voter_ideditview=(EditText)findViewById(R.id.voter_idedit);
	           final EditText rationcard_noeditview=(EditText)findViewById(R.id.rationcard_noedit);
	           final EditText Bankeditview=(EditText)findViewById(R.id.Bankedit);
	           final EditText ATMcard_noeditview=(EditText)findViewById(R.id.ATMcard_noedit);
	           final EditText CV_noeditview=(EditText)findViewById(R.id.CV_noedit);
	           final EditText pin_noeditview=(EditText)findViewById(R.id.pin_noedit);
	           final EditText passport_noeditview=(EditText)findViewById(R.id.passport_noedit);
	           final EditText PAN_noeditview=(EditText)findViewById(R.id.PAN_noedit);
	           final EditText EBcard_noeditview=(EditText)findViewById(R.id.EBcard_noedit);
	           final EditText watercard_noeditview=(EditText)findViewById(R.id.watercard_noedit);
	           final EditText housetaxassessment_noeditview=(EditText)findViewById(R.id.housetaxassessment_noedit);
	           final EditText LPG_noeditview=(EditText)findViewById(R.id.LPG_noedit);
	           final EditText LPG_refeditview=(EditText)findViewById(R.id.LPG_refedit);
	           final EditText Aadhar_noeditview=(EditText)findViewById(R.id.Aadhar_noedit);
	           final EditText SSCcertificate_noeditview=(EditText)findViewById(R.id.SSCcertificate_noedit);
	           final EditText HSCcertificate_noeditview=(EditText)findViewById(R.id.HSCcertificate_noedit);
	           
	           SharedPreferences preferences = this.getSharedPreferences("data", Context.MODE_PRIVATE);
			
	        license_noeditview.setText(preferences.getString("LICENCE",Variable.license_no));
	        voter_ideditview.setText(preferences.getString("VOTER",Variable.voter_id));
	        rationcard_noeditview.setText(preferences.getString("RATION",Variable.rationcard_no));
	        Bankeditview.setText(preferences.getString("BANK",Variable.Bank));
	 		ATMcard_noeditview.setText(preferences.getString("ATMCARD",Variable.ATMcard_no));
	 		CV_noeditview.setText(preferences.getString("CV",Variable.CV_no));
	 		pin_noeditview.setText(preferences.getString("PIN",Variable.pin_no));
	 		passport_noeditview.setText(preferences.getString("PASSPORT",Variable.passport_no));
	 		PAN_noeditview.setText(preferences.getString("PAN",Variable.PAN_no));
	 		EBcard_noeditview.setText(preferences.getString("EB",Variable.EBcard_no));
	 		watercard_noeditview.setText(preferences.getString("WATER",Variable.watercard_no));
	 		housetaxassessment_noeditview.setText(preferences.getString("HOUSETAX",Variable.housetaxassessment_no));
	 		LPG_noeditview.setText(preferences.getString("LPG",Variable.LPG_no));
	 		LPG_refeditview.setText(preferences.getString("LPGREF",Variable.LPG_ref));
	 		Aadhar_noeditview.setText(preferences.getString("AADAHR",Variable.Aadhar_no));
	        SSCcertificate_noeditview.setText(preferences.getString("SSLCCER",Variable.SSCcertificate_no));
	 		HSCcertificate_noeditview.setText(preferences.getString("HSCCER",Variable.HSCcertificate_no));
	 		
	 		//Change the title of the action bar
	    	ActionBar actionBar = getSupportActionBar();
	    	actionBar.setTitle("WALLET - EDIT");
	        
		       //remove the application icon from title bar
		           actionBar.setDisplayShowHomeEnabled(false);
		}

			@Override
				protected void onPause() {
							super.onPause();
							
							SharedPreferences preferences  = getSharedPreferences("data", Context.MODE_PRIVATE);
							SharedPreferences.Editor editor = preferences.edit();
	
							Variable variable = new Variable();
	
							editor.putString("LICENCE",Variable.license_no);
							editor.putString("VOTER",Variable.voter_id);
							editor.putString("RATION",Variable.rationcard_no);
							editor.putString("BANK",Variable.Bank);
							editor.putString("ATMCARD",Variable.ATMcard_no);
							editor.putString("CV",Variable.CV_no);
							editor.putString("PIN",Variable.pin_no);
							editor.putString("PASSPORT",Variable.passport_no);
							editor.putString("PAN",Variable.PAN_no);
							editor.putString("EB",Variable.EBcard_no);
							editor.putString("WATER",Variable.watercard_no);
							editor.putString("HOUSETAX",Variable.housetaxassessment_no);
							editor.putString("LPG",Variable.LPG_no);
							editor.putString("LPGREF",Variable.LPG_ref);
							editor.putString("AADAHR",Variable.Aadhar_no);
							editor.putString("SSLCCER",Variable.SSCcertificate_no);
							editor.putString("HSCCER",Variable.HSCcertificate_no);
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
		
		final EditText license_noeditview=(EditText) findViewById(R.id.licenseedit);
        final EditText voter_ideditview=(EditText)findViewById(R.id.voter_idedit);
        final EditText rationcard_noeditview=(EditText)findViewById(R.id.rationcard_noedit);
        final EditText Bankeditview=(EditText)findViewById(R.id.Bankedit);
        final EditText ATMcard_noeditview=(EditText)findViewById(R.id.ATMcard_noedit);
        final EditText CV_noeditview=(EditText)findViewById(R.id.CV_noedit);
        final EditText pin_noeditview=(EditText)findViewById(R.id.pin_noedit);
        final EditText passport_noeditview=(EditText)findViewById(R.id.passport_noedit);
        final EditText PAN_noeditview=(EditText)findViewById(R.id.PAN_noedit);
        final EditText EBcard_noeditview=(EditText)findViewById(R.id.EBcard_noedit);
        final EditText watercard_noeditview=(EditText)findViewById(R.id.watercard_noedit);
        final EditText housetaxassessment_noeditview=(EditText)findViewById(R.id.housetaxassessment_noedit);
        final EditText LPG_noeditview=(EditText)findViewById(R.id.LPG_noedit);
        final EditText LPG_refeditview=(EditText)findViewById(R.id.LPG_refedit);
        final EditText Aadhar_noeditview=(EditText)findViewById(R.id.Aadhar_noedit);
        final EditText SSCcertificate_noeditview=(EditText)findViewById(R.id.SSCcertificate_noedit);
        final EditText HSCcertificate_noeditview=(EditText)findViewById(R.id.HSCcertificate_noedit);
        
						Variable.license_no = license_noeditview.getText().toString();
				 		Variable.voter_id = voter_ideditview.getText().toString();
				 		Variable.rationcard_no = rationcard_noeditview.getText().toString();
				 		Variable.Bank = Bankeditview.getText().toString();
				 		Variable.ATMcard_no = ATMcard_noeditview.getText().toString();
				 		Variable.CV_no = CV_noeditview.getText().toString();
				 		Variable.pin_no = pin_noeditview.getText().toString();
				 		Variable.passport_no = passport_noeditview.getText().toString();
				 		Variable.PAN_no = PAN_noeditview.getText().toString();
				 		Variable.EBcard_no = EBcard_noeditview.getText().toString();
				 		Variable.watercard_no = watercard_noeditview.getText().toString();
				 		Variable.housetaxassessment_no = housetaxassessment_noeditview.getText().toString();
				 		Variable.LPG_no= LPG_noeditview.getText().toString();
				 		Variable.LPG_ref = LPG_refeditview.getText().toString();
				 		Variable.Aadhar_no = Aadhar_noeditview.getText().toString();
				 		Variable.SSCcertificate_no = SSCcertificate_noeditview.getText().toString();
				 		Variable.HSCcertificate_no = HSCcertificate_noeditview.getText().toString();
				 		
				 		
				         Toast.makeText(Walleteditactivity.this, "Record Inserted",500000).show();
				         startActivity(new Intent(Walleteditactivity.this, Walletviewactivity.class));
					}
    
    				return true;
				}
			
		}

package com.project.myself2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingFragmentActivity;


public class Mainactivity extends SlidingFragmentActivity {
	
	private TextView Slidetitle;
	private List<SideItemList1> items = new ArrayList<SideItemList1>();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Set the Main View and SlideMenuView
		setContentView(R.layout.mainactivity);
		setBehindContentView(R.layout.menu);
	
		//Hide title bar
	    getSupportActionBar().setDisplayShowTitleEnabled(true);
	    
	    //Enable home button
	    getSupportActionBar().setHomeButtonEnabled(true);

	    //Home as up display
	    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	   
	    getSupportActionBar().setDisplayShowCustomEnabled(true); 
	    
	    getSupportActionBar().setIcon(R.drawable.abs__ic_menu_moreoverflow_normal_holo_dark);
	
		
		
		// Set the SlideWidth
				SlidingMenu menu =getSlidingMenu();
				menu.setBehindOffset(70);
				menu.setShadowWidth(40);
			    setSlidingActionBarEnabled(false);
			    menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);


				// Adding the Title to Slide
				Slidetitle = (TextView) findViewById(R.id.TextView);
				Slidetitle.setText("MODULES");
				class Typefaces {
				    private static final String TAG = "Typefaces";

				    private final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

				    public Typeface get(Context c, String assetPath) {
				        synchronized (cache) {
				            if (!cache.containsKey(assetPath)) {
				                try {
				                	Typeface fonttype2=Typeface.createFromAsset(getAssets(),"articles/BellGothicStd.otf");
				                	Slidetitle.setTypeface(fonttype2);
				    				Slidetitle.setTextSize(20);
				                } catch (Exception e) {
				                    Log.e(TAG, "Could not get typeface '" + assetPath
				                            + "' because " + e.getMessage());
				                    return null;
				                }
				            }
				            return cache.get(assetPath);
				        }
				    }
				}
				
				// Adding Items to the CustomClass
				addsideitems();
				
				// Adding items to the List
				addListitems();

				// OnClickingItem
				actOnItemSelected();
				
		
	}
	
	@Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
		// TODO Auto-generated method stub
		 int itemId = item.getItemId();
		    switch (itemId) {
		    
		    case android.R.id.home:getSlidingMenu().toggle();
		    }
			return false;
		    }
	
	
	

	private void addsideitems() {
		items.add(new SideItemList1("BIODATA",R.drawable.biodata72));
		items.add(new SideItemList1("BANK",R.drawable.bank72));
		items.add(new SideItemList1("EDUCATION",R.drawable.education72));
		items.add(new SideItemList1("INSURANCE",R.drawable.insurance72));
		items.add(new SideItemList1("MEDICAL",R.drawable.medicine72));
		items.add(new SideItemList1("TAX",R.drawable.remainder72));
		items.add(new SideItemList1("VEHICLE",R.drawable.car72));
		items.add(new SideItemList1("WALLET",R.drawable.wallet72));
		items.add(new SideItemList1("CALENDAR",R.drawable.calendar_icon72));

	}


	private void addListitems() {
		ArrayAdapter<SideItemList1> adapter = new MyListAdapter();
		ListView listview = (ListView) findViewById(R.id.listView1);
		listview.setDividerHeight(0);
		listview.setDivider(null);
		listview.setAdapter(adapter);
	}
	
	
	private class MyListAdapter extends ArrayAdapter<SideItemList1> {
		public MyListAdapter() {
			super(Mainactivity.this, R.layout.sidelist, items);
		}
	
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.sidelist, parent, false);
			}
		

			// Find the Item.
			SideItemList1 currentItem = items.get(position);
			// Fill the view
			ImageView imageView = (ImageView) itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentItem.getIconID());


			// Item Title:
			TextView makeText = (TextView) itemView
					.findViewById(R.id.sidelisttext);
			makeText.setText(currentItem.getItem());
			makeText.setTextSize(16);
			
			//Divider Color
			View divider=itemView.findViewById(R.id.divider);
			divider.setBackgroundColor(Color.parseColor("#e5e5e5"));

			return itemView;
		}
	}
	
	
	private void actOnItemSelected() {

		ListView listview = (ListView) findViewById(R.id.listView1);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) {
					getSlidingMenu().toggle();
					
					switch(position)
					{
					case 0: startActivity(new Intent(Mainactivity.this, Biodataviewactivity.class));break;
					case 1: startActivity(new Intent(Mainactivity.this, Bankviewactivity.class));break;
					case 2: startActivity(new Intent(Mainactivity.this, Educationviewactivity.class));break;
					case 3: startActivity(new Intent(Mainactivity.this, Insuranceviewactivity.class));break;
					case 4: startActivity(new Intent(Mainactivity.this, Medicalviewactivity.class));break;
					case 5: startActivity(new Intent(Mainactivity.this, Taxviewactivity.class));break;
					case 6: startActivity(new Intent(Mainactivity.this, Vehicleviewactivity.class));break;
					case 7: startActivity(new Intent(Mainactivity.this, Walletviewactivity.class));break;
					case 8: startActivity(new Intent(Mainactivity.this, MyCalendarActivity.class));break;
					}				
			}
		});

	}

	@Override
	public void onBackPressed() {
	    new AlertDialog.Builder(this)
	        .setIcon(android.R.drawable.ic_dialog_alert)
	        .setTitle("Closing Activity")
	        .setMessage("Are you sure you want to close this application?")
	        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
	    {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            finish();    
	        }

	    })
	    .setNegativeButton("No", null)
	    .show();
	}


}


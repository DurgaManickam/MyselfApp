package com.project.myself2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.Calendar;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class Addevent extends Activity {
 
  @Override
  protected void onCreate(Bundle savedInstanceState) {
 
    super.onCreate(savedInstanceState);
    setContentView(R.layout.addeventtocalendar);
 
    Button button = (Button) findViewById(R.id.button1);
    button.setOnClickListener(new OnClickListener() {
 
      @Override
      public void onClick(View arg0) {
 
         // Perform action on click
         addCalendarEvent();
      }
 
    });
 
  }
 
  public void addCalendarEvent(){
 
    Calendar cal = Calendar.getInstance();    
    Intent intent = new Intent(Intent.ACTION_EDIT);
    intent.setType("vnd.android.cursor.item/event");
    intent.putExtra("beginTime", cal.getTimeInMillis());
    intent.putExtra("allDay", true);
    intent.putExtra("rrule", "FREQ=YEARLY");
    intent.putExtra("endTime", cal.getTimeInMillis()+0*0*1000);
    intent.putExtra("title", "");
    intent.putExtra("description", "");
    intent.putExtra("eventLocation", "Geolocation");
    startActivity(intent);
 
  }
}
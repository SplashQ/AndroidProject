package com.example.androidproject;

import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.widget.TextView;

public class ResultActivity extends Activity {
	TextView tv1;
	TextView tv2;
	TextView tv3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		tv1 = (TextView)findViewById(R.id.textView2);
		tv2 = (TextView)findViewById(R.id.textView3);
		tv3 = (TextView)findViewById(R.id.textView4);
		String pwString, emailString, logString;
		
		Bundle extras = getIntent().getExtras();
		pwString = extras.getString("str2");
		emailString = extras.getString("str3");
		logString = extras.getString("str1");
		tv1.setText(pwString);
		tv2.setText(emailString);
		tv3.setText(logString);
	}




}
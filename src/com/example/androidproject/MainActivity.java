package com.example.androidproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity implements OnClickListener {
	Button b1;
	EditText pw1;
	EditText pw2;
	EditText log1;
	EditText email;
	RadioButton rb1;
	RadioButton rb2;
	CheckBox cb1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		pw1 = (EditText)findViewById(R.id.editText2);
		pw2 = (EditText)findViewById(R.id.editText4);
		log1 = (EditText)findViewById(R.id.editText1);
		rb1 = (RadioButton)findViewById(R.id.radio0);
		rb2 = (RadioButton)findViewById(R.id.radio1);
		cb1 = (CheckBox)findViewById(R.id.checkBox1);
		email = (EditText)findViewById(R.id.editText3);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		String str1 = log1.getText().toString();
		String str2 = pw1.getText().toString();
		String str3 = email.getText().toString();

		if(pw1.getText().toString().equals(pw2.getText().toString()) && cb1.isChecked()){
			Intent i = new Intent(this, ResultActivity.class);
			i.putExtra("str1", str1);
			i.putExtra("str2", str2);
			i.putExtra("str3", str3);
			startActivity(i);
			
		}
	else{
			log1.setText(pw1.getText());
		}

	}
	
}

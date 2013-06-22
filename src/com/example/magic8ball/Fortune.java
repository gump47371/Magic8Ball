package com.example.magic8ball;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fortune extends ListActivity implements OnClickListener {

	Button fate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fortune);
		shaken();
		fate.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fortune, menu);
		return true;
		
	}
	
	private void shaken() {
		
		fate = (Button) findViewById(R.id.button1);
		
	}
	
	public void onClick(View view) {
		
		
		String[] array = context.getResources().getStringArray(R.array.answers);
		String randomStr = array[new Random().nextInt(array.length)];
	}
}

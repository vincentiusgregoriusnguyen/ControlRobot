package com.example.controlrobot;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	int[][] maze1 = {
			{1,2,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,0,1,1,1,1,1,0,1},
			{1,0,1,0,0,1,0,0,0,0,1},
			{1,0,1,1,1,1,0,1,1,1,1},
			{1,0,0,0,0,1,0,1,1,1,1},
			{1,1,1,1,0,1,0,0,0,0,1},
			{1,0,0,0,0,1,1,1,1,0,1},
			{1,0,1,1,0,0,0,1,1,0,1},
			{1,1,1,1,1,1,1,1,1,9,1},
		};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

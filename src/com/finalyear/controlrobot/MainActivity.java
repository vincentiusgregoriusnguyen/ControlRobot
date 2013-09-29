package com.finalyear.controlrobot;

import com.example.controlrobot.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import at.abraxas.amarino.Amarino;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private static final String DEVICE_ADDRESS = "00:12:12:04:32:51";
	ImageButton forward;
	ImageButton left;
	ImageButton right;
	ImageButton backward;
	TextView Display;
	GridView gridView;
	
	int height = 9;
	int width = 9;
	
	static char Maze[][] ={
		{'#',' ','#','#','#','#','#','#','#'},
		{'#',' ',' ',' ','#',' ',' ',' ','#'},
	    {'#',' ','#','#','#',' ','#',' ','#'},
	    {'#',' ','#',' ',' ',' ','#',' ','#'},
	    {'#',' ','#',' ','#',' ','#','#','#'},
	    {'#',' ',' ',' ','#',' ','#',' ','#'},
	    {'#',' ','#','#','#',' ','#',' ','#'},
	    {'#',' ',' ',' ','#',' ',' ',' ','#'},
	    {'#','#','#','#','#','#','#',' ','#'}
	};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Amarino.connect(this, DEVICE_ADDRESS);
		
		forward = (ImageButton) findViewById(R.id.imageButton1);
		right = (ImageButton) findViewById(R.id.imageButton2);
		left = (ImageButton) findViewById(R.id.imageButton4);
		backward = (ImageButton) findViewById(R.id.imageButton3); 
		Display = (TextView) findViewById(R.id.textView1);

		
		
				
		forward.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				forward();
			}	
		});
		
		right.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				right();
			}	
		});
		
		left.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				left();
			}	
		});
		
		backward.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				backward();
			}	
		}); 
		
		
	}
	
	private void forward(){
		Amarino.sendDataToArduino(this, DEVICE_ADDRESS, 'A', 0);
	}
	
	private void backward(){
		Amarino.sendDataToArduino(this, DEVICE_ADDRESS, 'B', 0);
	}
	
	private void right(){
		Amarino.sendDataToArduino(this, DEVICE_ADDRESS, 'C', 0);
	}
	
	private void left(){
		Amarino.sendDataToArduino(this, DEVICE_ADDRESS, 'D', 0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

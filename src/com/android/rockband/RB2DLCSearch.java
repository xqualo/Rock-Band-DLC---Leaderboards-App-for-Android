package com.android.rockband;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RB2DLCSearch extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView textview = new TextView(this);
		textview.setText("Rock Band 2 DLC Search Tab");
		setContentView(textview);
	}
}
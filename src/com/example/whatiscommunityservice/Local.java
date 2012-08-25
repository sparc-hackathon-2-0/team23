package com.example.whatiscommunityservice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Local extends Activity implements OnClickListener {

	public Button search;
	public EditText data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.localoptions);

		search = (Button) findViewById(R.id.bLook);
		data = (EditText) findViewById(R.id.etCity);
		
		search.setOnClickListener(this);

	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bLook:
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+data.getText()+".craigslist.org/vol/"));
			startActivity(browserIntent);
			break;
		}
	}
}

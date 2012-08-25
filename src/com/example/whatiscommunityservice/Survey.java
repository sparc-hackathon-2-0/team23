package com.example.whatiscommunityservice;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;

public class Survey extends Activity implements OnClickListener {

	public Button complete;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.match);
		complete = (Button) findViewById(R.id.bCompleteForm);
		complete.setOnClickListener(this);
		setUpTabs();
	}

	private void setUpTabs() {

		TabHost tabs = (TabHost) findViewById(R.id.tabhost);

		tabs.setup();

		TabHost.TabSpec spec = tabs.newTabSpec("tag1");

		spec.setContent(R.id.tab1);
		spec.setIndicator("Level of Experience");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("Desire to Help");
		tabs.addTab(spec);

		spec = tabs.newTabSpec("tag3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("Random Questions");
		tabs.addTab(spec);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bCompleteForm:
			Dialog da = new Dialog(this);
			da.setTitle("According the the data you submitted...");
			TextView tv1 = new TextView(this);
			tv1.setText("You would be terrible at all forms of community service...");
			tv1.setTextSize(20);
			da.setContentView(tv1);
			da.show();
			break;
		}
	}

}

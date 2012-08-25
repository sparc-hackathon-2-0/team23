package com.example.whatiscommunityservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends Activity implements OnClickListener {

	public Button idea, survey, local, options;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		idea = (Button) findViewById(R.id.bGenerator);
		survey = (Button) findViewById(R.id.bMatching);
		local = (Button) findViewById(R.id.bLocal);
		idea.setOnClickListener(this);
		survey.setOnClickListener(this);
		local.setOnClickListener(this);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		
		case R.id.bLocal:
			Intent Local = new Intent(this, Local.class);
			startActivity(Local);
			break;

		case R.id.bGenerator:
			Intent genScreen = new Intent(this, IdeaGenerator.class);
			startActivity(genScreen);
			break;
		case R.id.bMatching:
			Intent findMatch = new Intent(this, Survey.class);
			startActivity(findMatch);
			break;
			

		}
	}
}
package com.example.whatiscommunityservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainMenu extends Activity implements OnClickListener {

	public Button idea, survey;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		idea = (Button) findViewById(R.id.bGenerator);
		survey = (Button) findViewById(R.id.bMatching);
		idea.setOnClickListener(this);
		survey.setOnClickListener(this);

	}

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {

		case R.id.bGenerator:
			Intent genScreen = new Intent(this, IdeaGenerator.class);
			startActivity(genScreen);
			break;
		case R.id.bMatching:
			Intent findMatch = new Intent(this, Survey.class);
			startActivity(findMatch);

		}

	}
}

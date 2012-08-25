package com.example.whatiscommunityservice;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CommunityService extends Activity implements OnClickListener {
	
	public Button bGo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_service);
        bGo = (Button) findViewById(R.id.bStart);
        bGo.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_community_service, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent mainScreen = new Intent(this, MainMenu.class);
		startActivity(mainScreen);
	}
}

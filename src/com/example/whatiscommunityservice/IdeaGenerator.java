package com.example.whatiscommunityservice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class IdeaGenerator extends Activity implements OnClickListener {

	public Button getIdea;
	public TextView response;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ideas);
		response = (TextView) findViewById(R.id.tvidea);
		getIdea = (Button) findViewById(R.id.bGenerate);
		getIdea.setOnClickListener(this);

	}

	public void onClick(View v) {
		String[] ideas = {
				"Pick Up Trash",
				"42",
				"Habitat For Humanity",
				"10101010",
				"汉语/漢語  华语/華語",
				"Teach underpriviledged children to program",
				"Feed the hungry",
				"Stop Global Warming",
				"Become a Lobster Farmer",
				"1337",
				"Do Nothing",
				"Hello World",
				"I can't let you do that Dave",
				"Plant a garden or tree where the whole neighborhood can enjoy it",
				"Recycle", "Make bird feeders for public places",
				"Help family/friends conserve water",
				"Testing drinking water for lead",
				"Clean up a beach or riverbed",
				"한국어/조선말",
				"This option is not available in your country",
				"漢字",
				"Check indoor radon levels",
				"Pick up litter",
				"Telephone residents and encourage them to register to vote.",
				"Help cook and/or serve a meal at homeless shelter",
				"Adopt a Zoo Animal.",
				"Null Pointer Exception!"
				};
		response.setText(ideas[(int) (Math.random() * 27)]);
	}

}

package app.leb.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity55410075 extends Activity implements OnClickListener {
	private Button btnone, btntwo, btnthree, btnfour;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout075);
		viewmatching();
	}

	protected void viewmatching() {
		// TODO Auto-generated method stub
		btnone = (Button) findViewById(R.id.one);
		btntwo = (Button) findViewById(R.id.two);
		btntwo = (Button) findViewById(R.id.three);
		btntwo = (Button) findViewById(R.id.four);
		btnone.setOnClickListener(this);
		btntwo.setOnClickListener(this);
		btnthree.setOnClickListener(this);
		btnfour.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.one:
			
			break;
		case R.id.two:
			Intent sResume = new Intent(Activity55410075.this, Resume.class);
			startActivity(sResume);
			break;
		case R.id.three:

			break;
		case R.id.four:

			break;

		default:
			break;
		}
	}
}

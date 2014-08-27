package app.leb.test;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Resume extends Activity55410075 {
	private TextView btn1, btn2, btn3, btn4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resume);
		ViewMatching();
		
		
	}
	private void ViewMatching() {
		// TODO Auto-generated method stub
		btn1 = (TextView) findViewById(R.id.name);
		btn2 =  (TextView) findViewById(R.id.id);
		btn3 = (TextView) findViewById(R.id.subj);
		btn4 = (TextView) findViewById(R.id.email);
		btn1.setText("kobboon panya");
		btn2.setText("55410075");
		btn3.setText("Information Technology");
		btn4.setText("lovelovesaenza@gmail.com");
	}
}
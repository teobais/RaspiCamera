package edu.toubou91.android.raspicam;

import com.example.helloandroid.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebSettings.PluginState;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	TextView lastDirectionTV;
	WebView cameraWV;
	String videoID = "fYikHZsSZJQ";
	
	ImageButton leftUpperCornerIB;
	ImageButton upIB;
	ImageButton rightUpperCornerIB;
	ImageButton leftIB;
	ImageButton centerIB;
	ImageButton rightIB;
	ImageButton leftBottomCornerIB;
	ImageButton downIB;
	ImageButton rightBottomCornerIB;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lastDirectionTV = (TextView) findViewById(R.id.lastDirectionTV);
		
		cameraWV = (WebView) findViewById(R.id.webView);
		cameraWV.getSettings().setJavaScriptEnabled(true);
		cameraWV.getSettings().setPluginState(PluginState.ON);
		cameraWV.loadUrl("http://www.youtube.com/embed/" + videoID + "?autoplay=1&vq=small");
		cameraWV.setWebChromeClient(new WebChromeClient());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		leftUpperCornerIB = (ImageButton) findViewById(R.id.leftUpperCornerIB);
		upIB = (ImageButton) findViewById(R.id.upIB);
		rightUpperCornerIB = (ImageButton) findViewById(R.id.rightUpperCornerIB);
		leftIB = (ImageButton) findViewById(R.id.leftIB);
		centerIB = (ImageButton) findViewById(R.id.centerIB);
		rightIB = (ImageButton) findViewById(R.id.rightIB);
		leftBottomCornerIB = (ImageButton) findViewById(R.id.leftBottomCornerIB);
		downIB = (ImageButton) findViewById(R.id.downIB);
		rightBottomCornerIB = (ImageButton) findViewById(R.id.rightBottomCornerIB);
		leftUpperCornerIB.setOnClickListener(this);
		upIB.setOnClickListener(this);
		rightUpperCornerIB.setOnClickListener(this);
		leftIB.setOnClickListener(this);
		centerIB.setOnClickListener(this);
		rightIB.setOnClickListener(this);
		leftBottomCornerIB.setOnClickListener(this);
		downIB.setOnClickListener(this);
		rightBottomCornerIB.setOnClickListener(this);

		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case (R.id.leftUpperCornerIB):
			lastDirectionTV.setText("LEFT UPPER CORNER");
			break;
		case (R.id.upIB):
			lastDirectionTV.setText("UP");
			break;
		case (R.id.rightUpperCornerIB):
			lastDirectionTV.setText("RIGHT UPPER CORNER");
			break;
		case (R.id.leftIB):
			lastDirectionTV.setText("LEFT");
			break;
		case (R.id.centerIB):
			lastDirectionTV.setText("CENTER");
			break;
		case (R.id.rightIB):
			lastDirectionTV.setText("RIGHT");
			break;
		case (R.id.leftBottomCornerIB):
			lastDirectionTV.setText("LEFT BOTTOM CORNER");
			break;
		case (R.id.downIB):
			lastDirectionTV.setText("DOWN");
			break;
		case (R.id.rightBottomCornerIB):
			lastDirectionTV.setText("RIGHT BOTTOM CORNER");
			break;
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
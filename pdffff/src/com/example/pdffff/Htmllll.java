package com.example.pdffff;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Htmllll extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.htmlll);
		WebView wv=(WebView)findViewById(R.id.webView1);
		wv.getSettings().setJavaScriptEnabled(true);
		//wv.addJavascriptInterface(locater, "locater");
		wv.loadUrl("file:///android_asset/chalisha.html");
	}

}

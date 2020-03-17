package com.example.pdffff;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityyyyy extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activityyyy);
		Button b1=(Button)findViewById(R.id.button123);
		Button b2=(Button)findViewById(R.id.button231);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(getApplicationContext(),Pdffffff.class);
				startActivity(in);
				
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(getApplicationContext(),Htmllll.class);
				startActivity(in);
				
			}
		});
		
	}

}

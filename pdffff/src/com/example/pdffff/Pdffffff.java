package com.example.pdffff;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pdffffff extends Activity {
	private TextView secondField;
	Button b1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pdffffff);
		b1=(Button)findViewById(R.id.buttonpdff);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in=new Intent(getApplicationContext(),activityyyyy.class);
				startActivity(in);
				
			}
		});
		 AssetManager assetManager = getAssets();
		 /*String[] files = null;
		try {
	    files = assetManager.list("image");
		 } catch (IOException e) {
		
		  Log.e("tag", e.getMessage());
		   }
		firstField = (EditText) findViewById(R.id.firstId);
		firstField.setText(Integer.toString(files.length) + " file. File name is "
				                + files);*/
				        InputStream inputStream = null;
				        try {
				
				            inputStream = assetManager.open("testt.txt");
				
				        } catch (IOException e) {
			            Log.e("tag", e.getMessage());
				
				        }
				        String s = readTextFile(inputStream);
				        
				                secondField = (TextView)findViewById(R.id.secondId);
				        
				                secondField.setText(s);

				 


	}
	private String readTextFile(InputStream inputStream) {
		
		        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		        byte buf[] = new byte[1024];
		
		        int len;
		
		        try {
		
		            while ((len = inputStream.read(buf)) != -1) {
		
		                outputStream.write(buf, 0, len);
		
		            }
		
		            outputStream.close();
		
		            inputStream.close();
		
		        } catch (IOException e) {
		
		        }
	
		        return outputStream.toString();
		
		    }


	
}

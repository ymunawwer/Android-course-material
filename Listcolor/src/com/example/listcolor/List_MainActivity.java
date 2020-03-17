package com.example.listcolor;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class List_MainActivity extends ListActivity {
  String ar[]={"hi","helo","byee","seeyou","hiwwee"};
  Drawable divider=new Drawable() {
	
	@Override
	public void setColorFilter(ColorFilter cf) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		
	}
};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//setContentView(R.layout.activity_list__main);
		ListAdapter l=new ArrayAdapter<String>(List_MainActivity.this,android.R.layout.simple_list_item_1,ar);
		
	setListAdapter(l);
	ListView lv=getListView();
	lv.setBackgroundColor(Color.RED);
	//lv.buildLayer();
	lv.setDivider(divider);
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list__main, menu);
		return true;
	}

}

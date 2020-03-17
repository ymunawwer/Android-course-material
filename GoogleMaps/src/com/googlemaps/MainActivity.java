package com.googlemaps;

import java.io.IOException;
import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;

public class MainActivity extends MapActivity {
MapView mp;
MapController mapcontroller;
GeoPoint geopoint;
Geocoder geocoder=new Geocoder(this);
List <Address> address;
String stradress="C-161,Lajpat Nagar Part-2,South Delhi-110024";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mp=(MapView) findViewById(R.id.mapview);
		mp.setBuiltInZoomControls(true);
		mp.setSatellite(true);
		mapcontroller=mp.getController();
		try {
			address=geocoder.getFromLocationName(stradress, 5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Address location=address.get(0);
		location.getLatitude();
		location.getLongitude();
	/*String coordinates[] = {"1.352566007", "103.78921587"};
	double lat = Double.parseDouble(coordinates[0]);
	double lng = Double.parseDouble(coordinates[1]);*/
	geopoint=new GeoPoint((int)(location.getLatitude()*1E6),(int)(location.getLongitude()*1E6));
		mapcontroller.animateTo(geopoint);
		mapcontroller.setZoom(15);
		
	}
	@Override
		public boolean onKeyDown(int keyCode, KeyEvent event) {
			// TODO Auto-generated method stub
		MapController mapcontroller=mp.getController();
		switch(keyCode)
		{
		case KeyEvent.KEYCODE_3:
			mapcontroller.zoomIn();
			
		case KeyEvent.KEYCODE_5:
			mapcontroller.zoomOut();
			
		}
			return super.onKeyDown(keyCode, event);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}

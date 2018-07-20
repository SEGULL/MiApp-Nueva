package com.example.miapp;

import java.util.ArrayList;
import java.util.List;

import com.example.miapp.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ListView listView;
	private ListAdapter adapter;
	List<String> listadenombres;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(id.listView1);
		// datos para mostrar en mi lista
		
		listadenombres = new ArrayList<String>();
		
		listadenombres.add("segundo");
		listadenombres.add("jose");
		listadenombres.add("manuel");

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, listadenombres);

		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> AdapterView, View view, int position,long id)
			{
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "Hola seleccionastes a"+listadenombres.get(position)+" Su edad es 20 años", Toast.LENGTH_LONG).show();	
			}
		});
		MyAdapter myadarter = new MyAdapter(this, R.layout.listitem, listadenombres);
		listView.setAdapter(myadarter);
	}
}

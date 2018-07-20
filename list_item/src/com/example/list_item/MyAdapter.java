package com.example.list_item;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CorrectionInfo;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{
	
	private Context context;
	private int layout;
	private List<String> names;
	
	public MyAdapter(Context context, int layout,List<String> names) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.layout = layout;
		this.names = names;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return  this.names.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return this.names.get(position);
	}

	@Override
	public long getItemId(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup viewGroup) {
		// TODO Auto-generated method stub
		// copiar la vista
		View v = convertView;
		//inflamms la vista
		LayoutInflater layoutinflatec = LayoutInflater.from(this.context);
		v = layoutinflatec.inflate(R.layout.listitem,null);
		//nos traemos el valor actual dependiendo de la posicion
		String currentName = names.get(position);
		//currentName = getItem(position);
		
		//lenar text viwe
		//Referenciamos el elemnto a modificar y rellenamos
		TextView textView = (TextView) v.findViewById(R.id.listView1);
		textView.setText(currentName);
		//devolvemos la vista inflada y modificada con nuestros datos
		return v;
	}
	
}

package com.example.primerapp;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private ListView listView;
    List<String> names;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //datos a mostrar 
        names = new ArrayList<String>();
       names.add("segundo");
       names.add("fernando");
       names.add("ramiro");
       names.add("alex");
       /*List<String> names2 = new ArrayList<String>(){{
    	   add("");
    	   add("");
    	   add("");
    	   add("");
       }};*/
       //adaptador, la forma visula como mostraremos nuestros datos
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
    	//enlazamos el adaptador con nuestro lisview
    	listView.setAdapter(adapter);
    	
    	listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> AdapterView, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this , "Clicked: "+names.get(position), Toast.LENGTH_LONG).show();
			}
		});
    }  

}


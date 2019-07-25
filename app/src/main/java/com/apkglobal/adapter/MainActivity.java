package com.apkglobal.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[]data ={"pawan","raman","chaman"};
    int[] image= {android.R.drawable.alert_dark_frame,
            android.R.drawable.alert_dark_frame,
            android.R.drawable.alert_dark_frame,
    R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        //call simpleadapter to attach simple data
        ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
        for (int i=0;i<data.length;i++)
        {
            HashMap<String,String>hashMap=new HashMap<>();
            hashMap.put("name",data[i]);
            hashMap.put("image",image[i]+"");
            arrayList.add(hashMap);
        }
        String[] from={"name","image"};
        int[]to ={R.id.tv_name,R.id.iv_pic};
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.item,from,to);
        listView.setAdapter(simpleAdapter);
                //to check the parameter of simple adaptor class
      //SimpleAdapter simpleAdapter=new SimpleAdapter(this);
       /* ArrayList<HashMap<String,String>> a = new ArrayList<>();

        HashMap<String,String> h=new HashMap<>();
        h.put("name","pawan sharma");
        a.add(h);
        h.put("name","Akshansh Rajput");*/

    }
}

package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    SimpleAdapter ad;
    public void GetList(View v)
    {
        ListView lstview = (ListView) findViewById(R.id.listview1);

        List<Map<String, String>> MyDataList = null;
        ListItem MyData= new ListItem();
        MyDataList = MyData.getlist();

        String[] Fromw= {"ISurname", "IName", "Middle_Name"};
        int[] Tow={R.id.ISurname,R.id.IName,R.id.Middle_Name};
        ad= new SimpleAdapter(MainActivity.this,MyDataList,R.layout.listayouttemplate,Fromw,Tow);
        lstview.setAdapter(ad);
    }
}
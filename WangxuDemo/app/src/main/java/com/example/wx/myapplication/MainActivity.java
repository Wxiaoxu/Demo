package com.example.wx.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private Spinner sp_tv;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_tv= findViewById(R.id.sp_tv);
        textView=findViewById(R.id.tv);
        //数据源
        ArrayList<String> spinners = new ArrayList<>();
        spinners.add("今日");
        spinners.add("昨日");
        spinners.add("本周");
        spinners.add("上周");
        spinners.add("本月");
        spinners.add("上月");

       final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,spinners);
       sp_tv.setAdapter(adapter);
       sp_tv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               textView.setText(adapter.getItem(i));
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });
    }
}

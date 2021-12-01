package com.ksoftlabs.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    ListView lvMonth;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonth=findViewById(R.id.lvMonth);
        months= new DateFormatSymbols().getMonths();
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,months);
        lvMonth.setAdapter(monthAdapter);
    }
}
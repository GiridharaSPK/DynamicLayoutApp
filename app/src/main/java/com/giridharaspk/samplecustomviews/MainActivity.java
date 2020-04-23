package com.giridharaspk.samplecustomviews;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.giridharaspk.samplecustomviews.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private SampleAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private Context context;
    private ArrayList<CustomViewModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        context = MainActivity.this;

        list = new ArrayList<>();
        list.add(new CustomViewModel(1, "Button"));
        list.add(new CustomViewModel(0, "Text2"));
        list.add(new CustomViewModel(0, "Text1"));

        //setAdapter
        linearLayoutManager = new LinearLayoutManager(context);
        adapter = new SampleAdapter(list, context);
        activityMainBinding.rvMain.setAdapter(adapter);
        activityMainBinding.rvMain.setLayoutManager(linearLayoutManager);

    }
}

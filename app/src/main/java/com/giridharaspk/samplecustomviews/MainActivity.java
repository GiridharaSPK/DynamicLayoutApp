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
    private ArrayList<String> spinnerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        context = MainActivity.this;

        list = new ArrayList<>();
        list.add(new CustomViewModel(0, "Username", 16, ""));
        list.add(new CustomViewModel(1, "", 16, "Enter username"));
        list.add(new CustomViewModel(0, "Password", 16, ""));
        list.add(new CustomViewModel(1, "", 16, "Enter password"));
        list.add(new CustomViewModel(4, "Login", 16, ""));
        spinnerList = new ArrayList<>();
        spinnerList.add("one");
        spinnerList.add("two");
        list.add(new CustomViewModel(3, "Select", 16, "", spinnerList));

        //setAdapter
        linearLayoutManager = new LinearLayoutManager(context);
        adapter = new SampleAdapter(list, context);
        activityMainBinding.rvMain.setAdapter(adapter);
        activityMainBinding.rvMain.setLayoutManager(linearLayoutManager);

    }
}

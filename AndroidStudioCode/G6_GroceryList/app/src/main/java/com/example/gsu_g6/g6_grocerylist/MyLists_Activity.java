package com.example.gsu_g6.g6_grocerylist;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MyLists_Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lists_);

        initButton();
    }


    private void initButton(){
        Button AddList = (Button) findViewById(R.id.Button_AddList);
        Button OpenGroups = (Button) findViewById(R.id.Button_OpenGroups);
    }
}

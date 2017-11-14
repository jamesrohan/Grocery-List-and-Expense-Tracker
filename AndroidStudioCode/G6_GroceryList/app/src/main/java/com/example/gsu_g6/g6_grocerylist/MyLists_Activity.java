package com.example.gsu_g6.g6_grocerylist;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyLists_Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_lists_);

        initButton();
    }

    private void initButton(){
        Button AddList = (Button) findViewById(R.id.Button_AddList1);
        Button OpenGroups = (Button) findViewById(R.id.Button_OpenGroups1);

        OpenGroups.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MyLists_Activity.this, MyGroups_Activity.class);
                startActivity(intent);
            }
        });



    }

}

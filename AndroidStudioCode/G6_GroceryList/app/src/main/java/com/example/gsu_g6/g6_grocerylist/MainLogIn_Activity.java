package com.example.gsu_g6.g6_grocerylist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLogIn_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_log_in);

        initButtons();
    }

    private void initButtons(){

        Button SignIn = (Button) findViewById(R.id.button_SignIn);
        SignIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainLogIn_Activity.this, MyLists_Activity.class);
                startActivity(intent);
            }
        });

        Button SignUp = (Button) findViewById(R.id.button_SignUp);

    }//End initButtons



}

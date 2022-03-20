package com.example.shashank.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Profilectivity extends AppCompatActivity {

    EditText uName, eMail;
    TableLayout layout;
    SQLiteHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilectivity);
        uName = (EditText) findViewById(R.id.editName);
        eMail = (EditText)  findViewById(R.id.editEmail);
        layout = (TableLayout) findViewById(R.id.myview);
    }
    private  void getAllDetails(){
        ArrayList<String> uName = mydb.profileDetails();
        for (String name: uName){
            TextView tv =new TextView(this);
            tv.setText(name);
            layout.addView(tv);
        }
    }
}
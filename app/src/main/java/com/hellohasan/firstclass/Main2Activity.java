package com.hellohasan.firstclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class Main2Activity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Logger.addLogAdapter(new AndroidLogAdapter());

        String string = getIntent().getStringExtra("data");

        Logger.d("String " + string);


        editText = (EditText) findViewById(R.id.edittext);
        editText.setText(string);
    }

    public void buttonClick(View view) {

        if(view.getId() ==  R.id.button1)
            Toast.makeText(this, "Button 1", Toast.LENGTH_SHORT).show();
        else if(view.getId() == R.id.button2)
            Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT).show();
    }
}

package com.example.marcin.dialogfragm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybtn = (Button) findViewById(R.id.btn1);

        mybtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                MyDialog myDialog = new MyDialog();
                myDialog.show(getFragmentManager(), "123");
            }
        });
    }
}

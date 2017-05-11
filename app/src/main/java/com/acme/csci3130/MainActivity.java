package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText copyText;
    TextView txtresult;
    TextView textView2;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtresult = (TextView)findViewById(R.id.helloText);
        textView2 = (TextView)findViewById(R.id.textView2);
        copyText = (EditText)findViewById(R.id.editText);
        bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtresult.setText(copyText.getText().toString());

            }
        });
    }
}

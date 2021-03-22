package com.gohool.metertoinchesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private Button convert;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.tvresultID);
        convert = (Button) findViewById(R.id.convertID);
        editText = (EditText) findViewById(R.id.editTextID);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier= 39.37;
                double resultat=0.0;
                if(editText.getText().toString().equals("")){

                    result.setText(R.string.error_msg);
                    result.setTextColor(Color.RED);
                }
                else{
                    double recup =Double.parseDouble( editText.getText().toString());
                    resultat=multiplier*recup;
                    result.setTextColor(Color.DKGRAY);
                    result.setText(String.format("%.2f",resultat)+" inches");
                }


            }
        });
    }
}

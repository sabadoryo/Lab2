package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton r1, r2, r3, r4, r5;
    CheckBox cb1;
    TextView t1;
    SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);

        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);

        t1 = (TextView) findViewById(R.id.totalCalories);

        sb = (SeekBar) findViewById(R.id.seekBar);

        r1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                t1.setText("2");
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                t1.setText("4");
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                t1.setText("6");
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(Integer.toString(Integer.parseInt((String) t1.getText()) + 9));
            }
        });

        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText(Integer.toString(Integer.parseInt((String) t1.getText()) + 10));
            }
        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                t1.setText(Integer.toString(Integer.parseInt((String) t1.getText()) + i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (cb1.isChecked()) {
                    t1.setText(Integer.toString(Integer.parseInt((String) t1.getText()) + 10));
                } else {
                    t1.setText(Integer.toString(Integer.parseInt((String) t1.getText()) - 10));
                }
            }
        });
    }
}
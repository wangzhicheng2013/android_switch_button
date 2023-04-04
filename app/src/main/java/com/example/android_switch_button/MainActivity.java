package com.example.android_switch_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    public Switch mSwitch;
    public Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.take_photo);
        mSwitch = (Switch)findViewById(R.id.switch_flawless);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (true == isChecked) {
                    mButton.setVisibility(View.VISIBLE);
                }
                else {
                    mButton.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
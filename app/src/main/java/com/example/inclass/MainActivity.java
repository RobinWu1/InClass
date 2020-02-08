package com.example.inclass;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;



import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView tv = findViewById(R.id.TextDisplay);
        tv.setText("Hello");
    }
}

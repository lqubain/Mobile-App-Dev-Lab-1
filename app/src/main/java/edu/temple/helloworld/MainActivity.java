package edu.temple.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener (new OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(view);
            }
        });
    }

    public void changeText(View view) {
        TextView t = (TextView) findViewById(R.id.text1);
        t.setText("You have clicked the button!");
    }
}

package com.example.a11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button handler;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        result = (TextView) findViewById(R.id.textView4);
        result.setVisibility(View.INVISIBLE);

        handler = (Button)findViewById(R.id.button);
        handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var first = ((EditText)findViewById(R.id.editTextNumber)).getText();
                var second = ((EditText)findViewById(R.id.editTextNumber4)).getText();

                result.setText(String.format("%s%s", first.toString(), second.toString()));
                result.setVisibility(View.VISIBLE);
            }
        });
    }
}
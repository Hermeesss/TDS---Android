package net.hanshq.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity {
    TextView text;
    Button handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        handler = (Button)findViewById(R.id.button);
        handler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String new_text = "";

                text = (TextView)findViewById(R.id.my_text);

                try{
                    int num = Integer.parseInt(text.getText().toString());
                    new_text = String.valueOf(num + 1);
                }catch(Exception ex){}

                text.setText(new_text);
            }
        });
    }
}

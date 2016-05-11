package it.gov.iiseinaudiscarpa.details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // definisco l'intenzione di aprire l'Activity "Page1.java"
                Intent openPage1 = new Intent(MainActivity.this,MenuLivelli.class);
                startActivity(openPage1);

            }
        });
    }
}

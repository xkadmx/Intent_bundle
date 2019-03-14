package com.example.intent_bundle.;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.intent_bundle.R;

public class MainActivity extends Activity {

    Button buttonNext ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.intents_nofab.SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("someString", "Zaraz moj kolega");
                intent.putExtra("intenta", bundle);
//                intent.putExtra("test", "ten tekst pochodzi z innego activity");
//                startActivity(intent);
            }
        });
    }
}

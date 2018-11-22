package com.example.faisal.explicit_intent;

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
        Button b=(Button)findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,newActivity.class);
                i.putExtra("name","admin");
                i.putExtra("message","Hello from main Activity");
                Bundle extra=new Bundle();
                extra.putString("status1","Data");
                extra.putString("Status2","Received");
                extra.putString("Status3","Successfully");
                extra.putString("Status4","!");
                i.putExtras(extra);
                startActivity(i);
            }
        });
    }
}

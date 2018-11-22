package com.example.faisal.explicit_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class newActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String message = i.getStringExtra("message");
        ((TextView) findViewById(R.id.textview1)).setText(name + message);
        Bundle bundle = i.getExtras();
        String status1 = bundle.getString("status1");
        String status2 = bundle.getString("status2");
        String status3 = bundle.getString("status3");
        String status4 = bundle.getString("status4");
        Toast.makeText(this, status1 + status2 + status3 + status4, Toast.LENGTH_SHORT).show();
Button button=(Button)findViewById(R.id.Newb1);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent myintent =new Intent(newActivity.this,MainActivity.class);
        startActivity(myintent);
    }
});
    }
}

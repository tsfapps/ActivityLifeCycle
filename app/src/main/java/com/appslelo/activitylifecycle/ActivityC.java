package com.appslelo.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityC extends AppCompatActivity implements View.OnClickListener {

    private Button buttonC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        buttonC = findViewById(R.id.btn_c);
        buttonC.setOnClickListener(this);
        Toast.makeText(this, "onCreate of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity C is Launched", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart of Activity C", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        //Activity Running
        Toast.makeText(this, "onResume of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity C Running", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Another activity comes into foreground
        Toast.makeText(this, "onPause of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Another activity comes into foreground", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        //The Activity is no loner visible
        Toast.makeText(this, "onStop of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "The Activity C is no loner visible", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        //User navigate to the activity
        Toast.makeText(this, "onRestart of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "User navigate to the Activity C", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //The Activity is finishing or destroyed by the system
        Toast.makeText(this, "onDestroy of Activity C", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "The Activity C is finishing or destroyed by the system", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ActivityD.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

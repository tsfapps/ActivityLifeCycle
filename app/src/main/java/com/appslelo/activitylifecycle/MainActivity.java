package com.appslelo.activitylifecycle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonA;
    private Button buttonDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = findViewById(R.id.btn_a);
        buttonA.setOnClickListener(this);
        buttonDialog = findViewById(R.id.btn_dialog);
        buttonDialog.setOnClickListener(this);
        Toast.makeText(this, "onCreate of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity A Launched", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart of Activity A", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        //Activity Running
        Toast.makeText(this, "onResume of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity A Running", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Another activity comes into foreground
        Toast.makeText(this, "onPause of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Another activity comes into foreground", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        //The Activity is no loner visible
        Toast.makeText(this, "onStop of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "The Activity A is no loner visible", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

        //User navigate to the activity
        Toast.makeText(this, "onRestart of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "User navigate to the Activity A", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //The Activity is finishing or destroyed by the system
        Toast.makeText(this, "onDestroy of Activity A", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, " Activity B is finishing or destroyed by the system", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_a:
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
            break;
            case R.id.btn_dialog:
                dialogShow();
                break;
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void dialogShow(){
        Toast.makeText(this, "Dialog Clicked", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Alert Dialog Shown");
        builder.setCancelable(true);
        builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}


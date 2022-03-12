package com.motion.activitylifecycle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  TextView tvAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate","onCreate");
        tvAlertDialog=findViewById(R.id.tvAlertDialog);

        tvAlertDialog.setOnClickListener(view -> {
            Log.d("onCreate: ", "onCreate: ");
           AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
           dialog.setMessage("ARSLAN");
           dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
              Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
              startActivity(intent);
               }
           });
           dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   Toast.makeText(MainActivity.this,"не разрешено",Toast.LENGTH_LONG).show();
               }
           });
           dialog.create().show();
        });

        Toast.makeText(this,"Биздин пртложенияга кош келипсиз",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume");

    }

//    @Override
//    protected Dialog onCreateDialog(int id) {
//        AlertDialog.Builder builder=new AlertDialog.Builder(getApplicationContext());
//        builder.setMessage("AlertDialog").setPositiveButton("да разрешаю", (dialogInterface, i) -> {
//            Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
//            startActivity(intent);
//        }).setNegativeButton("не разрешаю", (dialogInterface, i) -> Toast.makeText(getApplicationContext(),"не разрешено",Toast.LENGTH_LONG).show());
//        AlertDialog dialog=builder.create();
//        return dialog;
//    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy");

    }
}
package com.jahad.contacts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        EditText et1 = findViewById(R.id.et1);
        Button bt1 = findViewById(R.id.bt1);
        TextView tv1 = findViewById(R.id.tv1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Toast.makeText(MainActivity.this, "onCreate()", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        Toast.makeText(MainActivity.this, "onStart()", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(MainActivity.this, "onRestart()", Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(MainActivity.this, "onResume()", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(MainActivity.this, "onPause()", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this, "onStop()", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this, "onDestroy()", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
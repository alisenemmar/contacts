package com.jahad.contacts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        // 3 + 4.5 = 7.5
        // x + y = result
        int x = 3;
        float y = 4.5f;
        float result = sum(x,y);

        TextView color = findViewById(R.id.color);
        Button bt1 = findViewById(R.id.bt1); // سبز
        Button bt2 = findViewById(R.id.bt2); // قرمز
        Button bt3 = findViewById(R.id.bt3); // آبی

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color.setText("سبز");
                color.setTextColor(Color.GREEN);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color.setText("قرمز");
                color.setTextColor(Color.RED);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color.setText("آبی");
                color.setTextColor(Color.BLUE);
            }
        });

    }

    float sum(int x, float y) {
        return x+y;
    }

}
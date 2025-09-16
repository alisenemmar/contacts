package com.jahad.contacts;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

        EditText et1 = findViewById(R.id.et1);
        Button bt1 = findViewById(R.id.bt1);
        TextView tv1 = findViewById(R.id.tv1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String traffic_light = et1.getText().toString();

                if (traffic_light.equals("sabz")) tv1.setText("حرکت");
                else if (traffic_light.equals("zard")) tv1.setText("احتیاط");
                else if (traffic_light.equals("ghermez")) tv1.setText("ایست");
                else tv1.setText("ورودی نامعتبر است.");
            }
        });


    }

}
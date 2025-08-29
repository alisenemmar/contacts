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

        TextView tv1 = findViewById(R.id.tv1);
        EditText et1 = findViewById(R.id.et1);
        ImageView img1 = findViewById(R.id.img1);
        Button bt1 = findViewById(R.id.bt1);

        // کارهایی که با TextView میتوان انجام داد:
        tv1.setText("سلام");
        tv1.setTextColor(Color.rgb(255,87,160));

        // کارهایی که با Edittext میتوان انجام داد:
        et1.setHint("hello");
        et1.setTextColor(Color.rgb(200,200,200));
        String name = et1.getText().toString().trim().toUpperCase();
        // ABC abc
        // SalAAm -> SALAAM
        tv1.setText(name);

        // کارهایی که با ImageView میتوان انجام داد:
        img1.setImageResource(R.drawable.heart);

        // کارهایی که با Button میتوان انجام داد:
        // onClick
        // onLongClick
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("خداحافظ");
                tv1.setTextColor(Color.rgb(200,200,200));
            }
        });
        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String name = et1.getText().toString();
                tv1.setText(name);
                return true;
            }
        });




    }

}
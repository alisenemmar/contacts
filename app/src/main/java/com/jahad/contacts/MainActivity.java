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
        ImageView img1 = findViewById(R.id.img1);
        EditText et1 = findViewById(R.id.et1);
        Button bt1 = findViewById(R.id.bt1);

        // کارهایی که با TextView می توان کرد
        tv1.setText("سلام");
        tv1.setTextColor(Color.rgb(27,167,168));

        // کارهایی که با ImageView می توان کرد
        img1.setImageResource(R.drawable.heart);

        // کارهایی که با EditText می توان کرد
        et1.setText("سلام");
        et1.setTextColor(Color.BLUE);
        et1.setHint("سلام");
        et1.setHintTextColor(Color.rgb(200,200,200));

        // کارهایی که با Button می توان کرد
        bt1.setText("سلام");
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString();
                tv1.setText("سلام "+name);
                tv1.setTextColor(Color.rgb(200,200,200));
            }
        });

    }

}
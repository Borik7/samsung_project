package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    ConstraintLayout divan1;
    ConstraintLayout divan2;
    ConstraintLayout divan3;
    ConstraintLayout divan4;
    ConstraintLayout divan5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.divanner);
        divan1 = findViewById(R.id.divan1);
        divan1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, Divan_1.class);
            startActivity(intent);
        });
        divan2 = findViewById(R.id.divan2);
        divan2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, Divan_2.class);
            startActivity(intent);
        });
        divan3 = findViewById(R.id.divan3);
        divan3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, Divan_3.class);
            startActivity(intent);
        });
        divan4 = findViewById(R.id.divan4);
        divan4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, Divan_4.class);
            startActivity(intent);
        });
        divan5 = findViewById(R.id.divan5);
        divan5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, Divan_5.class);
            startActivity(intent);
        });
    }
}
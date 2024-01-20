package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    ConstraintLayout ugalok1;
    ConstraintLayout ugalok2;
    ConstraintLayout ugalok3;
    ConstraintLayout ugalok4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ugalokner);
        ugalok1 = findViewById(R.id.ugalok1222);
        ugalok1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_1.class);
            startActivity(intent);
        });
        ugalok2 = findViewById(R.id.ugalok2);
        ugalok2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_2.class);
            startActivity(intent);
        });
        ugalok3 = findViewById(R.id.ugalok3);
        ugalok3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_3.class);
            startActivity(intent);
        });
        ugalok4 = findViewById(R.id.ugalok4);
        ugalok4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_4.class);
            startActivity(intent);
        });
    }
}
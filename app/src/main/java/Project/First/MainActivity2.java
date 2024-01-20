package Project.First;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popular);
        Button button = (Button) findViewById(R.id.zalmebel);
        Button button1 = (Button) findViewById(R.id.kuxnimebel);
        Button button2 = (Button) findViewById(R.id.karavat);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onKaravat();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUglaok();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPopular();
            }
        });

}

    public void onPopular(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void onUglaok(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void onKaravat(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}

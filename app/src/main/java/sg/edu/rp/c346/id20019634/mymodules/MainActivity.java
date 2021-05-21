package sg.edu.rp.c346.id20019634.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid, tviPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.tvAndroid);
        tviPad = findViewById(R.id.tviPad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("C346", "C346");
                startActivity(intent);

            }
        });

        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("C349", "C349");
                startActivity(intent);

            }
        });

    }
}
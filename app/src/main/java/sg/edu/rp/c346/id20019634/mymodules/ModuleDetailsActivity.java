package sg.edu.rp.c346.id20019634.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvDisplay = findViewById(R.id.textView);
        btnMain = findViewById(R.id.btnMain);

        Intent intent = getIntent();
        String moduleDisplay = intent.getStringExtra("C346");
        String output = "";

        if (moduleDisplay != null) {
            output += "Module Code: " + moduleDisplay;
            output += "\nModule Name: Android Programming";
            output += "\nAcademic Year: 2020";
            output += "\nSemester: 1";
            output += "\nModule Credit: 4";
            output += "\nVenue: W66M";

        } else {
            moduleDisplay = intent.getStringExtra("C349");
            output += "Module Code: " + moduleDisplay;
            output += "\nModule Name: iPad Programming";
            output += "\nAcademic Year: 2021";
            output += "\nSemester: 1";
            output += "\nModule Credit: 3";
            output += "\nVenue: W66L";
        }

        tvDisplay.setText(output);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
package sg.edu.rp.c346.id22014093.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView c346;
    TextView c349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.textView);
        c349 = findViewById(R.id.textView2);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C346_act.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E63A");

                startActivity(intent);
            }
        });
        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C349_act.class);
                intent.putExtra("ModuleCode", "C349");
                intent.putExtra("ModuleName", "iPad Programming");
                intent.putExtra("AcademicYear", "2023");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E63A");
                startActivity(intent);
            }
        });




    }
}
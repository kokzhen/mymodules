package sg.edu.rp.c346.id22014093.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C346_act extends AppCompatActivity {
    TextView tvc346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);


        tvc346 = findViewById(R.id.c346tv);
        Intent intentRecieved = getIntent();
        String ModuleCode = intentRecieved.getStringExtra("ModuleCode");
        String ModuleName = getIntent().getStringExtra("ModuleName");
        String AcademicYear = getIntent().getStringExtra("AcademicYear");
        String Semester = getIntent().getStringExtra("Semester");
        String ModuleCredit = getIntent().getStringExtra("ModuleCredit");
        String Venue = getIntent().getStringExtra("Venue");
        tvc346.setText("ModuleCode: " + ModuleCode+ "\n" + "ModuleName: " + ModuleName+ "\n" + "Academic Year: " + AcademicYear
        + "\n" + "Semester: " + Semester + "\n" + "ModuleCredit: "+ModuleCredit+"\n" + "Venue: "+ Venue);



    }
}
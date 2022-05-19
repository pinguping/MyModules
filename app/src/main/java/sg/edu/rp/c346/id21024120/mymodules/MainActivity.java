package sg.edu.rp.c346.id21024120.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModule1, tvModule2, tvModule3, tvModule4, tvModule5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textViewModule1);
        tvModule2 = findViewById(R.id.textViewModule2);
        tvModule3 = findViewById(R.id.textViewModule3);
        tvModule4 = findViewById(R.id.textViewModule4);
        tvModule5 = findViewById(R.id.textViewModule5);

        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C206");
                intent.putExtra("ModuleName", "Software Development Process");
                intent.putExtra("AcademicYear", "2022");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E66J");
                startActivity(intent);
            }
        });

        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C218");
                intent.putExtra("ModuleName", "UI/UX Design for Apps");
                intent.putExtra("AcademicYear", "2022");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E66B");
                startActivity(intent);
            }
        });

        tvModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C105");
                intent.putExtra("ModuleName", "Introduction to Programming");
                intent.putExtra("AcademicYear", "2022");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W64R");
                startActivity(intent);
            }
        });

        tvModule4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Mobile App Development");
                intent.putExtra("AcademicYear", "2022");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvModule5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName", "Web Appln Development in php");
                intent.putExtra("AcademicYear", "2022");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W65H");
                startActivity(intent);
            }
        });

    }
}
package sg.edu.rp.c346.id21024120.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModuleCredit, tvVenue;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        button = findViewById(R.id.button);

        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");

        if (moduleCode.equals("C206")) {
            String moduleName = intentReceived.getStringExtra("ModuleName");
            int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
            int semester = intentReceived.getIntExtra("Semester", 0);
            int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
            String venue = intentReceived.getStringExtra("Venue");

            tvModuleCode.setText("Modile Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvAcademicYear.setText("Academic Year: " + academicYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

        } else if (moduleCode.equals("C218")) {
            String moduleName = intentReceived.getStringExtra("ModuleName");
            int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
            int semester = intentReceived.getIntExtra("Semester", 0);
            int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
            String venue = intentReceived.getStringExtra("Venue");

            tvModuleCode.setText("Modile Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvAcademicYear.setText("Academic Year: " + academicYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

        } else if (moduleCode.equals("C105")) {
            String moduleName = intentReceived.getStringExtra("ModuleName");
            int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
            int semester = intentReceived.getIntExtra("Semester", 0);
            int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
            String venue = intentReceived.getStringExtra("Venue");

            tvModuleCode.setText("Modile Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvAcademicYear.setText("Academic Year: " + academicYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

        } else if (moduleCode.equals("C346")) {
            String moduleName = intentReceived.getStringExtra("ModuleName");
            int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
            int semester = intentReceived.getIntExtra("Semester", 0);
            int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
            String venue = intentReceived.getStringExtra("Venue");

            tvModuleCode.setText("Modile Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvAcademicYear.setText("Academic Year: " + academicYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);

        } else if (moduleCode.equals("C203")) {
            String moduleName = intentReceived.getStringExtra("ModuleName");
            int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
            int semester = intentReceived.getIntExtra("Semester", 0);
            int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
            String venue = intentReceived.getStringExtra("Venue");

            tvModuleCode.setText("Modile Code: " + moduleCode);
            tvModuleName.setText("Module Name: " + moduleName);
            tvAcademicYear.setText("Academic Year: " + academicYear);
            tvSemester.setText("Semester: " + semester);
            tvModuleCredit.setText("Module Credit: " + moduleCredit);
            tvVenue.setText("Venue: " + venue);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ModuleDetailActivity.this, MainActivity.class);
                finish();
            }
        });




    }
}
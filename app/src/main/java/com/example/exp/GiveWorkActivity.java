package com.example.exp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

//public class GiveWorkActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_give_work);
//    }
//
//
//}


import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Spinner;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class GiveWorkActivity extends AppCompatActivity {

    private Spinner spinnerTypeOfWork;
    private EditText editTextWages;
    private EditText editTextNumberOfDays;
    private EditText editTextLocation;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_work);

        spinnerTypeOfWork = findViewById(R.id.spinnerTypeOfWork);
        editTextWages = findViewById(R.id.editTextWages);
        editTextNumberOfDays = findViewById(R.id.editTextNumberOfDays);
        editTextLocation = findViewById(R.id.editTextLocation);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitWork();
            }
        });
    }

    private void submitWork() {
        String typeOfWork = spinnerTypeOfWork.getSelectedItem().toString();
        String wages = editTextWages.getText().toString();
        String numberOfDays = editTextNumberOfDays.getText().toString();
        String location = editTextLocation.getText().toString();

        // TODO: Perform any necessary validation and data processing here

        // Example: Display a toast message with the submitted data
        String message = "Type of Work: " + typeOfWork + "\n"
                + "Wages: " + wages + "\n"
                + "Number of Days: " + numberOfDays + "\n"
                + "Location of Work: " + location;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}



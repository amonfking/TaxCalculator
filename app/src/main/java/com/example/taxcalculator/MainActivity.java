package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalculateTax;
    private EditText etSalary;
    private TextView tvOutput;

    double salary, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculateTax = findViewById(R.id.btnCalculateTax);
        etSalary= findViewById(R.id.etSalary);
        tvOutput = findViewById(R.id.tvOutput);

        btnCalculateTax.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCalculateTax) {
            if (validation()) {
                salary = Double.parseDouble(etSalary.getText().toString())*12;
                TaxCalculate obj = new TaxCalculate();
                obj.setSalary(salary);
                result = obj.calculateTax();
                tvOutput.setText("Your Tax is " + Double.toString(result));
            }
        }
    }

    public boolean validation(){
        boolean flag = true;
        if (TextUtils.isEmpty(etSalary.getText().toString())) {
            etSalary.setError("Please enter Salary");
            etSalary.requestFocus();
            flag = false;
        }
        return flag;
    }
}

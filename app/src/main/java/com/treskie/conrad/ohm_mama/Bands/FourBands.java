package com.treskie.conrad.ohm_mama.Bands;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.treskie.conrad.ohm_mama.ProcessInputClass;
import com.treskie.conrad.ohm_mama.R;

public class FourBands extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner comboBox1;
    private Spinner comboBox2;
    private Spinner comboBox3;
    private Spinner comboBox4;
    private TextView tvResult;
    private TextView tvCalculations;
    private ProcessInputClass pic;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_bands);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pic = new ProcessInputClass();
        comboBox1 = findViewById(R.id.comboBox1);
        comboBox2 = findViewById(R.id.comboBox2);
        comboBox3 = findViewById(R.id.comboBox3);
        comboBox4 = findViewById(R.id.comboBox4);

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, pic.comboBoxContents1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, pic.comboBoxContents2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        comboBox1.setAdapter(adapter1);
        comboBox2.setAdapter(adapter1);
        comboBox3.setAdapter(adapter2);
        comboBox4.setAdapter(adapter2);

        tvResult = findViewById(R.id.result);
        tvCalculations = findViewById(R.id.calculations);

    }

    public void toProcessInput(View v) {
        String output = pic.processInputFourBands(comboBox1.getSelectedItemPosition(), comboBox2.getSelectedItemPosition(), comboBox3.getSelectedItemPosition(), comboBox4.getSelectedItemPosition());
        tvResult.setText(output);
        tvCalculations.setText(pic.outputCalc);
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //NOTHING HAPPENS
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //NOTHING HAPPENS
    }
}

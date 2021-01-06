package com.example.madt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spSelect;
    private EditText textEntered;
    private TextView tvCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textEntered=findViewById(R.id.textEntered);
        this.spSelect =findViewById(R.id.spSelect);
        this.tvCounter=findViewById(R.id.tvCounter);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Selection_Opt, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelect.setAdapter(adapter);
    }

    public void onBtnClick(View view)
    {
        String spinnerSelect=spSelect.getSelectedItem().toString();
        String userEnteredText= this.textEntered.getText().toString();
        if(userEnteredText.isEmpty())
        {
            Toast.makeText(this, "Please Enter Some text. Textbox is Empty.", Toast.LENGTH_LONG).show();
        }
        else {
            if (spinnerSelect.equalsIgnoreCase("Characters")) {
                int strlen = wordSearch.getLen(userEnteredText);
                this.tvCounter.setText(String.valueOf(strlen));
            } else if (spinnerSelect.equalsIgnoreCase("Words")) {
                int strlen = wordSearch.wordLen(userEnteredText);
                this.tvCounter.setText(String.valueOf(strlen));
            } else {
                Toast.makeText(this, "Not Implemented", Toast.LENGTH_LONG).show();
            }
        }
    }
}
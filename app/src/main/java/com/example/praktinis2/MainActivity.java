package com.example.praktinis2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText TxtLaukas;
    TextView TxtResults;
    Spinner spSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spSelection = (Spinner) findViewById(R.id.spSelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.SelectionOptions,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spSelection.setAdapter(adapter);

        this.TxtLaukas = findViewById(R.id.TxtLaukas);
        this.TxtResults = findViewById(R.id.TxtResults);
    }

    public void BtnCountClick(View view) {
        String phrase = TxtLaukas.getText().toString();

        if(TextUtils.isEmpty(phrase)) {
            Toast.makeText(this, "The text field can't be empty", Toast.LENGTH_SHORT).show();
            return;
        }

        String chars_caption = getResources().getString(R.string.chars_caption);
        String selectedOption = this.spSelection.getSelectedItem().toString();
        if(selectedOption.equalsIgnoreCase(chars_caption)){
            int charsCount = TextCounter.getCharsCount(phrase);
            this.TxtResults.setText(String.valueOf(charsCount));
        }
        else {
            TextCounter tc = new TextCounter();
            int charsCount = tc.getWordsCount(phrase);
            this.TxtResults.setText(String.valueOf(charsCount));
        }
    }
}



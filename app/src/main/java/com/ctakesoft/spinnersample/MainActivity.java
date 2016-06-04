package com.ctakesoft.spinnersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner_entry);
        final TextView under = (TextView) findViewById(R.id.under_text);
        final TextView upper = (TextView) findViewById(R.id.upper_text);
        if (spinner == null || under == null || upper == null) {
            return;
        }

        final View button = findViewById(R.id.getBtn);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = (String) spinner.getSelectedItem();
                    String[] values = value.split("~");
                    under.setText(values[0].trim());
                    if (values.length > 1) {
                        upper.setText(values[1].trim());
                    } else {
                        upper.setText("");
                    }
                }
            });
        }
    }
}

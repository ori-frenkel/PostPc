package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg;
//    Button changeTextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.txt_view_id);
        // option 1 (working as well - tested it)
//        changeTextButton = (Button)findViewById(R.id.btn_change_txt_view);
//        changeTextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText simpleEditText = (EditText) findViewById(R.id.input_text_id);
//                String strValue = simpleEditText.getText().toString();
//                System.out.println(strValue);
//
//                // clear the editText (the input text)
//                simpleEditText.getText().clear();
//
//                // putting the inputed text into text_view
//                msg.setText(strValue);
//            }
//        }); hello test
    }

    // option 2 - add in the xml android:onClick="custom on click function such as this one."
    public void onClickFuncBtn(View view) {
        // getting the input from the text view
        EditText simpleEditText = findViewById(R.id.input_text_id);
        String strValue = simpleEditText.getText().toString();

        // clear the editText (the input text)
        simpleEditText.getText().clear();

        // putting the inputed text into text_view
        msg.setText(strValue);
    }
}

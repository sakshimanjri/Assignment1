package com.example.tstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn,mode;
    EditText txt1,txt2;
    TextView textView;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.tstBtn);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        textView=findViewById(R.id.txtView);
        mode=findViewById(R.id.button);
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=(count+1)%4;
                switch(count)
                {
                    case 0:
                        mode.setText("Mode: Addition");
                        break;
                    case 1:
                        mode.setText("Mode: Subtraction");
                        break;
                    case 2:
                        mode.setText("Mode: Multiplication");
                        break;
                    case 3:
                        mode.setText("Mode: Division");
                        break;
                }
            }
        });
    }

    public void onButtonPressed(View view)
    {
        double num1=Double.parseDouble(txt1.getText().toString());
        double num2=Double.parseDouble(txt2.getText().toString());
        String ans="";
        switch(count)
        {
            case 0:
                ans+=(num1+num2);
                break;
            case 1:
                ans+=(num1-num2);
                break;
            case 2:
                ans+=(num1*num2);
                break;
            case 3:
                ans+=(num1/num2);
                break;
        }
        textView.setText(ans);
    }
}

package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    TextView result;
    EditText no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result= findViewById(R.id.result);
        no1= findViewById(R.id.no1);
        no2= findViewById(R.id.no2);
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();
            }
        });
    }

    public void OpenActivity2(){
        Intent intent= new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    public void displayToast(View v){
        Toast.makeText(MainActivity.this,"You just clicked the OK button",Toast.LENGTH_SHORT).show();
    }



    public void addNum(View view) {
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1+n2;
        result.setText(String.valueOf(result1));
    }

    public void minus(View m){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1-n2;
        result.setText(String.valueOf(result1));
    }

    public void multiply(View b){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1*n2;
        result.setText(String.valueOf(result1));
    }

    public void divide(View n){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1/n2;
        result.setText(String.valueOf(result1));
    }
}



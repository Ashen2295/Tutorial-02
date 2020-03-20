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
        Toast.makeText(MainActivity.this,"Input valid",Toast.LENGTH_SHORT).show();
    }



    public void addNum(View v) {
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1+n2;
        result.setText(String.valueOf(result1));
    }

    public void minus(View v){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1-n2;
        result.setText(String.valueOf(result1));
    }

    public void multiply(View v){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1*n2;
        result.setText(String.valueOf(result1));
    }

    public void divide(View v){
        double n1, n2 , result1;
        n1 = Double.parseDouble(no1.getText().toString());
        n2 = Double.parseDouble(no2.getText().toString());
        result1= n1/n2;
        result.setText(String.valueOf(result1));
    }





    //Creating the LayoutInflater instance
    LayoutInflater li = getLayoutInflater();
    //Getting the View object as defined in the customtoast.xml file
    View layout = li.inflate(R.layout.customtoast, (ViewGroup)
            findViewById(R.id.custom_toast_layout));
    //Creating the Toast object
    Toast toast = new Toast(getApplicationContext());
          toast.setDuration(Toast.LENGTH_SHORT);
          toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
          toast.setView(layout);//setting the view of custom toast layout
          toast.show();
}

}



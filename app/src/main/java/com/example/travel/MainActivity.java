package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    EditText miles;
    EditText mpg;
    String strSp;
    String strMiles;
    String strMPG;
    String strCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.activity_main);
        miles=findViewById(R.id.miles);
        mpg=findViewById(R.id.mpg);
        gasCost=findViewById(R.id.cost);

        sp.setOnItemSelectListener(new AdapterView.OnItemSelectedListener()){

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                strSpr=sp.getSelectedItem().toString();
                if(strSp.equals("Washington DC"))
                {
                    miles.setText("700.8");
                }
                else if(strSp.equals("Miami");
                {
                    miles.setText("1000.8");
                }
                 else if(strSp.equals("New York");
                {
                    miles.setText("1000.8");
                }
                else
                {
                    miles.setTExt("2014.8")
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });


        }

        public void Calculate(View v)
        {

        }

    }
}
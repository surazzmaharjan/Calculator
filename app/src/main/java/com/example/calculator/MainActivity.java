package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btnmultiple,btnsevennum,btneightnum,btnninenum,btnadd,btnfournum,btnfivenum;
    Button btnsixnum,btnsubtract,btnonenum,btntwonum,btnthreenum,btnclear,btnzeronum;
    Button btnequal,btndivide;
    EditText numbertext;
    String displayNum ="";
    String op;
    int num1 ,num2, res;
    int abc,abcc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnonenum  = findViewById(R.id.btnOne);
        btntwonum  = findViewById(R.id.btnTwo);
        btnthreenum  = findViewById(R.id.btnThree);
        btnfournum  = findViewById(R.id.btnFour);
        btnfivenum  = findViewById(R.id.btnFive);
        btnsixnum  = findViewById(R.id.btnSix);
        btnsevennum  = findViewById(R.id.btnSeven);
        btneightnum  = findViewById(R.id.btnEight);
        btnninenum  = findViewById(R.id.btnNine);
        btnzeronum  = findViewById(R.id.btnZero);
        btnclear  = findViewById(R.id.btnClear);
        btnequal  = findViewById(R.id.btnEqual);
        btnadd = findViewById(R.id.btnAdd);
        btnsubtract = findViewById(R.id.btnSubtract);
        btndivide = findViewById(R.id.btnDivide);
        btnmultiple = findViewById(R.id.btnMultiply);

        numbertext = findViewById(R.id.btnText);


        btnonenum.setOnClickListener(this);
        btntwonum.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnadd.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnOne:
                displayNum += 1;
                numbertext.setText(displayNum);
                break;

            case R.id.btnTwo:
                displayNum += 2;
                numbertext.setText(displayNum);
                break;

            case R.id.btnAdd:
                num1 = Integer.parseInt(displayNum);
                displayNum="";
                op="+";
                break;

            case R.id.btnEqual:
                num2 = Integer.parseInt(displayNum);
                res =getResult(op,num1,num2);
                numbertext.setText(String.valueOf(res));
                break;


        }
    }


    private int getResult(String op,int n1, int n2)
    {
        switch (op)
        {
            case "+":
                return n1+n2;

            case "-":
                return n1-n2;

                default:
                    return  0;
        }
    }
}

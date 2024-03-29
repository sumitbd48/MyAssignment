package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9, btn0, btnAdd, btnSub, btnMul, btnDiv, btnClear, btnEquals;
    String displayNum="";
    int num1, num2;
    int res;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        editText = findViewById(R.id.editText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        btnEquals = findViewById(R.id.btnEquals);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn0:
                displayNum +=0;
                editText.setText(displayNum);
                break;

            case R.id.btn1:
                displayNum += 1;
                editText.setText(displayNum);
                break;

            case R.id.btn2:
                displayNum += 2;
                editText.setText(displayNum);
                break;

            case R.id.btn3:
                displayNum += 3;
                editText.setText(displayNum);
                break;

            case R.id.btn4:
                displayNum +=4;
                editText.setText(displayNum);
                break;

            case R.id.btn5:
                displayNum +=5;
                editText.setText(displayNum);
                break;

            case R.id.btn6:
                displayNum +=6;
                editText.setText(displayNum);
                break;

            case R.id.btn7:
                displayNum +=7;
                editText.setText(displayNum);
                break;

            case R.id.btn8:
                displayNum +=8;
                editText.setText(displayNum);
                break;

            case R.id.btn9:
                displayNum +=9;
                editText.setText(displayNum);
                break;

            case R.id.btnAdd:
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(displayNum);
                    displayNum = "";
                    editText.setText(displayNum);
                    op = "+";
                }
                break;

            case R.id.btnSub:
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(displayNum);
                    displayNum = "";
                    editText.setText(displayNum);
                    op = "-";
                }
                break;

            case R.id.btnMul:
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(displayNum);
                    displayNum = "";
                    editText.setText(displayNum);
                    op = "*";
                }
                break;

            case R.id.btnDiv:
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(displayNum);
                    displayNum = "";
                    editText.setText(displayNum);
                    op = "/";
                }
                break;

            case R.id.btnClear:
                displayNum= "";
                editText.setText(displayNum);
                break;

            case R.id.btnEquals:
                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    num2 = Integer.parseInt(displayNum);
                    res = getResult(op, num1, num2);
                    editText.setText(String.valueOf(res));
                }
                break;
        }
    }
    private int getResult(String op, int n1, int n2) {
        switch (op) {
            case "+": {
                return n1 + n2;
            }

            case "-": {
                return n1 - n2;
            }

            case "*": {
                return n1 * n2;
            }

            case "/": {
                return n1 / n2;
            }

            default: {
                return 0;
            }
        }
    }
}

package com.ahad.calculatorlabfinal;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,
            butAdd,butDiv,butSub,butMul,butMod,butDot,butEqual,butX,butC,butSqrt;
    private TextView content,contentRes,statusB;
    private String opStatus = "NOT";

    private double value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag",Double.toString(value));
        Log.d("tag",opStatus);
        but1 = findViewById(R.id.button1);
        but2 = findViewById(R.id.button2);
        but3 = findViewById(R.id.button3);
        but4 = findViewById(R.id.button4);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but7 = findViewById(R.id.button7);
        but8 = findViewById(R.id.button8);
        but9 = findViewById(R.id.button9);
        but0 = findViewById(R.id.button0);
        butAdd = findViewById(R.id.buttonAdd);
        butDiv = findViewById(R.id.buttonDiv);
        butSub = findViewById(R.id.buttonSub);
        butMul = findViewById(R.id.buttonMul);
        butMod = findViewById(R.id.buttonMod);
        butDot = findViewById(R.id.buttonDot);
        butSqrt = findViewById(R.id.buttonSqrt);
        butC = findViewById(R.id.buttonC);
        butEqual = findViewById(R.id.buttonEqual);
        content = findViewById(R.id.content);
        contentRes = findViewById(R.id.contentRes);
        statusB = findViewById(R.id.status);
        butX = findViewById(R.id.buttonX);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "3");
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "4");
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "5");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "6");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "7");
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "8");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "9");
            }
        });
        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                content.setText(content.getText().toString() + "0");
            }
        });
        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                Log.d("tag",opStatus);
                if(!content.getText().toString().matches("") && value != 0){
                    dualCondition("ADD");
                }
                else if(content.getText().toString().matches("") && value != 0){
                    opStatus = "ADD";
                    statusB.setText("+");
                }
                else{
                    if(!content.getText().toString().matches("")){
                        contentRes.setText(content.getText().toString());
                        value = FourDecimalPrecision(Double.parseDouble(content.getText().toString()));
                        opStatus = "ADD";
                        statusB.setText("+");
                        content.setText("");
                    }
                }
            }
        });
        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                Log.d("tag",opStatus);
                if(!content.getText().toString().matches("") && value != 0){
                    dualCondition("SUB");
                }
                else if(content.getText().toString().matches("") && value != 0){
                    opStatus = "SUB";
                    statusB.setText("-");
                }
                else{
                    if(!content.getText().toString().matches("")){
                        contentRes.setText(content.getText().toString());
                        value = FourDecimalPrecision(Double.parseDouble(content.getText().toString()));
                        opStatus = "SUB";
                        statusB.setText("-");
                        content.setText("");
                    }
                }
            }
        });
        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                Log.d("tag",opStatus);
                if(!content.getText().toString().matches("") && value != 0){
                    dualCondition("DIV");
                }
                else if(content.getText().toString().matches("") && value != 0){
                    opStatus = "DIV";
                    statusB.setText("/");
                }
                else{
                    if(!content.getText().toString().matches("")){
                        contentRes.setText(content.getText().toString());
                        value = FourDecimalPrecision(Double.parseDouble(content.getText().toString()));
                        opStatus = "DIV";
                        statusB.setText("/");
                        content.setText("");
                    }
                }
            }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!content.getText().toString().matches("") && value != 0){
                    dualCondition("MUL");
                }
                else if(content.getText().toString().matches("") && value != 0){
                    opStatus = "MUL";
                    statusB.setText("*");
                }
                else{
                    if(!content.getText().toString().matches("")){
                        contentRes.setText(content.getText().toString());
                        value = FourDecimalPrecision(Double.parseDouble(content.getText().toString()));
                        opStatus = "MUL";
                        statusB.setText("*");
                        content.setText("");
                    }
                }
            }

        });
        butMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                if(!content.getText().toString().matches("") && value != 0){
                    dualCondition("MOD");
                }
                else if(content.getText().toString().matches("") && value != 0){
                    opStatus = "MOD";
                    statusB.setText("%");
                }
                else{
                    if(!content.getText().toString().matches("")){
                        contentRes.setText(content.getText().toString());
                        value = FourDecimalPrecision(Double.parseDouble(content.getText().toString()));
                        opStatus = "MOD";
                        statusB.setText("%");
                        content.setText("");
                    }
                }
                Log.d("tag",Double.toString(value));
                Log.d("tag",opStatus);
            }
        });
        butSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                if(!content.getText().toString().matches("")){
                    double value1 = Math.sqrt(Double.parseDouble(content.getText().toString()));
                    content.setText(String.valueOf(value1));
                }
            }
        });
        butEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag",Double.toString(value));
                Log.d("tag",opStatus);
                if(!content.getText().toString().matches("")){
                    statusB.setText("=");
                    if(opStatus.equals("ADD")){
                        if(!content.getText().toString().matches("")){
                            value = FourDecimalPrecision(value+Double.parseDouble(content.getText().toString()));
                            contentRes.setText(Double.toString(value));
                            opStatus = "NOT";
                            content.setText("");
                        }
                    }
                    else if(opStatus.equals("SUB")){
                        value = FourDecimalPrecision(value-Double.parseDouble(content.getText().toString()));
                        contentRes.setText(Double.toString(value));
                        opStatus = "NOT";
                        content.setText("");
                    }
                    else if(opStatus.equals("MUL")){
                        value = FourDecimalPrecision(value*Double.parseDouble(content.getText().toString()));
                        contentRes.setText(Double.toString(value));
                        opStatus = "NOT";
                        content.setText("");
                    }
                    else if(opStatus.equals("DIV")){
                        double tmp = Double.parseDouble(content.getText().toString());
                        if(tmp != 0){
                            value /= tmp;
                            contentRes.setText(Double.toString(value));
                        }
                        else{
                            contentRes.setText("Invalid");
                        }
                        opStatus = "NOT";
                        content.setText("");
                    }
                    else if(opStatus.equals("MOD")){
                        value %= Double.parseDouble(content.getText().toString());
                        contentRes.setText(Double.toString(value));
                        opStatus = "NOT";
                        content.setText("");
                    }
                    else{
                        if(!content.getText().toString().matches("")){
                            contentRes.setText(content.getText().toString());
                        }
                    }
                }
            }
        });
        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(content.getText().toString().matches("")){
                    content.setText("0.");
                }
                else{
                    if(!content.getText().toString().contains(".")){
                        content.setText(content.getText().toString()+".");
                    }
                }
            }
        });
        butX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!content.getText().toString().matches("")){
                    String tmp = content.getText().toString();
                    content.setText(tmp.substring(0,tmp.length()-1));
                }
            }
        });
        butX.setOnLongClickListener(
                V -> {
                    content.setText("");
                    return true;
                }
        );
        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentRes.setText("0");
                content.setText("");
                value = 0;
                opStatus = "NOT";
                statusB.setText("=");
            }
        });
    }
    public double FourDecimalPrecision(double base){
        DecimalFormat format = new DecimalFormat("##.0000");
        return Double.valueOf(format.format(base));
    }
    public void dualCondition(String opStatus_){
        Map<String,String> map=new HashMap<String, String>();
        map.put("ADD","+");
        map.put("SUB","-");
        map.put("MUL","*");
        map.put("DIV","/");
        map.put("MOD","%");

        switch (opStatus){
            case "ADD":
                value = FourDecimalPrecision(value+Double.parseDouble(content.getText().toString()));
                contentRes.setText(Double.toString(value));
                opStatus = opStatus_;
                statusB.setText(map.get(opStatus_));
                break;
            case "SUB":
                value = FourDecimalPrecision(value-Double.parseDouble(content.getText().toString()));
                contentRes.setText(Double.toString(value));
                opStatus = opStatus_;
                statusB.setText(map.get(opStatus_));
                break;
            case "MUL":
                value = FourDecimalPrecision(value*Double.parseDouble(content.getText().toString()));
                contentRes.setText(Double.toString(value));
                opStatus = opStatus_;
                statusB.setText(map.get(opStatus_));
                break;
            case "DIV":
                double tmp = Double.parseDouble(content.getText().toString());
                if(tmp != 0){
                    value = FourDecimalPrecision(value/Double.parseDouble(content.getText().toString()));
                    contentRes.setText(Double.toString(value));
                    opStatus = opStatus_;
                    statusB.setText(map.get(opStatus_));
                }
                else{
                    contentRes.setText("Invalid");
                    opStatus = "NOT";
                    statusB.setText("=");
                }
                break;
            case "MOD":
                value = FourDecimalPrecision(value%Double.parseDouble(content.getText().toString()));
                contentRes.setText(Double.toString(value));
                opStatus = opStatus_;
                statusB.setText(map.get(opStatus_));
                break;
            default:
        }
        content.setText("");
    }
}

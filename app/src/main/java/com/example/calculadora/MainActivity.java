package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    TextView Res;
    double num1=0;
    double num2=0;
    int operator=0;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Res = findViewById(R.id.Res);
        Res.setText("0");

    }
    public void escriureZero(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("0");
        }
        else{
            Res.setText(Res.getText()+"0");
        }
    }
    public void escriureUn(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("1");
        }
        else{
            Res.setText(Res.getText()+"1");
        }
    }
    public void escriureDos(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("2");
        }
        else{
            Res.setText(Res.getText()+"2");
        }
    }
    public void escriureTres(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("3");
        }
        else{
            Res.setText(Res.getText()+"3");
        }
    }
    public void escriureQuatre(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("4");
        }
        else{
            Res.setText(Res.getText()+"4");
        }
    }
    public void escriureCinc(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("5");
        }
        else{
            Res.setText(Res.getText()+"5");
        }
    }
    public void escriureSis(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("6");
        }
        else{
            Res.setText(Res.getText()+"6");
        }
    }
    public void escriureSet(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("7");
        }
        else{
            Res.setText(Res.getText()+"7");
        }
    }
    public void escriureVuit(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("8");
        }
        else{
            Res.setText(Res.getText()+"8");
        }
    }
    public void escriureNou(View view){
        if(Res.getText().toString().equals("0")){
            Res.setText("9");
        }
        else{
            Res.setText(Res.getText()+"9");
        }
    }
    public void clear(View view){
        Res.setText("0");
        num1=0;
        num2=0;
        operator=0;
    }
    public void suma(View view){
        operator=1;
        num1=Double.parseDouble(Res.getText().toString());
        Res.setText("0");
    }
    public void resta(View view){
        operator=2;
        num1=Double.parseDouble(Res.getText().toString());
        Res.setText("0");
    }
    public void divisio(View view){
        operator=3;
        num1=Double.parseDouble(Res.getText().toString());
        Res.setText("0");
    }
    public void multi(View view){
        operator=4;
        num1=Double.parseDouble(Res.getText().toString());
        Res.setText("0");
    }
    public void equal(View view){
        double result=0;
        num2=Double.parseDouble(Res.getText().toString());
        if (operator==0){
            result=0;
        }
        if (operator==1){
            result=num1+num2;
        }
        if (operator==2){
            result=num1-num2;
        }
        if (operator==3){
            result=num1/num2;
        }
        if (operator==4){
            result=num1*num2;
        }
        Res.setText(String.valueOf(result));
    }
}

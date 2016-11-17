package com.fortieg.kaddafi.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String str = "";
    String pht = "";
    Character op = 'q';
    float i, num, numtemp;
    TextView showResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (TextView) findViewById(R.id.hasil);
    }

    public void btn1Clicked(View v){
        insert(1);
    }

    public void btn2Clicked(View v){
        insert(2);
    }

    public void btn3Clicked(View v){
        insert(3);
    }

    public void btn4Clicked(View v){
        insert(4);
    }

    public void btn5Clicked(View v){
        insert(5);
    }

    public void btn6Clicked(View v){
        insert(6);
    }

    public void btn7Clicked(View v){
        insert(7);
    }

    public void btn8Clicked(View v){
        insert(8);
    }

    public void btn9Clicked(View v){
        insert(9);
    }

    public void btnplusClicked(View v){
        perform();
        op = '+';
        perhitungan("+");
    }

    public void btnminusClicked(View v){
        perform();
        op = '-';
        perhitungan("-");
    }

    public void btndivideClicked(View v){
        perform();
        op = '/';
        perhitungan("/");
    }

    public void btnmultiClicked(View v){
        perform();
        op = '*';
        perhitungan("X");
    }

    public void btnequalClicked(View v){
        calculate();
    }

    public void btnclearClicked(View v){
        reset();
    }

    private void reset() {
        // TODO Auto-generated method stub
        str = "";
        pht = "";
        op = 'q';
        num = 0;
        numtemp = 0;
        showResult.setText("0");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        perhitungan(Integer.toString(j));
    }

    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;
    }

    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(Float.toString(num));
        str = "";
        pht = "";
        op = 'q';
        num = 0;
        numtemp = 0;
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
    }

    private void perhitungan(String j){
        pht = pht + j;
        showResult.setText(pht);
    }
}

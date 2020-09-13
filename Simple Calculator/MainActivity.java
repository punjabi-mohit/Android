package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.StringTokenizer;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        TextView t1;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bequal,bdot,bAC,bC;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b1=(Button) findViewById(R.id.button);
            b2=(Button) findViewById(R.id.button2);
            b3=(Button) findViewById(R.id.button3);
            b4=(Button) findViewById(R.id.button5);
            b5=(Button) findViewById(R.id.button6);
            b6=(Button) findViewById(R.id.button7);
            b7=(Button) findViewById(R.id.button9);
            b8=(Button) findViewById(R.id.button10);
            b9=(Button) findViewById(R.id.button11);
            b0=(Button) findViewById(R.id.button13);
            badd=(Button) findViewById(R.id.button4);
            bsub=(Button) findViewById(R.id.button8);
            bmul=(Button) findViewById(R.id.button12);
            bdiv=(Button) findViewById(R.id.button16);
            bdot=(Button) findViewById(R.id.button14);
            bequal=(Button) findViewById(R.id.button15);
            bAC=(Button) findViewById(R.id.button17);
            t1=(TextView) findViewById(R.id.textView3);
            bC=(Button) findViewById(R.id.button19);

            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
            b5.setOnClickListener(this);
            b6.setOnClickListener(this);
            b7.setOnClickListener(this);
            b8.setOnClickListener(this);
            b9.setOnClickListener(this);
            b0.setOnClickListener(this);
            bdot.setOnClickListener(this);
            bequal.setOnClickListener(this);
            badd.setOnClickListener(this);
            bmul.setOnClickListener(this);
            bsub.setOnClickListener(this);
            bdiv.setOnClickListener(this);
            bAC.setOnClickListener(this);
            bC.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            String s = t1.getText().toString();
            switch (v.getId()) {
                case R.id.button:
                    t1.setText(s+ "1");
                    break;

                case R.id.button2:
                    t1.setText(s + "2");
                    break;

                case R.id.button3:
                    t1.setText(s + "3");
                    break;

                case R.id.button4:
                    t1.setText(s + "+");
                    break;

                case R.id.button5:
                    t1.setText(s + "4");
                    break;

                case R.id.button6:
                    t1.setText(s + "5");
                    break;

                case R.id.button7:
                    t1.setText(s + "6");
                    break;

                case R.id.button8:
                    t1.setText(s + "-");
                    break;

                case R.id.button9:
                    t1.setText(s + "7");
                    break;

                case R.id.button10:
                    t1.setText(s + "8");
                    break;

                case R.id.button11:
                    t1.setText(s + "9");
                    break;

                case R.id.button12:
                    t1.setText(s + "*");
                    break;

                case R.id.button13:
                    t1.setText(s + "0");
                    break;

                case R.id.button14:
                    t1.setText(s + ".");
                    break;

                case R.id.button15:
                    t1.setText("" + evaluate(t1.getText().toString()));
                    break;

                case R.id.button16:
                    t1.setText(s + "/");
                    break;

                case R.id.button17:
                    t1.setText("");
                    break;

                case R.id.button19:
                    t1.setText(t1.getText().subSequence(0,t1.getText().length()-1));
            }
        }
        public String evaluate(String exp){
            double result=0.0;
            StringTokenizer str=new StringTokenizer(exp,"+-*/",true);
            double num1 = Double.parseDouble(str.nextToken().toString());
            String op=str.nextToken();
            System.out.println(op);
            double num2= Double.parseDouble(str.nextToken().toString());
            if (op.equals("+"))
                result = num1 + num2;
            else if (op.equals("-"))
                result = num1 - num2;
            else if(op.equals("*")){
                result=num1*num2;}
            else if(op.equals("/")){
                result=num1/num2;}
            return String.valueOf(result);
        }
    }
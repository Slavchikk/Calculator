package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView firstNumber;
    TextView secondNumber;
    TextView result;
    Button history;
    Button lftclk;
    Button rghclk;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    Button equals;
    Button clear;
    Button zero;
    Button button1;
    String act;
    String action;
    boolean fnum;
    float res;
    float num1;
    float num2;
    String[] arrw = new String[10];
    int counter = 0;
    int forgt = 0;
    int forward = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act = "";
        fnum = true;

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        result = findViewById(R.id.result);
        history = findViewById(R.id.historical);
        lftclk = findViewById(R.id.leftclk);
        rghclk = findViewById(R.id.rightclk);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equals = findViewById(R.id.equals);
        clear = findViewById(R.id.clear);
        lftclk.setOnClickListener(this);
        rghclk.setOnClickListener(this);
        result.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        equals.setOnClickListener(this);
        zero.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zero:
            case R.id.one:
            case R.id.two:
            case R.id.three:
            case R.id.four:
            case R.id.five:
            case R.id.six:
            case R.id.seven:
            case R.id.eight:
            case R.id.nine:

                Button button = (Button) view;
                String numText;

                if (fnum) {
                    numText = firstNumber.getText().toString();
                    numText += button.getText().toString();
                    firstNumber.setText(numText);
                } else {
                    numText = secondNumber.getText().toString();
                    numText += button.getText().toString();
                    secondNumber.setText(numText);
                }
                break;
            case R.id.plus:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "+";

                break;
            case R.id.minus:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "-";
                break;
            case R.id.multiply:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "x";
                break;
            case R.id.divide:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "/";
                break;

            case R.id.equals:

                num1 = Float.valueOf(firstNumber.getText().toString());
                num2 = Float.valueOf(secondNumber.getText().toString());
                if(action == "+"){
                    res = num1 + num2;
                    result.setText(" = " + String.valueOf(res));

                arrw[forgt] = Float.toString(res);
                    history.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                if(forgt ==10) forgt = 0;


                    break;
                }
                if(action == "-"){
                    res = num1 - num2;
                    result.setText(" = " + String.valueOf(res));
                    arrw[forgt] = Float.toString(res);
                    history.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if(forgt ==10) forgt = 0;
                    break;
                }
                if(action == "x"){
                    res = num1 * num2;
                    result.setText(" = " + String.valueOf(res));
                    arrw[forgt] = Float.toString(res);
                    history.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if(forgt ==10) forgt = 0;

                    break;
                }
                if(action == "/"){
                    res = num1 / num2;
                    result.setText(" = " + String.valueOf(res));

                    arrw[forgt] = Float.toString(res);
                    history.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if(forgt ==10) forgt = 0;
                    break;
                }
            break;
            case R.id.leftclk:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "lefts";


                if(action == "lefts")
                {

                    counter--;
                    if(counter == -1 || counter == 10)
                    { history.setText("Empty!!!"); break;}
                    history.setText(arrw[counter]);

                }
                break;
            case R.id.rightclk:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "right";


                if(action == "right")
                {
                    counter++;
                    if(arrw[counter] == null || counter > 9 || counter < 0)
                    { history.setText("Empty!!!");break;}
                    history.setText(arrw[counter]);

                }
                break;
            case R.id.clear:
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
                fnum = !fnum;
                break;
        }
    }
}
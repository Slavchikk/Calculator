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
                    if ( counter > 9) counter=0;
                    arrw[counter] = Float.toString(res);
                    if (counter == 0)history.setText(arrw[counter]);
                    if (counter == 1) { history.setText(arrw[counter - 1] + "  " +arrw[counter] );}
                    if (counter == 2)
                    {  history.setText(arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 3)
                    { history.setText(arrw[counter - 3] + "  " +arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 4)
                    {history.setText(arrw[counter - 4] + "  " +arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 5)
                    {  history.setText(arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 6)
                    {  history.setText(arrw[counter - 6] + "  " +arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 7)
                    {   history.setText(arrw[counter - 7] + "  " +arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                   if (counter == 8)
                   {   history.setText(arrw[counter - 8] + "  " +arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 9)
                    {    history.setText(arrw[counter - 9] + "  " +arrw[counter - 8] + "  " + arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}


                        counter++;

                    break;
                }
                if(action == "-"){
                    res = num1 - num2;
                    result.setText(" = " + String.valueOf(res));
                    if ( counter > 9) counter=0;
                    arrw[counter] = Float.toString(res);
                    if (counter == 0)history.setText(arrw[counter]);
                    if (counter == 1) { history.setText(arrw[counter - 1] + "  " +arrw[counter] );}
                    if (counter == 2)
                    {  history.setText(arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 3)
                    { history.setText(arrw[counter - 3] + "  " +arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 4)
                    {history.setText(arrw[counter - 4] + "  " +arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 5)
                    {  history.setText(arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 6)
                    {  history.setText(arrw[counter - 6] + "  " +arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 7)
                    {   history.setText(arrw[counter - 7] + "  " +arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 8)
                    {   history.setText(arrw[counter - 8] + "  " +arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 9)
                    {    history.setText(arrw[counter - 9] + "  " +arrw[counter - 8] + "  " + arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}


                    counter++;

                    break;
                }
                if(action == "x"){
                    res = num1 * num2;
                    result.setText(" = " + String.valueOf(res));
                    if ( counter > 9) counter=0;
                    arrw[counter] = Float.toString(res);
                    if (counter == 0)history.setText(arrw[counter]);
                    if (counter == 1) { history.setText(arrw[counter - 1] + "  " +arrw[counter] );}
                    if (counter == 2)
                    {  history.setText(arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 3)
                    { history.setText(arrw[counter - 3] + "  " +arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 4)
                    {history.setText(arrw[counter - 4] + "  " +arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 5)
                    {  history.setText(arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 6)
                    {  history.setText(arrw[counter - 6] + "  " +arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 7)
                    {   history.setText(arrw[counter - 7] + "  " +arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 8)
                    {   history.setText(arrw[counter - 8] + "  " +arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 9)
                    {    history.setText(arrw[counter - 9] + "  " +arrw[counter - 8] + "  " + arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}


                    counter++;

                    break;
                }
                if(action == "/"){
                    res = num1 / num2;
                    result.setText(" = " + String.valueOf(res));
                    if ( counter > 9) counter=0;
                    arrw[counter] = Float.toString(res);
                    if (counter == 0)history.setText(arrw[counter]);
                    if (counter == 1) { history.setText(arrw[counter - 1] + "  " +arrw[counter] );}
                    if (counter == 2)
                    {  history.setText(arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 3)
                    { history.setText(arrw[counter - 3] + "  " +arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 4)
                    {history.setText(arrw[counter - 4] + "  " +arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 5)
                    {  history.setText(arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 6)
                    {  history.setText(arrw[counter - 6] + "  " +arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 7)
                    {   history.setText(arrw[counter - 7] + "  " +arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 8)
                    {   history.setText(arrw[counter - 8] + "  " +arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}
                    if (counter == 9)
                    {    history.setText(arrw[counter - 9] + "  " +arrw[counter - 8] + "  " + arrw[counter - 7] + "  " + arrw[counter - 6] + "  " + arrw[counter - 5] + "  " + arrw[counter - 4] + "  " + arrw[counter - 3] + "  " + arrw[counter - 2] + "  " + arrw[counter - 1] + "  " + arrw[counter]);}


                    counter++;

                    break;
                }

            case R.id.clear:
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
                fnum = !fnum;
                break;
        }
    }
}

package com.example.calculator;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.TextView;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener {
    Button goToSecWin;
    TextView signArea;
    TextView firstNumber;
    TextView secondNumber;
    TextView result;
    Button historical;
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
    Button cos;
    Button sin;
    Button sqrtNums;
    Button stepNums;
    Button equals;
    Button clear;
    Button zero;
    Button button1;
    String act;
    String action;
    boolean fnum;
    double res;
    float num1;
    float num2;
    String[] arrw = new String[10];
    int counter = 0;
    int forgt = 0;
    int forward = 0;
    int acttt = 0;
    String[] spin_arr = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ArrayAdapter<String> spinAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spin_arr);
        spinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spArrw = (Spinner) findViewById(R.id.spinner);
        spin_arr[0] = "История";
        for(int i =1;i < spin_arr.length;i++)
        {
            spin_arr[i] = " ";
        }
        spArrw.setAdapter(spinAdapter);
        act = "";
        fnum = true;
        signArea = findViewById(R.id.signArea);
        goToSecWin = findViewById(R.id.goToSecWin);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        result = findViewById(R.id.result);
        historical = findViewById(R.id.historical);
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
        cos = findViewById(R.id.cos);
        sin = findViewById(R.id.sin);
        sqrtNums = findViewById(R.id.sqrtNums);
        stepNums = findViewById(R.id.stepNums);
        equals = findViewById(R.id.equals);
        clear = findViewById(R.id.clear);
        goToSecWin.setOnClickListener(this);
        historical.setOnClickListener(this);
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
        cos.setOnClickListener(this);
       sin.setOnClickListener(this);
        sqrtNums.setOnClickListener(this);
        stepNums.setOnClickListener(this);
        clear.setOnClickListener(this);
        equals.setOnClickListener(this);
        zero.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.goToSecWin:
                Intent intent = new Intent(Activity_2.this, MainActivity.class);
                startActivity(intent);
                break;
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

                if (fnum && acttt == 0) {

                    numText = firstNumber.getText().toString();
                    numText += button.getText().toString();
                    firstNumber.setText(numText);
                } else {
                    numText = secondNumber.getText().toString();
                    numText += button.getText().toString();
                    secondNumber.setText(numText);
                }
                break;
            case R.id.cos:
                Button buttonCos = (Button) view;
                numText = firstNumber.getText().toString();
                numText += buttonCos.getText().toString();
                firstNumber.setText(numText);

                Button button1 = (Button) view;
                act = button1.getText().toString();
                fnum = !fnum;
                action = "cos";
                break;
            case R.id.sin:
                Button buttonSin = (Button) view;
                numText = firstNumber.getText().toString();
                numText += buttonSin.getText().toString();
                firstNumber.setText(numText);

                Button button2 = (Button) view;
                act = button2.getText().toString();
                fnum = !fnum;
                action = "sin";
                break;
            case R.id.sqrtNums:
                signArea.setText("√x");
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "sqrt";
                break;
            case R.id.stepNums:
                signArea.setText("x^y");
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();
                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "step";
                break;



            case R.id.equals:

                if(action == "cos") {
                    num2 = Float.valueOf(secondNumber.getText().toString());
                    res = Math.cos(num2);
                    result.setText(" = " + String.valueOf(res));
                    spin_arr[forgt] = Double.toString(res);
                    arrw[forgt] = Double.toString(res);
                    historical.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if (forgt == 10) forgt = 0;


                    break;
                }
                if(action == "sin") {
                    num2 = Float.valueOf(secondNumber.getText().toString());
                    res = Math.sin(num2);
                    result.setText(" = " + String.valueOf(res));
                    spin_arr[forgt] = Double.toString(res);
                    arrw[forgt] = Double.toString(res);
                    historical.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if (forgt == 10) forgt = 0;


                    break;
                }
                num1 = Float.valueOf(firstNumber.getText().toString());
                num2 = Float.valueOf(secondNumber.getText().toString());

                if(action == "sqrt"){
                    res = Math.pow(num1,(1/num2));
                    result.setText(" = " + String.valueOf(res));
                    arrw[forgt] = Double.toString(res);
                    spin_arr[forgt] = Double.toString(res);
                    historical.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if(forgt ==10) forgt = 0;
                    break;
                }
                if(action == "step"){
                    res = Math.pow(num1,num2);
                    result.setText(" = " + String.valueOf(res));
                    arrw[forgt] = Double.toString(res);
                    spin_arr[forgt] = Double.toString(res);
                    historical.setText(arrw[forgt]);
                    counter = forgt;
                    forgt++;

                    if(forgt ==10) forgt = 0;

                    break;
                }

                break;
            case R.id.historical:
                button1 = (Button) view;
                if (act == button1.getText().toString()) {
                    act = button1.getText().toString();

                    if (!fnum) {
                        fnum = !fnum;
                    }
                } else {

                    fnum = !fnum;
                }
                action = "histor";

                if(action == "histor")
                {

                    firstNumber.setText(arrw[counter]);
                    acttt = 1;
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
                    { historical.setText("Empty!!!"); break;}
                    historical.setText(arrw[counter]);

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
                    { historical.setText("Empty!!!");break;}
                    historical.setText(arrw[counter]);

                }
                break;
            case R.id.clear:

                firstNumber.setText("");
                secondNumber.setText("");
                signArea.setText("");
                result.setText("");
                acttt=0;
                fnum  = true;
                break;

        }
    }
}
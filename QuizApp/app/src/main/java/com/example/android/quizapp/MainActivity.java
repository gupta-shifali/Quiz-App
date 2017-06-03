package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    CheckBox ques1_ans1;
    CheckBox ques1_ans2;
    CheckBox ques1_ans3;
    RadioButton ques2_ans;
    RadioButton ques3_ans;
    EditText ques4_text;
    RadioButton ques5_ans;
    CheckBox ques6_ans1;
    CheckBox ques6_ans2;
    CheckBox ques6_ans3;
    EditText ques7_text;
    RadioButton ques8_ans;
    RelativeLayout layout1;
    RelativeLayout layout2;
    RelativeLayout layout3;
    RelativeLayout layout4;
    RelativeLayout layout5;
    RelativeLayout layout6;
    RelativeLayout layout7;
    RelativeLayout layout8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ques1_ans1 = (CheckBox) findViewById(R.id.ques1_ans1);
        ques1_ans2 = (CheckBox) findViewById(R.id.ques1_ans2);
        ques1_ans3 = (CheckBox) findViewById(R.id.ques1_ans3);

        ques2_ans = (RadioButton) findViewById(R.id.ques2_ans);

        ques3_ans = (RadioButton) findViewById(R.id.ques3_ans);

        ques4_text = (EditText) findViewById(R.id.ques4_text);

        ques5_ans = (RadioButton) findViewById(R.id.ques5_ans);

        ques6_ans1 = (CheckBox) findViewById(R.id.ques6_ans1);
        ques6_ans2 = (CheckBox) findViewById(R.id.ques6_ans2);
        ques6_ans3 = (CheckBox) findViewById(R.id.ques6_ans3);

        ques7_text = (EditText) findViewById(R.id.ques7_text);

        ques8_ans = (RadioButton) findViewById(R.id.ques8_ans);

        layout1 = (RelativeLayout) findViewById(R.id.layout1);
        layout2 = (RelativeLayout) findViewById(R.id.layout2);
        layout3 = (RelativeLayout) findViewById(R.id.layout3);
        layout4 = (RelativeLayout) findViewById(R.id.layout4);
        layout5 = (RelativeLayout) findViewById(R.id.layout5);
        layout6 = (RelativeLayout) findViewById(R.id.layout6);
        layout7 = (RelativeLayout) findViewById(R.id.layout7);
        layout8 = (RelativeLayout) findViewById(R.id.layout8);

    }

    //Submit function is called when we press submit button in app and tells the total score scored in quiz.
    public void submit(View view){

        String ques4_ans = ques4_text.getText().toString();
        String ans1 = "Prithvi";

        String ques7_ans = ques7_text.getText().toString();
        String ans2 = "Mercury";

        if(ques1_ans1.isChecked() && ques1_ans2.isChecked() && ques1_ans3.isChecked())
        {
            score+=20;
        }
        if(ques2_ans.isChecked())
        {
            score+=10;
        }
        if(ques3_ans.isChecked())
        {
            score+=10;
        }
        if(ques4_ans.equalsIgnoreCase(ans1))
        {
            score+=10;
        }
        if(ques5_ans.isChecked())
        {
            score+=10;
        }
        if(ques6_ans1.isChecked() && ques6_ans2.isChecked() && ques6_ans3.isChecked())
        {
            score+=20;
        }
        if(ques7_ans.equalsIgnoreCase(ans2))
        {
            score+=10;
        }
        if(ques8_ans.isChecked())
        {
            score+=10;
        }

        diplayScore(score);

        if(score>=80)
        {
            Toast toast = Toast.makeText(MainActivity.this, "Great... :-D\nYou scored " + score, Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(score>=40)
        {
            Toast toast = Toast.makeText(MainActivity.this, "Keep it up... :-)\nYou scored " + score, Toast.LENGTH_SHORT);
            toast.show();
        }
        else
        {
            Toast toast = Toast.makeText(MainActivity.this, "Better, luck next time... :-/\nYou scored " + score, Toast.LENGTH_SHORT);
            toast.show();
        }

        layout1.setVisibility(View.VISIBLE);
        layout2.setVisibility(View.VISIBLE);
        layout3.setVisibility(View.VISIBLE);
        layout4.setVisibility(View.VISIBLE);
        layout5.setVisibility(View.VISIBLE);
        layout6.setVisibility(View.VISIBLE);
        layout7.setVisibility(View.VISIBLE);
        layout8.setVisibility(View.VISIBLE);

    }

    //Reset function is called when we press reset button in app and it reset the quiz.
    public void reset(View view)
    {
        CheckBox ques1_option4 = (CheckBox) findViewById(R.id.ques1_option4);
        ques1_option4.setChecked(false);

        RadioGroup ques2_group = (RadioGroup) findViewById(R.id.ques2_group);
        RadioGroup ques3_group = (RadioGroup) findViewById(R.id.ques3_group);
        RadioGroup ques5_group = (RadioGroup) findViewById(R.id.ques5_group);
        RadioGroup ques8_group = (RadioGroup) findViewById(R.id.ques8_group);
        ques2_group.clearCheck();
        ques3_group.clearCheck();
        ques5_group.clearCheck();
        ques8_group.clearCheck();

        ques1_ans1.setChecked(false);
        ques1_ans2.setChecked(false);
        ques1_ans3.setChecked(false);
        ques4_text.setText("");
        ques6_ans1.setChecked(false);
        ques6_ans2.setChecked(false);
        ques6_ans3.setChecked(false);
        ques7_text.setText("");
        
        score = 0;
        diplayScore(score);

        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);
        layout4.setVisibility(View.GONE);
        layout5.setVisibility(View.GONE);
        layout6.setVisibility(View.GONE);
        layout7.setVisibility(View.GONE);
        layout8.setVisibility(View.GONE);
    }

    //This fn displays the sore on the app.
    public void diplayScore(int number)
    {
        TextView total_score = (TextView) findViewById(R.id.score);
        total_score.setText("" + number);
    }

}

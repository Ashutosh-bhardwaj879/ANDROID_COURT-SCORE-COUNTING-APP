package com.meicode.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }

    int globalScoreA=0;
    int globalScoreB=0;

    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View v){
        globalScoreA+=3;
        displayForTeamA(globalScoreA);

    }

    public void addTwoForTeamA(View v){
        globalScoreA+=2;
        displayForTeamA(globalScoreA);
    }

    public void addOneForTeamA(View v){
        globalScoreA+=1;
        displayForTeamA(globalScoreA);
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View v){
        globalScoreB+=3;
        displayForTeamB(globalScoreB);
    }

    public void addTwoForTeamB(View v){
        globalScoreB+=2;
        displayForTeamB(globalScoreB);
    }

    public void addOneForTeamB(View v){
        globalScoreB+=1;
        displayForTeamB(globalScoreB);
    }

    public void resetButton(View v){
        globalScoreB = 0;
        globalScoreA = 0;
        displayForTeamB(globalScoreB);
        displayForTeamA(globalScoreA);
    }
}
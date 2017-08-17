package com.example.kevin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

// This is all for Team A
    public void addThreePointsTeamA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsTeamA(View view){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void freeThrowTeamA(View view){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void resetScore(View view){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    // This is all for Team B

    public void addThreePointsTeamB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoPointsTeamB(View view){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowTeamB(View view){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }


}

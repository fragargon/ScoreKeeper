package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class MainActivity extends AppCompatActivity {

    /**
     * Define a String Variable for storing User Input
     */

    int scoreCornerA = 0;
    int scoreCornerB = 0;
    int scoreFaultA = 0;
    int scoreFaultB = 0;
    int scorePenaltyA = 0;
    int scorePenaltyB = 0;
    int scoreRedCardA = 0;
    int scoreRedCardB = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreYellowCardA = 0;
    int scoreYellowCardB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String userInputText="";
        //Define myEditableText TeamA and TeamB
        EditText myTeamA = (EditText) findViewById(R.id.TeamA);
        EditText myTeamB = (EditText) findViewById(R.id.TeamB);
        //get myEditableText() input and convert it to string, store on userInputText
        userInputText = myTeamA.getText().toString();
        userInputText = myTeamB.getText().toString();
    }

    /**
     * Increase the goal for TeamA by 1 point
     */

    public void addGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Display the goal for teamA
     */

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the goal for TeamB by 1 point
     */

    public void addGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Display the goal for TeamB
     */

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the penalty for teamA by 1 point
     */

    public void addPenaltyTeamA(View view) {
        scorePenaltyA = scorePenaltyA + 1;
        displayScorePenaltyA(scorePenaltyA);
    }

    /**
     * Display the penalty for TeamA
     */
    public void displayScorePenaltyA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePenaltyA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the penalty for teamB by 1 point
     */

    public void addPenaltyTeamB(View view) {
        scorePenaltyB = scorePenaltyB + 1;
        displayScorePenaltyB(scorePenaltyB);
    }

    /**
     * Display the penalty for TeamB
     */
    public void displayScorePenaltyB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorePenaltyB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the corner for TeamA by 1 point
     */
    public void addCornerTeamA(View view) {
        scoreCornerA = scoreCornerA + 1;
        displayScoreCornerA(scoreCornerA);
    }

    /**
     * Display corner for TeamA
     */
    public void displayScoreCornerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCornerA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the corner for TeamB by 1 point
     */
    public void addCornerTeamB(View view) {
        scoreCornerB = scoreCornerB + 1;
        displayScoreCornerB(scoreCornerB);
    }

    /**
     * Display corner for TeamB
     */
    public void displayScoreCornerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCornerB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the fault for TeamA by 1 point
     */
    public void addFaultTeamA(View view) {
        scoreFaultA = scoreFaultA + 1;
        displayScoreFaultA(scoreFaultA);
    }

    /**
     * Display fault for TeamA
     */
    public void displayScoreFaultA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreFaultA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the fault for TeamB by 1 point
     */
    public void addFaultTeamB(View view) {
        scoreFaultB = scoreFaultB + 1;
        displayScoreFaultB(scoreFaultB);
    }

    /**
     * Display fault for TeamB
     */
    public void displayScoreFaultB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreFaultB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the redCard for TeamA by 1 point
     */
    public void addRedCardTeamA(View view) {
        scoreRedCardA = scoreRedCardA + 1;
        displayScoreRedCardA(scoreRedCardA);
    }

    /**
     * Display redCard for TeamA
     */
    public void displayScoreRedCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreRedCardTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the redCard for TeamB by 1 point
     */
    public void addRedCardTeamB(View view) {
        scoreRedCardB = scoreRedCardB + 1;
        displayScoreRedCardB(scoreRedCardB);
    }

    /**
     * Display redCard for TeamB
     */
    public void displayScoreRedCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreRedCardTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase yellowCard for TeamA by 1 point
     */
    public void addYellowCardTeamA(View view) {
        scoreYellowCardA = scoreYellowCardA + 1;
        displayScoreYellowCardA(scoreYellowCardA);
    }

    /**
     * display yellowCard for TeamA
     */
    public void displayScoreYellowCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreYellowCardTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase yellowCard for TeamB by 1 point
     */
    public void addYellowCardTeamB(View view) {
        scoreYellowCardB = scoreYellowCardB + 1;
        displayScoreYellowCardB(scoreYellowCardB);
    }

    /**
     * display yellowCard for TeamB
     */
    public void displayScoreYellowCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreYellowCardTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset all score
     */
    public void resetAllScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scorePenaltyA = 0;
        scorePenaltyB = 0;
        scoreCornerA = 0;
        scoreCornerB = 0;
        scoreFaultA = 0;
        scoreFaultB = 0;
        scoreRedCardA = 0;
        scoreRedCardB = 0;
        scoreYellowCardA = 0;
        scoreYellowCardB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayScorePenaltyA(scorePenaltyA);
        displayScorePenaltyB(scorePenaltyB);
        displayScoreCornerA(scoreCornerA);
        displayScoreCornerB(scoreCornerB);
        displayScoreFaultA(scoreFaultA);
        displayScoreFaultB(scoreFaultB);
        displayScoreRedCardA(scoreRedCardA);
        displayScoreRedCardB(scoreRedCardB);
        displayScoreYellowCardA(scoreYellowCardA);
        displayScoreYellowCardB(scoreYellowCardB);
    }
}

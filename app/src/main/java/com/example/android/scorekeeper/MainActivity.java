package com.example.android.scorekeeper;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /**
     * Define constant key to store the score value on configuration change
     */

    public static final String KEY_SCORE_A = "scoreA";
    public static final String KEY_SCORE_B = "scoreB";
    public static final String KEY_PENALTY_A = "penaltyA";
    public static final String KEY_PENALTY_B = "penaltyB";
    public static final String KEY_CORNER_A = "cornerA";
    public static final String KEY_CORNER_B = "cornerB";
    public static final String KEY_FAULT_A = "faultA";
    public static final String KEY_FAULT_B = "faultB";
    public static final String KEY_RCA = "rcA";
    public static final String KEY_RCB = "rcB";
    public static final String KEY_YCA = "ycA";
    public static final String KEY_YCB = "ycB";
    public static final String KEY_TEAM_NAME_A = "teamAName";
    public static final String KEY_TEAM_NAME_B = "teamBName";

    /**
     * Define a String Variable for User Input
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
    EditText teamA;
    EditText teamB;

    /**
     * save instance in case change portrait/landscape mode
     */

    @Override
    protected void onSaveInstanceState(Bundle oustate) {
        super.onSaveInstanceState(oustate);
        oustate.putInt(KEY_SCORE_A, scoreTeamA);
        oustate.putInt(KEY_SCORE_B, scoreTeamB);
        oustate.putInt(KEY_PENALTY_A, scorePenaltyA);
        oustate.putInt(KEY_PENALTY_B, scorePenaltyB);
        oustate.putInt(KEY_CORNER_A, scoreCornerA);
        oustate.putInt(KEY_CORNER_B, scoreCornerB);
        oustate.putInt(KEY_FAULT_A, scoreFaultA);
        oustate.putInt(KEY_FAULT_B, scoreFaultB);
        oustate.putInt(KEY_RCA, scoreRedCardA);
        oustate.putInt(KEY_RCB, scoreRedCardB);
        oustate.putInt(KEY_YCA, scoreYellowCardA);
        oustate.putInt(KEY_YCB, scoreYellowCardB);
        oustate.putString(KEY_TEAM_NAME_A, teamA.getText().toString());
        oustate.putString(KEY_TEAM_NAME_B, teamB.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  Hide Keyboard when Activity starts
         */

        InputMethodManager imm =(InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);

        /**
         * Set Teams Name, color text, Clear Focus and Cursor on EditText
         */

        teamA = (EditText) findViewById(R.id.TeamA);
        teamA.setTextColor(Color.WHITE);
        teamA.clearFocus();
        teamA.setCursorVisible(false);
        teamB = (EditText) findViewById(R.id.TeamB);
        teamB.setTextColor(Color.WHITE);
        teamB.clearFocus();
        teamB.setCursorVisible(false);


        /**
         * save instance score in case orientation change
         */
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt(KEY_SCORE_A);
            scoreTeamB = savedInstanceState.getInt(KEY_SCORE_B);
            scorePenaltyA = savedInstanceState.getInt(KEY_PENALTY_A);
            scorePenaltyB = savedInstanceState.getInt(KEY_PENALTY_B);
            scoreCornerA = savedInstanceState.getInt(KEY_CORNER_A);
            scoreCornerB = savedInstanceState.getInt(KEY_CORNER_B);
            scoreFaultA = savedInstanceState.getInt(KEY_FAULT_A);
            scoreFaultB = savedInstanceState.getInt(KEY_FAULT_B);
            scoreRedCardB = savedInstanceState.getInt(KEY_RCA);
            scoreRedCardB = savedInstanceState.getInt(KEY_RCB);
            scoreYellowCardA = savedInstanceState.getInt(KEY_YCA);
            scoreYellowCardB = savedInstanceState.getInt(KEY_YCB);
            teamA.setText(savedInstanceState.getString(KEY_TEAM_NAME_A));
            teamB.setText(savedInstanceState.getString(KEY_TEAM_NAME_B));


        }

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
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
     * Display score corner for TeamA
     */
    public void displayScoreCornerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCornerA);
        scoreView.setTextColor(Color.WHITE);
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
     * Display score corner for TeamB
     */
    public void displayScoreCornerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreCornerB);
        scoreView.setTextColor(Color.WHITE);
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
     * Display score fault for TeamA
     */
    public void displayScoreFaultA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreFaultA);
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
        scoreView.setTextColor(Color.WHITE);
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
     * Display yellowCard for TeamA
     */
    public void displayScoreYellowCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreYellowCardTeamA);
        scoreView.setTextColor(Color.WHITE);
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
     * Display yellowCard for TeamB
     */
    public void displayScoreYellowCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreYellowCardTeamB);
        scoreView.setTextColor(Color.WHITE);
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
        teamA.setText("");
        teamB.setText("");
    }
}

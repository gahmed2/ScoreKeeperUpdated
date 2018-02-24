package com.example.gehad.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String STATE_SCORETEAMA = "scoreTeamA";
    static final String STATE_SCORETEAMB = "scoreTeamB";
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    private TextView scoreViewA;
    private TextView scoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA = findViewById(R.id.scoreTeamA);
        scoreViewB = findViewById(R.id.scoreTeamB);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state
        savedInstanceState.putInt(STATE_SCORETEAMA, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORETEAMB, scoreTeamB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        scoreTeamA = savedInstanceState.getInt(STATE_SCORETEAMA);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORETEAMB);

        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    /**
     * Team A
     * Add Six to Team A score
     */
    public void addSixTeamA(View v) {
        scoreTeamA += 6;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add Three to Team A score
     */
    public void addThreeTeamA(View v) {
        scoreTeamA += 3;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add Two to Team A score
     */
    public void addTwoTeamA(View v) {
        scoreTeamA += 2;
        displayTeamA(scoreTeamA);
    }

    /**
     * Add one to Team A score
     */
    public void addOneTeamA(View v) {
        scoreTeamA++;
        displayTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     **/
    public void displayTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Team B
     * Add Six to Team B score
     */
    public void addSixTeamB(View v) {
        scoreTeamB += 6;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add Three to Team B score
     */
    public void addThreeTeamB(View v) {
        scoreTeamB += 3;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add Two to Team B score
     */
    public void addTwoTeamB(View v) {
        scoreTeamB += 2;
        displayTeamB(scoreTeamB);
    }

    /**
     * Add one to Team B score
     */
    public void addOneTeamB(View v) {
        scoreTeamB++;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     **/
    public void displayTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * Reset both scores
     */
    public void Reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}

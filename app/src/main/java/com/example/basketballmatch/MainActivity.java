package com.example.basketballmatch;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * variable Goals count team Egypt
     */
    int scoreTeamEgypt = 0;
    MediaPlayer mediaPlayerEgypt;

    /**
     * variable Goals count team Germany
     */
    int scoreTeamGermany = 0;
    MediaPlayer mediaPlayerGermany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Egypt.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
        mediaPlayerEgypt = MediaPlayer.create(this, R.raw.pharaoh);
        if(scoreA >= 10){
            mediaPlayerEgypt.start();
        }
    }

    /**
     * Increase the score for Egypt by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamEgypt += 1;
        displayForTeamA(scoreTeamEgypt);
        Toast.makeText(this, "The Egyptian team scored a " + scoreTeamEgypt + " Goal", Toast.LENGTH_LONG).show();
    }

    /**
     * Increase the score for Egypt by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamEgypt += 2;
        displayForTeamA(scoreTeamEgypt);
        Toast.makeText(this, "The Egyptian team scored a " + scoreTeamEgypt + " Goal", Toast.LENGTH_LONG).show();
    }

    /**
     * Increase the score for Egypt by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamEgypt += 3;
        displayForTeamA(scoreTeamEgypt);
        Toast.makeText(this, "The Egyptian team scored a " + scoreTeamEgypt + " Goal", Toast.LENGTH_LONG).show();
    }

    /**
     * Displays the given score for Germany.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
        mediaPlayerGermany = MediaPlayer.create(this, R.raw.germany);

        if(scoreB >= 10){
            mediaPlayerGermany.start();
        }
    }

    /**
     * Increase the score for Germany by 3 point.
     */
    public void addThreeForTeamB(View view) {
        scoreTeamGermany += 3;
        displayForTeamB(scoreTeamGermany);
        Toast.makeText(this, "The Germans team scored a " + scoreTeamGermany + " Goal", Toast.LENGTH_SHORT).show();
    }

    /**
     * Increase the score for Germany by 2 points.
     */
    public void addTwoForTeamB(View view) {
        scoreTeamGermany += 2;
        displayForTeamB(scoreTeamGermany);
        Toast.makeText(this, "The Germans team scored a " + scoreTeamGermany + " Goal", Toast.LENGTH_SHORT).show();
    }

    /**
     * Increase the score for Germany by 1 point.
     */
    public void addOneForTeamB(View view) {
        scoreTeamGermany += 1;
        displayForTeamB(scoreTeamGermany);
        Toast.makeText(this, "The Germans team scored a " + scoreTeamGermany + " Goal", Toast.LENGTH_SHORT).show();
    }

    /**
     *Foul Team Egypt button to decrease
     */
    public void FoulA(View view) {
        scoreTeamEgypt -= 2;
        displayForTeamA(scoreTeamEgypt);
        Toast.makeText(this, "Oooo! The Egyption Team is lost 2 goals", Toast.LENGTH_SHORT).show();
    }

    /**
     *Foul Team Germany button to decrease
     */
    public void FoulB(View view) {
        scoreTeamGermany -= 2;
        displayForTeamB(scoreTeamGermany);
        Toast.makeText(this, "Oooo! The Germans Team is lost 2 goals", Toast.LENGTH_SHORT).show();
    }

    /**
     * Reset button to reset score to 0 point.
     */
    public void ResetBtn(View view) {
        scoreTeamEgypt = 0;
        displayForTeamA(scoreTeamEgypt);
        scoreTeamGermany = 0;
        displayForTeamB(scoreTeamGermany);
        Toast.makeText(this, "The Egyption and Germans Teams is Reset the Match", Toast.LENGTH_SHORT).show();
    }

}
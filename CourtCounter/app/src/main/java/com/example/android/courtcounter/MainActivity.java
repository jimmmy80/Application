package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    /*Track the score for team B*/
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /*Increase the score by a point*/
    public void addpointTeamA(View view){
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }

    /*Increase the score by a point*/
    public void addpointTeamB(View view){
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }
    /*Increase the score by two points*/
    public void addpointstwoTeamA(View view){
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
    }
    /*Increase the score by two points*/
    public void addpointstwoTeamB(View view){
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }
    /*Increase the score by three points*/
    public void addpointsthreeTeamA(View v){
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);
    }
    /*Increase the score by three points*/
    public void addpointsthreeTeamB(View view){
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }
   //@Override
   /// public boolean onOptionsItemsSelected(MenuItem menu){
    //int id = items.
   //}
    public void resetScore(View v){
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
           ScoreTeamA = 0;
           ScoreTeamB = 0;
    }
  /*Displays the given score for teamA */
  public void displayForTeamA(int score){
      TextView scoreView = (TextView)findViewById(R.id.teams_A_score);
      scoreView.setText(String.valueOf(score));
  }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.teams_B_score);
        scoreView.setText(String.valueOf(score));
    }
}


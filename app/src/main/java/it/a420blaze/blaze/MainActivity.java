package it.a420blaze.blaze;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import static it.a420blaze.blaze.R.array.snoopLines;
import static it.a420blaze.blaze.R.id.loginButton;
import static it.a420blaze.blaze.R.id.snoopButton;
import static it.a420blaze.blaze.R.id.timeButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Grab the button
        Button sButton = (Button) findViewById(snoopButton);
        Button tButton = (Button) findViewById(timeButton);
        Button aButton = (Button) findViewById(loginButton);

        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sLines[] = getResources().getStringArray(snoopLines);
                Random randy = new Random();
                int n = randy.nextInt(sLines.length);

                sendSnoopLine(sLines[n]);
            }
        });

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tLines[] = getResources().getStringArray(R.array.timeLines);
                Random randy = new Random();
                int n = randy.nextInt(tLines.length);

                sendTimeLine(tLines[n]);

                }
        });

        aButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startLogin();
            }
        });

    }
        private void sendSnoopLine(String snoopLine){
            Intent intent = new Intent(this, SnoopLine.class);
            intent.putExtra("Snoop Line", snoopLine);

            startActivity(intent);
    }
        private void sendTimeLine(String timeLine){
            Intent intent = new Intent(this, TimeLine.class);
            intent.putExtra("Time Line", timeLine);

            startActivity(intent);
        }

        private void startLogin(){
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        }










}




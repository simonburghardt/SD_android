package it.a420blaze.blaze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TimeLine extends AppCompatActivity {

    final int[] imagesTime = {R.drawable.time0, R.drawable.time1, R.drawable.time2, R.drawable.time3, R.drawable.time4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

        Bundle pickupData = getIntent().getExtras();

        if (pickupData == null){
            return;
        }

        String receivedLine = pickupData.getString("Time Line");
        TextView newLine = (TextView) findViewById(R.id.text1);

        if (receivedLine.length() > 40){
            newLine.setTextSize(28);
        }
        newLine.setText(receivedLine);

        Random r = new Random();
        int x = r.nextInt(5);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(imagesTime[x]);

        Button retryButton = (Button) findViewById(R.id.button2);

        retryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

        });
    }
}

package it.a420blaze.blaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class SnoopLine extends AppCompatActivity {

    final int[] imagesSnoop = {R.drawable.snoop_dogg, R.drawable.snoop2, R.drawable.snoop3, R.drawable.snoop4, R.drawable.snoop5, R.drawable.snoop6, R.drawable.snoop7, R.drawable.snoop8, R.drawable.snoop9,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snoop_line);

        Bundle pickupData = getIntent().getExtras();

        if (pickupData == null){
            return;
        }

        String receivedLine = pickupData.getString("Snoop Line");
        TextView newLine = (TextView) findViewById(R.id.text1);
        newLine.setText(receivedLine);

        Random r = new Random();
        int x = r.nextInt(9);

        ImageView img = (ImageView) findViewById(R.id.imageView3);
        img.setImageResource(imagesSnoop[x]);


        Button retryButton = (Button) findViewById(R.id.button2);

        retryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }

            });

    }
}

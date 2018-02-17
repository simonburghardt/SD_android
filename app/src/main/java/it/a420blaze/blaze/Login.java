package it.a420blaze.blaze;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static it.a420blaze.blaze.R.id.logButton;
import static it.a420blaze.blaze.R.id.registerButton;
import static it.a420blaze.blaze.R.id.testText;
import static it.a420blaze.blaze.R.id.userEingabe;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button lButton = (Button) findViewById(logButton);
        Button rButton = (Button) findViewById(registerButton);
        EditText username = (EditText) findViewById(userEingabe);
        final TextView iv = (TextView) findViewById(testText);


        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMain();
            }
        });

        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startRegister();
            }
        });
    }

        private void startMain(){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
     }

        private void startRegister(){
            Intent i = new Intent(this, Register.class);
            startActivity(i);
        }



}



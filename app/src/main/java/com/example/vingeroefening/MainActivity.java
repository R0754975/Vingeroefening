package com.example.vingeroefening;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int personen = 2;
    double ei = 1;
    int bloem = 250;
    double melk = 25;
    TextView tv_personen;
    TextView tv_ei;
    TextView tv_bloem;
    TextView tv_melk;
    private Button trekafButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv_personen = (TextView)findViewById(R.id.personen);
        tv_ei = (TextView)findViewById(R.id.ei);
        tv_bloem = (TextView)findViewById(R.id.bloem);
        tv_melk = (TextView)findViewById(R.id.melk);
        trekafButton = findViewById(R.id.trekaf_button);
        update();


        Button telopButton = (Button) findViewById(R.id.telop_button);
        telopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personen++;
                ei = ei + 0.5;
                bloem = bloem + 125;
                melk = melk + 12.5;
                update();
            }
        });

        Button trekafButton = (Button) findViewById(R.id.trekaf_button);
        trekafButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personen--;
                ei = ei - 0.5;
                bloem = bloem - 125;
                melk = melk - 12.5;
                update();
            }
        });
    }


    public void update() {
        if(personen == 1) {
            tv_personen.setText(String.format("Pannenkoeken voor %s persoon", personen));
        }
        else {
            tv_personen.setText(String.format("Pannenkoeken voor %s personen", personen));
        }
        if(ei <= 1) {
            tv_ei.setText(String.format("%s  ei", ei));
        }
        else {
            tv_ei.setText(String.format("%s  eieren", ei));
        }
        tv_bloem.setText(String.format("%s g bloem", bloem));
        tv_melk.setText(String.format("%s dl melk", melk));
        trekafButton.setEnabled(personen > 1);

    }

}

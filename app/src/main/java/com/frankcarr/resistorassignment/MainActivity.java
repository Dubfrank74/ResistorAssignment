package com.frankcarr.resistorassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

   private Button Band1display,Band2display,Band3display,BandTolerencedisplay;

   private Spinner Band1Spin1, Band2Spin2, Band3Spin3, BandTolSpin4;

   private TextView txtResistance, txtTolerence;

   int ColorArrayBand1[] = {0,10,20,30,40,50,60,70,80,90};
   int ColorArrayBand2[] = {1,2,3,4,5,6,7,8,9,0};
   long ColorArrayBand3[] = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
   double ColorArrayTolerence[] = {0.01,0.02,0.05,0.1};

   long Totalresistance = 0;
   double Tolerence = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Band1display = findViewById(R.id.btnBand1);
        Band2display = findViewById(R.id.btnBand2);
        Band3display = findViewById(R.id.btnBand3);
        BandTolerencedisplay = findViewById(R.id.btnBandTolerence);

        Band1Spin1 = findViewById(R.id.spin1Band1);
        Band2Spin2 = findViewById(R.id.spin2Band2);
        Band3Spin3 = findViewById(R.id.spin3Band3);
        BandTolSpin4 = findViewById(R.id.spin3Band4);

        txtResistance = findViewById(R.id.tvResistance);
        txtTolerence = findViewById(R.id.tvTolerence);

     //   Band1display.setBackgroundColor(Color.WHITE);
     //   Band2display.setBackgroundColor(Color.YELLOW);
     //   Band3display.setBackgroundColor(Color.BLACK);
     //   BandTolerencedisplay.setBackgroundColor(getResources().getColor(R.color.colorgold));

        //ADD Listeners

        Band1Spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                updateBandResistance();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}

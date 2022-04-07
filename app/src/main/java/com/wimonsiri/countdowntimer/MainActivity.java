package com.wimonsiri.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int buttonPress = 0;
    //count down timer, a background task
    private TextView mTime1, mTime2, mTime3;
    private CountDownTimer timer1, timer2, timer3;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTime1 = (TextView) findViewById(R.id.textView1);
        mTime2 = (TextView) findViewById(R.id.textView2);
        mTime3 = (TextView) findViewById(R.id.textView3);
        timer1 = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                mTime1.setText("Time 1, seconds remaining : " +

                        millisUntilFinished / 1000);

            }
            public void onFinish() {
                mTime1.setText("Time 1, Done!");
            }
        };
        timer2 = new CountDownTimer(20000, 500) {
            public void onTick(long millisUntilFinished) {
                mTime2.setText("Time 2, milliSeconds remaining : " +

                        millisUntilFinished);

            }
            public void onFinish() {
                mTime2.setText("Time 2, Done!");
            }
        };
        timer3 = new CountDownTimer(10000, 100) {
            public void onTick(long millisUntilFinished) {
                mTime3.setText("Time 3, milliSeconds remaining : " +
                        millisUntilFinished);

            }
            public void onFinish() {
                mTime3.setText("Time 3, Done!");
            }
        };
        Button startButton = (Button) findViewById(R.id.trigger);
        startButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                timer1.start();
                timer2.start();
                timer3.start();
            }
        });
    }
}
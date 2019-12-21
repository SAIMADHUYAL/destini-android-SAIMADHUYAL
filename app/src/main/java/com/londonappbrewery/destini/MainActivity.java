package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mTopButton,mBottomButton;
    TextView mStoryText;

    int counter =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mStoryText = findViewById(R.id.storyTextView);

        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter ==1 || counter == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    counter =3;
                }
                else{
                    mStoryText.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
             }

        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter == 1) {
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryText.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    counter =2;
                }
                else if(counter ==2){
                    mStoryText.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
                else{
                    mStoryText.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
            }
        });

    }
}

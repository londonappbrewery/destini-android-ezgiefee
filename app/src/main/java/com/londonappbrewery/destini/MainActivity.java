package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);




        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2) {
                    mTopButton.setText(R.string.T3_Ans1);
                    mStoryTextView.setText(R.string.T3_Story);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else {
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    mTopButton.setText(R.string.T2_Ans1);
                    mStoryTextView.setText(R.string.T2_Story);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }else{
                    mStoryTextView.setText(R.string.T5_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }
            }
        });

    }
}

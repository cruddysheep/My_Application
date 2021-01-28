package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
    Alex Ratkovec
    Pre-work for codepath.org
    January 18,2021
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView testView = ((TextView) findViewById(R.id.nameColorChange));

        // User can tap a button to change the text color of the label.
        findViewById(R.id.colorButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // change the text color of the label
                ((TextView) findViewById(R.id.nameColorChange)).setTextColor(getResources().getColor(R.color.purple_200));
            }
        });

        findViewById(R.id.changeBackgroundColorButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            //  User can tap a button to change the color of the background view
            public void onClick(View v) {

                (findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.teal_200));

            }
        });

        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            // User can tap a button to change the text string of the label - Android is
            public void onClick(View v) {

                ((TextView) findViewById(R.id.nameColorChange)).setText("Awesome!");

            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener()
        {
            @Override
            // User can tap on the background view to reset all views to default settings.
            public void onClick(View v) {

                // User can tap on the background view to reset all views to default settings.
                //1. Reset background color
                (findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.orange));

                //2. Reset from Awesome -> Welcome Alex!
                testView.setText("Welcome Alex!");

                //3. Reset text color
                testView.setTextColor(getResources().getColor(R.color.textColor));

            }
        });

        findViewById(R.id.CustomText).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // change Welcome Message to Custome Text
                String user_Entered_Text = ((EditText) findViewById(R.id.editTextByUser)).getText().toString();
                if(user_Entered_Text.isEmpty())
                {
                    testView.setText("Enter your own text!");
                }
                else {
                    testView.setText(user_Entered_Text);
                }
            }
        });

    }
}
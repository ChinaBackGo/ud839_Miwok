package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String[] words = new String[11];
        ArrayList<String> words = new ArrayList<String>();

        words.add(0, "zero");
        words.add(1, "one");
        words.add(2, "two");
        words.add(3, "three");
        words.add(4, "four");
        words.add(5, "five");
        words.add(6, "six");
        words.add(7, "seven");
        words.add(8, "eight");
        words.add(9, "nine");
        words.add(10, "ten");


        LinearLayout rootView =  (LinearLayout)findViewById(R.id.activity_numbers);

        // Loop the ArrayList using a Java Iterator
        // TODO: How to get the iterator index?
        // TODO: how to use foreach here?
        Iterator<String> wordsIterator = words.iterator();
        while(wordsIterator.hasNext()) {
            //Create a new TextView, set the text to word
            TextView childView = new TextView(this);
            childView.setText(wordsIterator.next());

            //Add the new wordTextView to parent numbersView
            rootView.addView(childView);

        //    Log.i("NumbersActivity.java", "Word at Index:" + index + " " + word);
        //    index++;
        }

        /*
        // Loop the Array List using a for loop
        for (int i = 0; i < words.size(); i++) {
            Log.i("NumbersActivity.java", "Word at Index:" + i + " " + words.get(i));
        }
        */

    }
}

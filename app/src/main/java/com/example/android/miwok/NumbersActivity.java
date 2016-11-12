package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String[] words = new String[11];
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add(0, "zero");
        words.add(new Word("zero", "dingle"));
        words.add(new Word("lutti", "one"));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        //LinearLayout rootView =  (LinearLayout)findViewById(R.id.activity_numbers);
        /*
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
        */

        /*
        // Loop the Array List using a for loop
        for (int i = 0; i < words.size(); i++) {
            Log.i("NumbersActivity.java", "Word at Index:" + i + " " + words.get(i));
        }
        */

    }
}

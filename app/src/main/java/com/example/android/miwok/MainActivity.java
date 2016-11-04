/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Set Numbers activity onClickListener
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, NumbersActivity.class);
            }
        });

        //Set Family activity onClickListener
        TextView familyTextView = (TextView) findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, FamilyActivity.class);
            }
        });

        //Set Colors activity onClickListener
        TextView colorsTextView = (TextView) findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, ColorsActivity.class);
            }
        });

        //Set Phrases activity onClickListener
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view, PhrasesActivity.class);
            }
        });

    }

    public void openActivity (View view, Class cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
        Log.i("MainActivity:openActivity", "Opening: " + cls.getCanonicalName());
    }
}

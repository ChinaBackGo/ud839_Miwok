package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * WordAdapter Class
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        // parent in this case should be the listview ViewGroup?
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the Miwok Translation from the current Word object and
        // set this text on the name TextView
        miwokWordTextView.setText(currentWord.getMiwokTransation());

        // Find the TextView in the list_item.xml layout with the ID default_word
        TextView defautWordTextView = (TextView) listItemView.findViewById(R.id.default_word);
        // Get the default translation from the current word object and
        // set this text on the number TextView
        defautWordTextView.setText(currentWord.getDefaultTranslation());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * WordAdapter Class
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
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
        final Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokWordTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the Miwok Translation from the current Word object and
        // set this text on the name TextView
        miwokWordTextView.setText(currentWord.getMiwokTransation());

        //TODO: do this with a release of mediaplayer
        miwokWordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
                Log.i("WordAdapter", "onClick: " + currentWord.getDefaultTranslation());
                MediaPlayer mMediaPlayer = MediaPlayer.create(getContext(), R.raw.color_black);
                mMediaPlayer.start();
                // TODO : playing around mMediaPlayer.setOnCompletionListener (MediaPlayer.OnCompletionListener listener)
                //mMediaPlayer.release();
=======
                Log.i("WordAdapter", "onClick: " + currentWord.getRawResourceId());
                MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getRawResourceId());
                mediaPlayer.start();
                //mediaPlayer.release();
>>>>>>> fac04ba92abe38ecd82f6480e7189972374fe6fc
            }
        });


        // Find the TextView in the list_item.xml layout with the ID default_word
        TextView defautWordTextView = (TextView) listItemView.findViewById(R.id.default_word);
        // Get the default translation from the current word object and
        // set this text on the number TextView
        defautWordTextView.setText(currentWord.getDefaultTranslation());

        // Find the Image View in the list_item.xml layout with the ID word_image
        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.word_image);

        if(currentWord.hasImage()) {
            wordImageView.setVisibility(View.VISIBLE);
            // Get the image from current word object and set to image resource to image view
            wordImageView.setImageResource(currentWord.getImageResourceId());
        } else {
            wordImageView.setVisibility(View.GONE);
        }

        /*
        // I did it this way: Set the background color on the list item view
        listItemView.setBackgroundColor(getContext().getResources().getColor(mColorResourceId));
        */

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

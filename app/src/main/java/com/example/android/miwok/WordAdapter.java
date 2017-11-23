package com.example.android.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by brand on 11/12/2017.
 */

public class    WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects, int colorResourceId) {
        super(context, 0, objects);
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        //Get the word object located at this position in the list
        Word currentWordInList = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID numbers
        TextView miworkWordTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultWordTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image_view);

        // set this text on the miwok TextView
        miworkWordTextView.setText(currentWordInList.getMiwokTranslation());

        // set this text on the default TextView
        defaultWordTextView.setText(currentWordInList.getDefaultTranslation());

        // Check if an image is provided for this word or not
        if (currentWordInList.hasImage()) {
            //If an image is available, display the provided image based upon the resource ID
            imageView.setImageResource(currentWordInList.getImageResourceId());
            //Make sure the image is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            //Otherwise hide the ImageView (set visibility to gone)
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}

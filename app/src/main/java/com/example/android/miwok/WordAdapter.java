package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brand on 11/12/2017.
 */

public class    WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, 0, objects);
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

        // set this text on the miwok TextView
        miworkWordTextView.setText(currentWordInList.getMiwokTranslation());
        // set this text on the default TextView
        defaultWordTextView.setText(currentWordInList.getDefaultTranslation());


        return listItemView;
    }
}

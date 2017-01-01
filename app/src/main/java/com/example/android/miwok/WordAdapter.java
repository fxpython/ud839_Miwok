package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Frank on 14.12.2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.text_default);
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.text_miwok);

        defaultTranslation.setText(word.getDefaultTranslation());
        miwokTranslation.setText(word.getMiwokTranslation());

        return listItemView;
    }
}

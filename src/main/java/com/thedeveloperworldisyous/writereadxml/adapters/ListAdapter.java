package com.thedeveloperworldisyous.writereadxml.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.thedeveloperworldisyous.writereadxml.R;
import com.thedeveloperworldisyous.writereadxml.models.Film;

import java.util.List;

/**
 * Created by javiergonzalezcabezas on 11/10/15.
 */
public class ListAdapter extends BaseAdapter {
    List <Film> mListFilm;
    Context mContext;

    public ListAdapter(List<Film> mListFilm, Context mContext) {
        this.mListFilm = mListFilm;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mListFilm.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        // reuse views
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            rowView = inflater.inflate(R.layout.row_list, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.title = (TextView) rowView.findViewById(R.id.row_list_title);
            viewHolder.director = (TextView) rowView.findViewById(R.id.row_list_director);
            rowView.setTag(viewHolder);
        }

        // fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();
        holder.title.setText(mListFilm.get(position).getTitle());
        holder.director.setText(mListFilm.get(position).getDirector());

        return rowView;
    }
}

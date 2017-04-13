package com.getgood.top10;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by mvbrenes on 4/11/2017.
 */

public class FeedAdapter extends ArrayAdapter {
    private static final String TAG = "FeedAdapter";
    private final int layoutResource;
    private final LayoutInflater inflater;
    private List<FeedEntry> applications;
    private Context context;

    public FeedAdapter(@NonNull Context context, @LayoutRes int resource, List<FeedEntry> applications) {
        super(context, resource);
        this.context = context;
        this.layoutResource = resource;
        this.inflater = LayoutInflater.from(context);
        this.applications = applications;
    }

    @Override
    public int getCount() {
        return applications.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(layoutResource, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        FeedEntry entry = applications.get(position);
        viewHolder.name.setText(entry.getName());
        viewHolder.artist.setText(entry.getArtist());
        viewHolder.summary.setText(entry.getSummary());
        return convertView;
    }

    private class ViewHolder {
        final TextView name;
        final TextView artist;
        final TextView summary;

        ViewHolder(View v) {
            this.name = (TextView) v.findViewById(R.id.textViewName);
            this.artist = (TextView) v.findViewById(R.id.textViewArtist);
            this.summary = (TextView) v.findViewById(R.id.textViewSummary);
        }
    }
}

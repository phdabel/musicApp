package br.com.abelcorreadias.musicapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.models.Song;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check if the existing view is beign reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getName());

        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        songArtistTextView.setText(currentSong.getArtist());

        return listItemView;

    }

}

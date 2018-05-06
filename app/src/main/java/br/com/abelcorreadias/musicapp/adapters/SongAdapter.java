package br.com.abelcorreadias.musicapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.models.Song;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position, final View convertView, final ViewGroup parent){

        // Check if the existing view is beign reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        final TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getName());

        final TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        songArtistTextView.setText(currentSong.getArtist());

        listItemView.setOnClickListener(new View.OnClickListener(){
            public void onClick(final View v){

                Toast.makeText(getContext(),getContext().getString(R.string.now_playing_toast)+" "+songNameTextView.getText(),Toast.LENGTH_SHORT).show();

                ListView lv = (ListView)v.getParent();
                LinearLayout ll = (LinearLayout) lv.getParent();

                TextView playingSong = (TextView)ll.findViewById(R.id.playing_now_song);
                playingSong.setText(songNameTextView.getText());

                TextView playingArtist = (TextView)ll.findViewById(R.id.playing_now_artist);
                playingArtist.setText(songArtistTextView.getText());

            }
        });
        return listItemView;
    }

}

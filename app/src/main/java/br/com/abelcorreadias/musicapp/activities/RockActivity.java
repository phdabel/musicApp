package br.com.abelcorreadias.musicapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.adapters.SongAdapter;
import br.com.abelcorreadias.musicapp.models.Song;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_layout);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Number of the beast","Iron Maiden"));
        songs.add(new Song("Nothing else matters","Metallica"));
        songs.add(new Song("Full moon","Sonata Arctica"));
        songs.add(new Song("Enter Sandman","Metallica"));
        songs.add(new Song("Unforgiven","Metallica"));
        songs.add(new Song("The Trooper","Iron Maiden"));

        ImageView image = (ImageView) findViewById(R.id.song_list_image);
        image.setBackgroundResource(R.drawable.rock_genre_mod);

        TextView genreLabel = (TextView) findViewById(R.id.song_list_name);
        genreLabel.setText(getString(R.string.rock_genre));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);

    }

}


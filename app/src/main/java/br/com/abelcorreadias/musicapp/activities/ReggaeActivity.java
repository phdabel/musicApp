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

public class ReggaeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_layout);

        ImageView image = (ImageView) findViewById(R.id.song_list_image);
        image.setBackgroundResource(R.drawable.reggae_genre_mod);

        TextView genreLabel = (TextView) findViewById(R.id.song_list_name);
        genreLabel.setText(getString(R.string.reggae_genre));

    }

}

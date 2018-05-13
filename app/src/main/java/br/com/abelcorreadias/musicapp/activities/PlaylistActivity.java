package br.com.abelcorreadias.musicapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.adapters.SongAdapter;
import br.com.abelcorreadias.musicapp.data.SongData;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list_layout);

        Bundle bundle = this.getIntent().getExtras();
        ArrayList<SongData> songs = (ArrayList<SongData>)bundle.get("songs");

        ImageView image = (ImageView) findViewById(R.id.song_list_image_view);
        image.setBackgroundResource(bundle.getInt("musicalGenreImage"));

        TextView genreLabel = (TextView) findViewById(R.id.song_list_name_text_view);
        genreLabel.setText(bundle.getString("musicalGenreName"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.song_list_view);
        listView.setAdapter(adapter);

    }
}

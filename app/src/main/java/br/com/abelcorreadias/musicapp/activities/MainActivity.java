package br.com.abelcorreadias.musicapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.adapters.GenreAdapter;
import br.com.abelcorreadias.musicapp.models.Genre;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Genre> genres = new ArrayList<>();

        genres.add(new Genre(R.drawable.country_genre_mod,"Country",5));
        genres.add(new Genre(R.drawable.classic_genre_mod,"Classical",5));
        genres.add(new Genre(R.drawable.hip_hop_genre_mod,"Hip Hop",5));
        genres.add(new Genre(R.drawable.indie_genre_mod,"Indie",5));
        genres.add(new Genre(R.drawable.pop_genre_mod,"Pop",5));
        genres.add(new Genre(R.drawable.reggae_genre_mod,"Reggae",5));
        genres.add(new Genre(R.drawable.rock_genre_mod,"Rock",5));
        genres.add(new Genre(R.drawable.soul_genre_mod,"Soul",5));

        GridView gridView = (GridView) findViewById(R.id.music_genre_grid);
        gridView.setAdapter(new GenreAdapter(this,genres));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

                switch (position){
                    //country
                    case 0:
                        startActivity(new Intent(MainActivity.this, CountryActivity.class));
                        break;
                    //classical
                    case 1:
                        startActivity(new Intent(MainActivity.this, ClassicActivity.class));
                        break;
                    //hip_hop
                    case 2:
                        startActivity(new Intent(MainActivity.this, HipHopActivity.class));
                        break;
                    //indie
                    case 3:
                        startActivity(new Intent(MainActivity.this, IndieActivity.class));
                        break;
                    //pop
                    case 4:
                        startActivity(new Intent(MainActivity.this, PopActivity.class));
                        break;
                    //reggae
                    case 5:
                        startActivity(new Intent(MainActivity.this, ReggaeActivity.class));
                        break;
                    //rock
                    case 6:
                        startActivity(new Intent(MainActivity.this, RockActivity.class));
                        break;
                    //soul
                    case 7:
                        startActivity(new Intent(MainActivity.this, SoulActivity.class));
                        break;
                }
            }

        });

    }
}
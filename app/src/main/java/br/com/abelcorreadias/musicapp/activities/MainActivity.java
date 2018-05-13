package br.com.abelcorreadias.musicapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.adapters.GenreAdapter;
import br.com.abelcorreadias.musicapp.data.SongData;
import br.com.abelcorreadias.musicapp.models.Genre;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // array list of the available music genres
        ArrayList<Genre> genresList = new ArrayList<>();
        genresList.add(new Genre(this, R.drawable.country_genre_mod, getString(R.string.country_genre), 5));
        genresList.add(new Genre(this, R.drawable.classic_genre_mod, getString(R.string.classical_genre), 5));
        genresList.add(new Genre(this, R.drawable.hip_hop_genre_mod, getString(R.string.hip_hop_genre), 4));
        genresList.add(new Genre(this, R.drawable.indie_genre_mod, getString(R.string.indie_genre), 4));
        genresList.add(new Genre(this, R.drawable.pop_genre_mod, getString(R.string.pop_genre), 6));
        genresList.add(new Genre(this, R.drawable.reggae_genre_mod, getString(R.string.reggae_genre), 0));
        genresList.add(new Genre(this, R.drawable.rock_genre_mod, getString(R.string.rock_genre), 6));
        genresList.add(new Genre(this, R.drawable.soul_genre_mod, getString(R.string.soul_genre), 4));

        // defining grid view content
        GridView gridView = (GridView) findViewById(R.id.music_genre_grid_view);
        gridView.setAdapter(new GenreAdapter(this,genresList));

        // defining grid view click listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

                int musicalGenreImage = R.drawable.country_genre_mod;
                String musicalGenreName = "Country";
                ArrayList<SongData> songs = loadCountryData();

                switch (position){
                    //country
                    case 0:
                        musicalGenreImage = R.drawable.country_genre_mod;
                        musicalGenreName = "Country";
                        songs = loadCountryData();
                        break;
                    //classical
                    case 1:
                        musicalGenreImage = R.drawable.classic_genre_mod;
                        musicalGenreName = "Classical";
                        songs = loadClassicData();
                        break;
                    //hip_hop
                    case 2:
                        musicalGenreImage = R.drawable.hip_hop_genre_mod;
                        musicalGenreName = "Hip Hop";
                        songs = loadHipHopData();
                        break;
                    //indie
                    case 3:
                        musicalGenreImage = R.drawable.indie_genre_mod;
                        musicalGenreName = "Indie";
                        songs = loadIndieData();
                        break;
                    //pop
                    case 4:
                        musicalGenreImage = R.drawable.pop_genre_mod;
                        musicalGenreName = "Pop";
                        songs = loadPopData();
                        break;
                    //reggae
                    case 5:
                        musicalGenreImage = R.drawable.reggae_genre_mod;
                        musicalGenreName = "Reggae";
                        songs = loadReggaeData();
                        break;
                    //rock
                    case 6:
                        musicalGenreImage = R.drawable.rock_genre_mod;
                        musicalGenreName = "Rock";
                        songs = loadRockData();
                        break;
                    //soul
                    case 7:
                        musicalGenreImage = R.drawable.soul_genre_mod;
                        musicalGenreName = "Soul";
                        songs = loadSoulData();
                        break;
                }

                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                intent.putExtra("musicalGenreImage",musicalGenreImage);
                intent.putExtra("musicalGenreName",musicalGenreName);
                Bundle bundle = new Bundle();
                bundle.putSerializable("songs",songs);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });


    }

    /**  private methods to load songs data */

    private ArrayList<SongData> loadCountryData(){

        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("I walk the line", "Johny Cash"));
        data.add(new SongData("Friends in low places", "The sounds of Garth Brooks"));
        data.add(new SongData("Jolene", "Dolly Parton"));
        data.add(new SongData("Choices", "George Jones"));
        data.add(new SongData("I hope you dance", "Lee Ann Womack"));

        return data;

    }

    private ArrayList<SongData> loadClassicData(){

        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("Turkish March", "Wolfgang Amadeus Mozart"));
        data.add(new SongData("Magic Flute", "Wolfgang Amadeus Mozart"));
        data.add(new SongData("Nocturne", "Chopin"));
        data.add(new SongData("Moonlight Sonata", "Beethoven"));
        data.add(new SongData("Clair de Lune", "Claude Debussy"));

        return data;
    }

    private ArrayList<SongData> loadHipHopData(){

        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("Ye Vs. The People", "Kanye West feat. T.I."));
        data.add(new SongData("ATM", "J. Cole"));
        data.add(new SongData("Chun Li", "Nicki Minaj"));
        data.add(new SongData("Nice for what", "Drake"));

        return data;
    }

    private ArrayList<SongData> loadIndieData(){

        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("Safe and sound", "Capital Cities"));
        data.add(new SongData("Cara de vilão", "Cartolas"));
        data.add(new SongData("Come together", "Echosmith"));
        data.add(new SongData("Cool Kids", "Echosmith"));


        return data;

    }

    private ArrayList<SongData> loadPopData(){

        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("Perfect", "One Direction"));
        data.add(new SongData("Sugar", "Maroon 5"));
        data.add(new SongData("Confident", "Demi Lovato"));
        data.add(new SongData("Focus", "Ariana Grande"));
        data.add(new SongData("Same old love", "Selena Gomez"));
        data.add(new SongData("Stressed out", "Twenty One Pilots"));

        return data;
    }

    private ArrayList<SongData> loadReggaeData(){

        ArrayList<SongData> data = new ArrayList<>();

        return data;
    }

    private ArrayList<SongData> loadRockData(){
        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("Number of the beast", "Iron Maiden"));
        data.add(new SongData("Nothing else matters", "Metallica"));
        data.add(new SongData("Full moon", "Sonata Arctica"));
        data.add(new SongData("Enter Sandman", "Metallica"));
        data.add(new SongData("Unforgiven", "Metallica"));
        data.add(new SongData("The Trooper", "Iron Maiden"));

        return data;
    }

    private ArrayList<SongData> loadSoulData(){
        ArrayList<SongData> data = new ArrayList<>();
        data.add(new SongData("What\'s going on", "Marvin Gaye"));
        data.add(new SongData("Let\'s stay together", "Al Green"));
        data.add(new SongData("If you don\'t know me by now", "Harold Melvin & The Blue Notes"));
        data.add(new SongData("Just my imagination (Running away with me)", "The temptations"));

        return data;
    }

}

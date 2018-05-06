package br.com.abelcorreadias.musicapp.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.models.Genre;
import br.com.abelcorreadias.musicapp.models.Song;

public class GenreAdapter extends ArrayAdapter<Genre> {


    private static final String LOG_TAG = GenreAdapter.class.getSimpleName();

    /**
     * Constructor of the GenreAdapter
     *
     * @param context
     * @param genres
     */
    public GenreAdapter(Activity context, ArrayList<Genre> genres){
        super(context,0,genres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check if the existing view is beign reused, otherwise inflate the view
        View itemGridView = convertView;
        if(itemGridView == null){
            itemGridView = LayoutInflater.from(getContext()).inflate(R.layout.genre_item, parent, false);
        }

        // Get the {@link Genre} object located at this position in the list
        Genre currentGenre = getItem(position);

        ImageView itemImage = (ImageView) itemGridView.findViewById(R.id.item_image);
        itemImage.setImageResource(currentGenre.getImageResource());

        TextView itemName = (TextView) itemGridView.findViewById(R.id.item_name);
        itemName.setText(currentGenre.getGenreName());

        TextView itemTotalSongs = (TextView) itemGridView.findViewById(R.id.item_total_songs);
        itemTotalSongs.setText(currentGenre.getNumberOfSongs());

        return itemGridView;
    }



}

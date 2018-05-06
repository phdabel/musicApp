package br.com.abelcorreadias.musicapp.models;

import br.com.abelcorreadias.musicapp.R;
import br.com.abelcorreadias.musicapp.activities.MainActivity;


public class Genre {

    /**
     *  Variables for:
     *  image resource
     *  name of the musical genre
     *  current amount of songs for a given musical genre
     */
    private int imageResource;
    private String name;
    private int numberOfSongs;


    /**
     * Constructor
     *
     * @param resourceImage int related with the image resource
     * @param name name of the genre
     * @param numberOfSongs  total of songs for the genre
     */
    public Genre(int resourceImage, String name, int numberOfSongs){
        this.imageResource = resourceImage;
        this.name = name;
        this.numberOfSongs = numberOfSongs;
    }

    /**
     * Returns the name of a given musical genre.
     *
     * @return
     */
    public String getGenreName(){
        return this.name;
    }

    /**
     * Returns a string to indicate the amount of songs of a given musical genre.
     *
     * @return
     */
    public String getNumberOfSongs(){
        if(this.numberOfSongs <= 1){
            return new Integer(this.numberOfSongs).toString()+" "+MainActivity.mainActivity.getString(R.string.song_label);
        }else{
            return new Integer(this.numberOfSongs).toString()+" "+MainActivity.mainActivity.getString(R.string.songs_label);
        }

    }

    /**
     * Sets a new value for numberOfSongs variable of a given musical genre.
     *
     * @param numberOfSongs new number of songs
     */
    public void setNumberOfSongs(int numberOfSongs){
        this.numberOfSongs = numberOfSongs;
    }

    /**
     * Returns the image resource related with a given musical genre.
     * @return
     */
    public int getImageResource(){
        return this.imageResource;
    }

}

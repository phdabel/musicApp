package br.com.abelcorreadias.musicapp.models;

public class Song {

    /**
     * Variables for name and artist/band
     */
    private String name;
    private String artist;

    /**
     * Class constructor
     * @param name
     * @param artist
     */
    public Song(String name, String artist){
        this.name = name;
        this.artist = artist;
    }

    /**
     * Returns the name of the song
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the name of the artist/band
     *
     * @return
     */
    public String getArtist(){
        return this.artist;
    }


}

public class Song {
    private String song, artist, album, genre;
    private int sec, year;

    public Song(String son, String art, String alb, int se, int yr, String ge){
        song = son;
        artist = art;
        album = alb;
        sec = se;
        year = yr;
        genre = ge;
    }

    /**
     * Returns a formatted string containing all song information
     * @return formatted song details
     */
    public String toString(){
        return String.format("%-25s %-20s %-30s %-8d %-8d %-12s", song, artist, album, sec, year, genre);
    }

    /**
     * Gets the artist of the song
     * @return the artist name
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the release year of the song
     * @return the year the song was released
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the genre of the song
     * @return the song genre
     */
    public String getGenre() {
        return genre;
    }
}
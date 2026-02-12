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

    public String toString(){
        return String.format("%-12s %-20s %-10s %-8d %-8d %-6.1s", song, artist, album, sec, year, genre);
    }
}

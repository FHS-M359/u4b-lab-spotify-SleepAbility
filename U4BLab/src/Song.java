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

    public String getSong() {
        return song;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getSec() {
        return sec;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

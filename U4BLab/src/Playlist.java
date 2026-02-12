import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Song> playlist;
    public static void main() throws IOException {
        Scanner file = new Scanner(new File("spotify_unique_years_artists.txt"));
        ArrayList<Song> playlist = new ArrayList<>();

        while(file.hasNextLine()){
            String line = file.nextLine();
            String[] parts = line.split(",");

            String song = parts[0];
            String artist = parts[1];
            String album = parts[2];
            int sec = Integer.parseInt(parts[3]);
            int year = Integer.parseInt(parts[4]);
            String genre = parts[5];

            playlist.add(new Song(song, artist, album, sec, year, genre));
        }
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }
}

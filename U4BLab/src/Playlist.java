import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private static ArrayList<Song> playlist;
    public Playlist(){
        playlist = new ArrayList<>();
    }

    public static void linearSearch() throws IOException {
        Scanner file = new Scanner(new File("spotify_unique_years_artists.txt"));

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
        file.close();
    }

    public String toString() {
        String header = String.format("%-25s %-20s %-20s %-8s %-8s %-15s\n", "Title", "Artist", "Album", "Seconds", "Year", "Genre");
        String line = "-----------------------------------------------------------------------------------------------\n";
        String result = "";
        for(Song s : playlist){
            result += s.toString() + "\n";
        }
        return header + line + result;
    }
}

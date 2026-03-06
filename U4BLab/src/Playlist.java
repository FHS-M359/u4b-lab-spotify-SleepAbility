import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    private ArrayList<Song> playlist;
    public Playlist(){
        playlist = new ArrayList<>();
    }

    /**
     * Reads song data from a file and loads it into the playlist ArrayList
     * @throws IOException if file not found
     */
    public void loadSongs() throws IOException {
        Scanner file = new Scanner(new File("U4BLab/spotify_unique_years_artists.txt"));

        //reads each line of the file and convert it into a Song object
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

    /**
     * Sorts playlist alphabetically in ascending order (A-Z) by artist
     * Uses selection sort
     */
    public void sortArtistAZ() {
        for(int i = 0; i < playlist.size() - 1; i++){
            int min = i;

            //search remaining list for smaller artist name
            for(int j = i + 1; j < playlist.size(); j++){
                if(playlist.get(j).getArtist().compareToIgnoreCase(playlist.get(min).getArtist()) < 0){
                    min = j;
                }
            }

            //swap songs
            Song temp = playlist.get(i);
            playlist.set(i, playlist.get(min));
            playlist.set(min, temp);
        }
    }

    /**
     * Sorts playlist alphabetically in descending order (Z-A) by artist
     * Also uses selection sort
     */
    public void sortArtistZA() {
        for(int i = 0; i < playlist.size() - 1; i++){
            int max = i;

            //find largest artist name in remaining list
            for(int j = i + 1; j < playlist.size(); j++){
                if(playlist.get(j).getArtist().compareToIgnoreCase(playlist.get(max).getArtist()) > 0){
                    max = j;
                }
            }

            //swap songs
            Song temp = playlist.get(i);
            playlist.set(i, playlist.get(max));
            playlist.set(max, temp);
        }
    }

    /**
     * Sorts playlist in ascending order (oldest to newest) by release year
     * Uses insertion sort
     */
    public void sortYearOldNew() {
        for(int i = 1; i < playlist.size(); i++){
            Song key = playlist.get(i);
            int j = i - 1;

            //shift larger years right
            while(j >= 0 && playlist.get(j).getYear() > key.getYear()){
                playlist.set(j + 1, playlist.get(j));
                j--;
            }

            //insert song in correct index of the playlist ArrayList
            playlist.set(j + 1, key);
        }
    }

    /**
     * Sorts playlist in descending order (newest to oldest) by release year
     * Also uses insertion sort
     */
    public void sortYearNewOld() {
        for(int i = 1; i < playlist.size(); i++){
            Song key = playlist.get(i);
            int j = i - 1;

            //shift smaller years right
            while(j >= 0 && playlist.get(j).getYear() < key.getYear()){

                playlist.set(j + 1, playlist.get(j));
                j--;
            }

            //insert song in correct index of the playlist ArrayList
            playlist.set(j + 1, key);
        }
    }

    /**
     * Performs a linear search to find all songs of a specific genre
     * @param genre the genre to search for
     */
    public void searchGenre(String genre){
        boolean found = false;
        for(Song s : playlist){

            //check if the song's genre matches the user's input
            if(s.getGenre().equalsIgnoreCase(genre)){
                System.out.println(s);
                found = true;
            }
        }
        if(!found){
            System.out.println("No songs found in that genre.");
        }
    }

    /**
     * Returns a formatted string containing a header, a line separating the header and playlist, and all songs information in the playlist
     * @return complete formatted spotify menu
     */
    public String toString() {
        String header = String.format("%-25s %-20s %-30s %-8s %-8s %-12s\n", "Title", "Artist", "Album", "Seconds", "Year", "Genre");
        String line = "-----------------------------------------------------------------------------------------------\n";
        String result = "";
        for(Song s : playlist){
            result += s.toString() + "\n";
        }
        return header + line + result;
    }
}
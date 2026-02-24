import java.io.IOException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Playlist p = new Playlist();
        p.linearSearch();
        System.out.println("================= Music Menu =================");
        System.out.println("1 - Sort by artists (A-Z)");
        System.out.println("2 - Sort by artists (Z-A)");
        System.out.println("3 - Sort by years (oldest-newest)");
        System.out.println("4 - Sort by years (newest-oldest)");
        System.out.println("5 - Sort by genres");
        System.out.println("6 - Display all songs");
        System.out.println("7 - Quit");
        System.out.println("Enter choice (1-7): ");
        int choice = scan.nextInt();
        if(choice == 1){
            p.sortArtistAZ();
        }
        if(choice == 2){
            p.sortArtistZA();
        }
        if(choice == 3){

        }
        if(choice == 4){

        }
        if(choice == 5){
            System.out.println("Enter the genre you like to sort by:");
            String sort = scan.nextLine();
            p.sortGenre(sort);
        }
        if(choice == 6){
            String header = String.format("%-22s %-20s %-10s %-6s %-8s %-15s", "Title", "Developer", "Platform", "Year", "Price", "Genre");
            String line = "-------------------------------------------------------------------------------------";
            System.out.println(header + "\n" + line);
            System.out.println(p.toString());
        }
        if(choice == 7){

        }
    }
}

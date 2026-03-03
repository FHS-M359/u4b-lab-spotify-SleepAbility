import java.io.IOException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Playlist p = new Playlist();
        p.linearSearch();
        int choice = 0;
        while(choice != 7){
            try{
                System.out.println("==================== Music Menu ====================");
                System.out.println("1 - Sort by artists (A-Z)");
                System.out.println("2 - Sort by artists (Z-A)");
                System.out.println("3 - Sort by years (oldest-newest)");
                System.out.println("4 - Sort by years (newest-oldest)");
                System.out.println("5 - Sort by genres");
                System.out.println("6 - Display all songs");
                System.out.println("7 - Quit");
                System.out.println("Enter choice (1-7): ");
                choice = scan.nextInt();
                if(choice == 1){
                    p.sortArtistAZ();
                    System.out.println(p);
                }
                else if(choice == 2){
                    p.sortArtistZA();
                    System.out.println(p);
                }
                else if(choice == 3){
                    p.sortYearOldNew();
                    System.out.println(p);
                }
                else if(choice == 4){
                    p.sortYearNewOld();
                    System.out.println(p);
                }
                else if(choice == 5){
                    scan.nextLine();
                    System.out.println("Enter the genre you like to sort by:");
                    String g = scan.nextLine();
                    p.sortGenre(g);
                }
                else if(choice == 6){
                    System.out.println(p);
                }
                else if(choice == 7){
                    scan.close();
                }
                else{
                    System.out.println("Invalid choice, please choose a number between 1-7.");
                }

            }
            catch (Exception e) {
                System.out.println("Invalid input, enter a number between 1-7.");
                scan.nextLine();
            }
        }
        scan.close();
    }
}
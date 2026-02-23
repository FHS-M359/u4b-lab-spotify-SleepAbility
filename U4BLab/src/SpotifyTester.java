import java.io.IOException;
import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Playlist p = new Playlist();
        p.linearSearch();
        System.out.println("================= Music Menu =================");
        System.out.println("1 - Sort By Artist (A-Z)");
        System.out.println("2 - Sort By Artist (Z-A)");
        System.out.println("3 - Sort By Year (oldest-newest)");
        System.out.println("4 - Sort By Year (newest-oldest)");
        System.out.println("5 - Sort By Genre");
        System.out.println("6 - Display All Songs");
        System.out.println("7 - Quit");
        System.out.println("Enter choice (1-7): ");
        int idk = scan.nextInt();
        if(idk = 1){
            System.out.println(p.toString());
        }








        String header = String.format("%-22s %-20s %-10s %-6s %-8s %-15s", "Title", "Developer", "Platform", "Year", "Price", "Genre");
        String line = "-------------------------------------------------------------------------------------";
        System.out.println(header + "\n" + line);
        System.out.println(p.toString());
    }
}

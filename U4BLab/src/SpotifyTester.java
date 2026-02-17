import java.util.Scanner;

public class SpotifyTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("================= Music Menu =================");
        System.out.println("1 - Sort By Artist (A-Z)");
        System.out.println("2 - Sort By Artist (Z-A)");
        System.out.println("3 - Sort By Year (oldest-newest)");
        System.out.println("4 - Sort By Year (newest-oldest)");
        System.out.println("5 - Sort By Genre");
        System.out.println("6 - Display All Songs");
        System.out.println("7 - Quit");
        System.out.println("Enter choice (1-7): ");
        int choice = scan.nextInt();






        String header = String.format("%-22s %-20s %-10s %-6s %-8s %-15s", "Title", "Developer", "Platform", "Year", "Price", "Genre");
        String line = "-------------------------------------------------------------------------------------";
        System.out.println(header + "\n" + line);
        for(Playlist p : Song){
            System.out.println(p);
        }
    }
}

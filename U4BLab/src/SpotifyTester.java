public class SpotifyTester {
    public static void main(String[] args){
        String header = String.format("%-22s %-20s %-10s %-6s %-8s %-15s", "Title", "Developer", "Platform", "Year", "Price", "Genre");
        String line = "-------------------------------------------------------------------------------------";
        System.out.println(header + "\n" + line);
        for(VideoGame g : games){
            System.out.println(g);
        }


    }
}

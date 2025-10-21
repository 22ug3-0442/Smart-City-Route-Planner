import java.util.Scanner;

public class Management {
    private Scanner sc = new Scanner(System.in);

    public void addLocation(Graph graph) {
        System.out.print("Enter new location name: ");
        String loc = sc.nextLine();
        graph.addVertex(loc);
    }

    public void removeLocation(Graph graph) {
        System.out.print("Enter location to remove: ");
        String loc = sc.nextLine();
        graph.removeVertex(loc);
    }

    public void addRoad(Graph graph) {
        System.out.print("Enter starting location: ");
        String src = sc.nextLine();
        System.out.print("Enter destination location: ");
        String dest = sc.nextLine();
        graph.addEdge(src, dest);
    }

    public void removeRoad(Graph graph) {
        System.out.print("Enter starting location: ");
        String src = sc.nextLine();
        System.out.print("Enter destination location: ");
        String dest = sc.nextLine();
        graph.removeEdge(src, dest);
    }
}
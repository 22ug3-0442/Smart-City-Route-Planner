import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph cityGraph = new Graph();
        LinkedList cityList = new LinkedList();
        Management manage = new Management();

        while (true) {
            System.out.println("\n--- Smart City Route Planner ---");
            System.out.println("1. Add a new location");
            System.out.println("2. Remove a location");
            System.out.println("3. Add a road between locations");
            System.out.println("4. Remove a road");
            System.out.println("5. Display all connections");
            System.out.println("6. Display all locations (linked list)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    manage.addLocation(cityGraph);
                    break;
                case "2":
                    manage.removeLocation(cityGraph);
                    break;
                case "3":
                    manage.addRoad(cityGraph);
                    break;
                case "4":
                    manage.removeRoad(cityGraph);
                    break;
                case "5":
                    cityGraph.displayConnections();
                    break;
                case "6":
                    for (String loc : cityGraph.getLocations()) {
                        cityList.insert(loc);
                    }
                    cityList.display();
                    break;
                case "7":
                    System.out.println("Exiting Smart City Route Planner...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1–7.");
                    break;
            }
        }
    }
}
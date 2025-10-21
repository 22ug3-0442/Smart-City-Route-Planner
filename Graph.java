import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<String, List<String>> graph;

    public Graph() {
        graph = new HashMap<>();
    }
    //This is a test commit

    public void addVertex(String vertex) {
        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
            System.out.println("Location added: " + vertex);
        } else {
            System.out.println("Location already exists!");
        }
    }

    public void addEdge(String src, String dest) {
        if (graph.containsKey(src) && graph.containsKey(dest)) {
            graph.get(src).add(dest);
            graph.get(dest).add(src);
            System.out.println("Road added between " + src + " and " + dest);
        } else {
            System.out.println("One or both locations not found!");
        }
    }

    public void removeVertex(String vertex) {
        if (graph.containsKey(vertex)) {
            graph.remove(vertex);
            for (List<String> list : graph.values()) {
                list.remove(vertex);
            }
            System.out.println("Location removed: " + vertex);
        } else {
            System.out.println("Location not found!");
        }
    }

    public void removeEdge(String src, String dest) {
        if (graph.containsKey(src) && graph.get(src).contains(dest)) {
            graph.get(src).remove(dest);
            graph.get(dest).remove(src);
            System.out.println("Road removed between " + src + " and " + dest);
        } else {
            System.out.println("No such road exists!");
        }
    }

    public void displayConnections() {
        System.out.println("\n--- City Connections ---");
        for (String location : graph.keySet()) {
            System.out.println(location + " --> " + graph.get(location));
        }
    }

    public Set<String> getLocations() {
        return graph.keySet();
    }
}

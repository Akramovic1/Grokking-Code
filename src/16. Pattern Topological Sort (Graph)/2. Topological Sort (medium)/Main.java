import java.util.*;

public class Main {
    public List<Integer> topologicalSort(int vertices, int[][] edges) {
        Map <Integer, Integer> inEdges = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < vertices; i++){
            inEdges.put(i, 0);
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++){
            int parent = edges[i][0], child = edges[i][1];
            graph.get(parent).add(child);
            inEdges.put(child, inEdges.get(child) + 1);
        }
        Queue<Integer> sources = new LinkedList<>();
        for(Map.Entry<Integer, Integer> e : inEdges.entrySet()){
            if (e.getValue() == 0)
                sources.add(e.getKey());
        }
        List<Integer> orderedSort = new ArrayList<>();
        while (!sources.isEmpty()){
            int vertex = sources.poll();
            orderedSort.add(vertex);
            List<Integer> children = graph.get(vertex);
            for (int child : children){
                inEdges.put(child, inEdges.get(child) - 1);
                if (inEdges.get(child) == 0)
                    sources.add(child);
            }
        }
        if (orderedSort.size() != vertices)
            return new ArrayList<>();

        return orderedSort;
    }

    public static void main(String[]args){

    }
}

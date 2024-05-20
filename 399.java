import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] out = new double[queries.size()];
        Map<String, HashMap<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            List<String> equation = equations.get(i);
            double answer = values[i];

            if (!graph.containsKey(equation.get(0))) {
                graph.put(equation.get(0), new HashMap<String, Double>());
            }
            graph.get(equation.get(0)).put(equation.get(1), answer);

            if (!graph.containsKey(equation.get(1))) {
                graph.put(equation.get(1), new HashMap<String, Double>());
            }
            graph.get(equation.get(1)).put(equation.get(0), 1.0/answer);
        }
        Set<String> visitedSet = new HashSet<>();
        System.out.println(graph);
        return out;
    }
    private double dfs(String from, String to, double answer, Map<String, HashMap<String, Double>> graph, Set<Stirng> visitedSet) {
        Set<String> neighbors = graph.get(from).keySet();
        for (String neighbor : neighbors) {
            if (!visitedSet.contains(neighbor)) {
                if (neighbor.equals(to)) {
                    return answer * graph.get(from).get(neighbor);
                } else {
                    visitedSet.add(neighbor);
                    double result = dfs(neighbor, to, answer * graph.get(from).get(neighbor), graph, visitedSet);
                    if (result != -0.1) {
                        return result;
                    }
                }
            }
            
        }
        return -0.1;
    }

}
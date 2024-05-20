import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        // map is a graph
        // perform DFS
        Set<Integer> visitedSet = new HashSet<>();
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (!visitedSet.contains(i)) {
                dfs(i, map, visitedSet);
                provinces++;
            }
        }
        return provinces;
    }

    // dfs that puts whatever is connected into the visitedSet
    private void dfs(int i, Map<Integer, List<Integer>> map, Set<Integer> visitedSet) {
        visitedSet.add(i);
        List<Integer> neighbors = map.get(i);
        for (int neighbor : neighbors) {
            if (!visitedSet.contains(neighbor)) {
                dfs(neighbor, map, visitedSet);
            }
        }
    }
}
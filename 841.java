import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.management.Query;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null) {
            return false;
        }
        Queue<List<Integer>> queue = new LinkedList<>();
        Set<Integer> visitedSet = new HashSet<>();
        // List<List<Integer>> out = new ArrayList<>();
        queue.add(rooms.get(0));
        visitedSet.add(0);
        
        List<Integer> tempRoom;
        List<Integer> neighborRoom;
        while (!queue.isEmpty()) {
            tempRoom = queue.poll();
            // out.add(tempRoom);
            for (Integer roomNumber : tempRoom) {
                neighborRoom = rooms.get(roomNumber);
                if (!visitedSet.contains(roomNumber)) {
                    // System.out.println(roomNumber);
                    queue.add(neighborRoom);
                    visitedSet.add(roomNumber);
                }
            }
        }
        // System.out.println(visitedSet);
        return visitedSet.size() == rooms.size();
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height = triangle.size();
        if (height == 1) {
            return(triangle.get(0).get(0));
        }
        int[][] newTriangle = new int[height][];
        newTriangle[0] = new int[] {triangle.get(0).get(0)};
        newTriangle[1] = new int[] {triangle.get(1).get(0) + triangle.get(0).get(0), triangle.get(1).get(1) + triangle.get(0).get(0)};
        for (int i = 2; i < height; i++) {
            // System.out.println(triangle.get(i).size());
            int[] temp = new int[triangle.get(i).size()];
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // System.out.println(i + " " + j);
                if (j == 0) {
                    temp[j] = triangle.get(i).get(j) + newTriangle[i-1][j];
                } else if (j == triangle.get(i).size() - 1) {
                    temp[j] = triangle.get(i).get(j) + newTriangle[i-1][j-1];
                } else {
                    temp[j] = Math.min(triangle.get(i).get(j) + newTriangle[i-1][j], triangle.get(i).get(j) + newTriangle[i-1][j-1]);
                }
            }
            newTriangle[i] = temp;
        }
        int min = newTriangle[newTriangle.length - 1][0];
        for (int num : newTriangle[newTriangle.length - 1]) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}